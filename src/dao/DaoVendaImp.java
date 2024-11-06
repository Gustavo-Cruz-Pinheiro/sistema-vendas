package dao;

import conexao.Conexao;
import java.sql.*;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Venda;

public class DaoVendaImp implements DaoVenda {

    Connection con = null;
    PreparedStatement pstm = null;

    public void salvar(Venda venda) {
        con = new Conexao().getConnection();
        String inserir = "INSERT INTO tb_venda (qtdVenda, idProd) VALUES (?, ?)";
        try {
            pstm = con.prepareStatement(inserir);
            pstm.setInt(1, venda.getQtdVenda());
            pstm.setInt(2, venda.getIdProd());
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

    public List<Venda> getVendas() {
        List<Venda> lista = new ArrayList<Venda>();
        ResultSet rs = null;

        con = new Conexao().getConnection();

        try {
            pstm = con.prepareStatement("select * from tb_venda");
            rs = pstm.executeQuery();
            rs.first();
            do {
                Venda venda = new Venda();

                venda.setIdVenda(rs.getInt("idVenda"));
                venda.setQtdVenda(rs.getInt("qtdVenda"));
                venda.setIdProd(rs.getInt("idProd"));

                lista.add(venda);

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
