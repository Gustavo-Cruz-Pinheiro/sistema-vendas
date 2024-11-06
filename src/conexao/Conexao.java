package conexao;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection conexao;

    private final String url = "jdbc:mysql://localhost:3306/db_eletroinfo";
    private final String usuario = "root";
    private final String senha = "";
    private final String driver = "com.mysql.jdbc.Driver";

    public Connection getConnection() //void conecta
    {
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException drive) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado " + drive);
        } catch (SQLException fonte) {
            JOptionPane.showMessageDialog(null, "Banco de Dados não encontrado " + fonte);
        }
        return conexao; //retorna conexao
    }

}
