package controller;

import dao.DaoUsuario;
import dao.DaoUsuarioImp;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;

public class ControllerUsuario {

    DaoUsuario dao;

    public ControllerUsuario() {
        dao = new DaoUsuarioImp();
    }

    public void inserirUsuario(Usuario usuario) {
        if (usuario != null && usuario.getStatus() != -1 && !usuario.getNome().equals("") && !usuario.getSenha().equals("")
                && !usuario.getEmail().equals("")&& usuario.getQtdacesso()!= -1) {
            dao.salvar(usuario);
            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatóris");
        }
    }

    public List<Usuario> getUsuarios() {
        return dao.getUsuarios();
    }

    public void atualizarUsuario(Usuario usuario) {
        if (usuario != null && usuario.getStatus() != -1 && !usuario.getNome().equals("") && !usuario.getSenha().equals("") && !usuario.getEmail().equals("")) {
            dao.alterar(usuario);
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios");
        }
    }

    public void deletarUsuario(int idUsu) {
        if (idUsu != 0) {
            dao.excluir(idUsu);
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios");
        }
    }

}
