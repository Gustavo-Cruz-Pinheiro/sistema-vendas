package eletroinfo;

import dao.DaoUsuarioImp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FrmLogin;

public class Eletroinfo {

    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<Usuario>();
        DaoUsuarioImp dao = new DaoUsuarioImp();

        lista = dao.getUsuarios();

        if (lista.isEmpty()) {
            Usuario user = new Usuario();
            user.setIdUsu(1);
            user.setQtdacesso(1);
            user.setStatus(1);
            user.setNome("admin");
            user.setSenha("admin");
            user.setEmail("admin@gmail.com");
            dao.salvar(user);

            JOptionPane.showMessageDialog(null, "Um usuário padrão foi criado: "
                    + "\n Status: Administrador"
                    + "\n Nome: admin"
                    + "\n Senha: admin"
                    + "\n Email: admin@gmail.com"
            );
        }

        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }

}
