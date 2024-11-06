package dao;

import model.Produto;
import java.util.List;

public interface DaoProduto {

    public void salvar(Produto produto);

    public void alterar(Produto produto);

    public void excluir(int idProd);

    public List<Produto> getProdutos();

}
