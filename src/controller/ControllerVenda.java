package controller;

import dao.DaoVenda;
import dao.DaoVendaImp;
import java.util.List;
import javax.swing.JOptionPane;
import model.Venda;

public class ControllerVenda {

    DaoVenda dao;

    public ControllerVenda() {
        dao = new DaoVendaImp();
    }

    public void inserirVenda(Venda venda) {
        if (venda != null && venda.getIdProd() != -1 && venda.getQtdVenda() != -1) {
            
            dao.salvar(venda);
            JOptionPane.showMessageDialog(null, "Venda inserida com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatóris");
        }
    }

    public List<Venda> getVendas() {
        return dao.getVendas();
    }

}
