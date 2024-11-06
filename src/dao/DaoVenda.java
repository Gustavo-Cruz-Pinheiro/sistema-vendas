package dao;

import java.util.List;
import model.Venda;

public interface DaoVenda {

    public void salvar(Venda venda);
    
    public List<Venda> getVendas();

}
