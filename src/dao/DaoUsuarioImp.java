package dao;

import conexao.Conexao;
import java.sql.*;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario;

public class DaoUsuarioImp implements DaoUsuario {

    Connection con = null;
    PreparedStatement pstm = null;

    @Override
    public void excluir(int idUsu) {
        int op = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir o registo de idUsu" + idUsu, "Excluir", JOptionPane.YES_NO_OPTION);
        if (op == 0) {
            con = new Conexao().getConnection();

            String del = "DELETE FROM tb_usuario WHERE idUsu=?";
            try {
                pstm = con.prepareStatement(del);
                pstm.setInt(1, idUsu);
                pstm.execute();
                pstm.close();
            } catch (SQLException delet) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir " + delet + " SQL " + del);
            } finally {
                try {
                    con.close();
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao com o banco!" + erro);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada");
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        con = new Conexao().getConnection();

        String atual = "UPDATE tb_usuario SET status=?, nome=?, senha=?, email=? where idUsu=?";
        try {
            pstm = con.prepareStatement(atual);
            pstm.setInt(1, usuario.getStatus());
            pstm.setString(2, usuario.getNome());
            pstm.setString(3, usuario.getSenha());
            pstm.setString(4, usuario.getEmail());
            pstm.setInt(5, usuario.getIdUsu());
            pstm.execute();
            pstm.close();
        } catch (SQLException atualizar) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar!" + atualizar + " SQL " + atual);
        } finally {
            try {
                con.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!" + erro);
            }
        }
    }

    @Override
    public void atualizarQtdacesso(Usuario usuario) {
        con = new Conexao().getConnection();

        String atual = "UPDATE tb_usuario SET qtdacesso=? where idUsu=?";
        try {
            pstm = con.prepareStatement(atual);
            pstm.setInt(1, usuario.getQtdacesso());
            pstm.setInt(2, usuario.getIdUsu());
            pstm.execute();
            pstm.close();
        } catch (SQLException atualizar) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar!" + atualizar + " SQL " + atual);
        } finally {
            try {
                con.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!" + erro);
            }
        }
    }

    @Override
    public void salvar(Usuario usuario) {
        con = new Conexao().getConnection();
        String inserir = "INSERT INTO tb_usuario(qtdacesso, status, nome, senha, email) VALUES (?, ?, ?, ?, ?)";
        try {
            pstm = con.prepareStatement(inserir);
            pstm.setInt(1, usuario.getQtdacesso());
            pstm.setInt(2, usuario.getStatus());
            pstm.setString(3, usuario.getNome());
            pstm.setString(4, usuario.getSenha());
            pstm.setString(5, usuario.getEmail());
            pstm.execute();
            pstm.close();
        } catch (SQLException insert) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir " + insert + " SQL " + inserir);
        } finally {
            try {
                con.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao Deconectar" + erro);
            }
        }
    }
    
    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> lista = new ArrayList<Usuario>();
        ResultSet rs = null;

        con = new Conexao().getConnection();

        try {
            pstm = con.prepareStatement("select * from tb_usuario");
            rs = pstm.executeQuery();
            rs.first();
            do {
                Usuario usuario = new Usuario();

                usuario.setIdUsu(rs.getInt("idUsu"));
                usuario.setQtdacesso(rs.getInt("qtdacesso"));
                usuario.setStatus(rs.getInt("status"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));

                lista.add(usuario);

            } while (rs.next());
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados " + erro);
        } finally {
            try {
                con.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar " + erro);
            }
        }

        return lista;
    }
}
