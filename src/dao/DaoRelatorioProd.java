 
package dao;
 
import java.util.List;
import model.Produto;

public interface DaoRelatorioProd {
    
    public List<Produto> getProdutosGeral();
    public List<Produto> getProdutosValor();
    public List<Produto> getProdutosQtd();
    public List<Produto> getProdutosMarca();
    
    
}
