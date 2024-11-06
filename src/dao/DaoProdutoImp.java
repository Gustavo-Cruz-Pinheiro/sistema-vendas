package dao;

import conexao.Conexao;
import java.sql.*;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Produto;

public class DaoProdutoImp implements DaoProduto {

    Connection con = null;
    PreparedStatement pstm = null;

    @Override
    public void excluir(int idProd) {
        int op = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir o registo" + idProd, "Excluir", JOptionPane.YES_NO_OPTION);
        if (op == 0) {
            con = new Conexao().getConnection();

            String del = "DELETE FROM tb_produto WHERE idProd=?";
            try {
                pstm = con.prepareStatement(del);
                pstm.setInt(1, idProd);
                pstm.execute();
                pstm.close();
            } catch (SQLException delet) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir " + delet + " SQL " + del);
            } finally {
                try {
                    con.close();
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao com o banco " + erro);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada");
        }
    }

    @Override
    public void alterar(Produto produto) {
        con = new Conexao().getConnection();

        String atual = "UPDATE tb_produto SET valor=?, qtdProd=?, marca=?, descricao=?, modelo=? WHERE idProd=?";
        try {
            pstm = con.prepareStatement(atual);

            pstm.setFloat(1, produto.getValor());
            pstm.setInt(2, produto.getQtdProd());
            pstm.setString(3, produto.getMarca());
            pstm.setString(4, produto.getDescricao());
            pstm.setString(5, produto.getModelo());
            pstm.setInt(6, produto.getIdProd());
            pstm.execute();
            pstm.close();
        } catch (SQLException atualizar) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + atualizar + " SQL " + atual);
        } finally {
            try {
                con.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão" + erro);
            }
        }
    }

    @Override
    public void salvar(Produto produto) {
        con = new Conexao().getConnection();
        String inserir = "INSERT INTO tb_produto(valor, qtdProd, marca, descricao, modelo) VALUES (?, ?, ?, ?, ?)";
        try {
            pstm = con.prepareStatement(inserir);
            pstm.setFloat(1, produto.getValor());
            pstm.setInt(2, produto.getQtdProd());
            pstm.setString(3, produto.getMarca());
            pstm.setString(4, produto.getDescricao());
            pstm.setString(5, produto.getModelo());
            pstm.execute();
            pstm.close();
        } catch (SQLException insert) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir" + insert + "SQL" + inserir);
        } finally {
            try {
                con.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao Deconectar" + erro);
            }
        }

    }

    @Override
    public List<Produto> getProdutos() {
        ResultSet rs = null;
        List<Produto> lista = new ArrayList<>();

        con = new Conexao().getConnection();

        try {
            pstm = con.prepareStatement("SELECT * FROM tb_produto");
            rs = pstm.executeQuery();
            rs.first();
            do {
                Produto produto = new Produto();

                produto.setIdProd(rs.getInt("idProd"));
                produto.setValor(rs.getFloat("valor"));
                produto.setQtdProd(rs.getInt("qtdProd"));
                produto.setMarca(rs.getString("marca"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setModelo(rs.getString("modelo"));

                lista.add(produto);
            } while (rs.next());
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Ainda não existem registros cadastrados nesta base de dados " + erro);
        } finally {
            try {
                con.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar " + erro);
            }
        }

        return lista;
    }

    ResultSet rs = null;

}
