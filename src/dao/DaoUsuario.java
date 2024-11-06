package dao;

import model.Usuario;
import java.util.List;

public interface DaoUsuario {

    public void salvar(Usuario usuario);

    public void alterar(Usuario usuario);

    public void atualizarQtdacesso(Usuario usuario);

    public void excluir(int idUsu);

    public List<Usuario> getUsuarios();
}
