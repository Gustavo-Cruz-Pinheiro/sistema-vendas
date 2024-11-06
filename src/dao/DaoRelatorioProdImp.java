package dao;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexao.Conexao;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Produto;
import view.FrmGerarRelatorio;

public class DaoRelatorioProdImp implements DaoRelatorioProd {

    @Override
    public List<Produto> getProdutosGeral() {

        //new Font(fontName, Font.PLAIN, 14)));
        // String f = "SERIF";
        //new Font(f, Font.MONOSPACED, 16, new Color(0, 0, 255));
        //f = new Font(Font.PLAIN, Font.MONOSPACED, 16,new Color(0,0,255));
        Document document = new Document();
        PdfPTable tabela = new PdfPTable(6);
        try {

            PdfWriter.getInstance(document, new FileOutputStream("documento.pdf"));
            document.open();

            document.add(new Paragraph("                                                                  Relatório Geral"));
            document.add(new Paragraph("      "));
            document.add(new Paragraph("      "));

            tabela.addCell("identificador");
            tabela.addCell("valor");
            tabela.addCell("quantidade");
            tabela.addCell("marca");
            tabela.addCell("descrição");
            tabela.addCell("modelo");
            // cabecalho.setColspan(4);
            document.add(new Paragraph(""));
            Connection con = null;
            con = new Conexao().getConnection();
            List<Produto> lista = new ArrayList<Produto>();
            Produto m = new Produto();
            ResultSet rs = null;
            PreparedStatement pstm = null;
            con = new Conexao().getConnection();
            pstm = con.prepareStatement("SELECT * FROM tb_produto");
            rs = pstm.executeQuery();
            rs.first();

            do {
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                String s4 = rs.getString(4);
                String s5 = rs.getString(5);
                String s6 = rs.getString(6);

                tabela.addCell(s1);
                tabela.addCell(s2);
                tabela.addCell(s3);
                tabela.addCell(s4);
                tabela.addCell(s5);
                tabela.addCell(s6);

            } while (rs.next());
            document.add(tabela);
        } catch (FileNotFoundException | DocumentException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGerarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            document.close();
        }
        try {
            Desktop.getDesktop().open(new File("documento.pdf"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }
        return null;
    }

    @Override
    public List<Produto> getProdutosValor() {

        Document document = new Document();
        PdfPTable tabela = new PdfPTable(3);
        try {

            PdfWriter.getInstance(document, new FileOutputStream("documento.pdf"));
            document.open();

            document.add(new Paragraph("                                                       Relatório de Valores dos Produtos"));
            document.add(new Paragraph("      "));
            document.add(new Paragraph("      "));

            tabela.addCell("identificador");
            tabela.addCell("modelo");
            tabela.addCell("valor");

            document.add(new Paragraph(""));
            Connection con = null;
            con = new Conexao().getConnection();
            List<Produto> lista = new ArrayList<Produto>();
            Produto m = new Produto();
            ResultSet rs = null;
            PreparedStatement pstm = null;
            con = new Conexao().getConnection();
            pstm = con.prepareStatement("SELECT idProd, modelo,valor FROM tb_produto");
            rs = pstm.executeQuery();
            rs.first();

            do {
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);

                tabela.addCell(s1);
                tabela.addCell(s2);
                tabela.addCell(s3);

            } while (rs.next());
            document.add(tabela);
        } catch (FileNotFoundException | DocumentException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGerarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            document.close();
        }
        try {
            Desktop.getDesktop().open(new File("documento.pdf"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }
        return null;

    }

    @Override
    public List<Produto> getProdutosQtd() {
        Document document = new Document();
        PdfPTable tabela = new PdfPTable(3);
        try {

            PdfWriter.getInstance(document, new FileOutputStream("documento.pdf"));
            document.open();

            document.add(new Paragraph("                                                     Relatório de Quantidade de Produtos"));
            document.add(new Paragraph("      "));
            document.add(new Paragraph("      "));

            tabela.addCell("identificador");
            tabela.addCell("modelo");
            tabela.addCell("quantidade");

            document.add(new Paragraph(""));
            Connection con = null;
            con = new Conexao().getConnection();
            List<Produto> lista = new ArrayList<Produto>();
            Produto m = new Produto();
            ResultSet rs = null;
            PreparedStatement pstm = null;
            con = new Conexao().getConnection();
            pstm = con.prepareStatement("SELECT idProd, modelo ,qtdProd FROM tb_produto");
            rs = pstm.executeQuery();
            rs.first();

            do {
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);

                tabela.addCell(s1);
                tabela.addCell(s2);
                tabela.addCell(s3);

            } while (rs.next());
            document.add(tabela);
        } catch (FileNotFoundException | DocumentException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGerarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            document.close();
        }
        try {
            Desktop.getDesktop().open(new File("documento.pdf"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }
        return null;
    }

    @Override
    public List<Produto> getProdutosMarca() {
        Document document = new Document();
        PdfPTable tabela = new PdfPTable(3);
        try {

            PdfWriter.getInstance(document, new FileOutputStream("documento.pdf"));
            document.open();

            document.add(new Paragraph("                                                     Relatório da Marca dos Produtos"));
            document.add(new Paragraph("      "));
            document.add(new Paragraph("      "));

            tabela.addCell("identificador");
            tabela.addCell("modelo");
            tabela.addCell("marca");

            document.add(new Paragraph(""));
            Connection con = null;
            con = new Conexao().getConnection();
            List<Produto> lista = new ArrayList<Produto>();
            Produto m = new Produto();
            ResultSet rs = null;
            PreparedStatement pstm = null;
            con = new Conexao().getConnection();
            pstm = con.prepareStatement("SELECT idProd, modelo , marca FROM tb_produto");
            rs = pstm.executeQuery();
            rs.first();

            do {
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);

                tabela.addCell(s1);
                tabela.addCell(s2);
                tabela.addCell(s3);

            } while (rs.next());
            document.add(tabela);
        } catch (FileNotFoundException | DocumentException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGerarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            document.close();
        }
        try {
            Desktop.getDesktop().open(new File("documento.pdf"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }
        return null;

    }

}
