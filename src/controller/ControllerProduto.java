package controller;

import dao.DaoProdutoImp;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;
import dao.DaoProduto;

public class ControllerProduto {

    DaoProduto dao;

    public ControllerProduto() {
        dao = new DaoProdutoImp();
    }

    public void inserirProduto(Produto produto) {
        if (produto != null && produto.getValor() != -1 && produto.getQtdProd() != -1 && !produto.getMarca().equals("") &&
                !produto.getDescricao().equals("") && !produto.getModelo().equals("")) {
            dao.salvar(produto);
            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios");
        }
    }

    public List<Produto> getProdutos() {
        return dao.getProdutos();
    }

    public void atualizarProduto(Produto produto) {
        if (produto != null && produto.getValor() != -1 && produto.getQtdProd() != -1 && !produto.getMarca().equals("") &&
                !produto.getDescricao().equals("") && !produto.getModelo().equals("")) {
            dao.alterar(produto);
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios");
        }
    }

    public void deletarProduto(int idProd) {
        if (idProd != 0) {
            dao.excluir(idProd);
            JOptionPane.showMessageDialog(null, "Prduto excluído com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios");
        }
    }
}
