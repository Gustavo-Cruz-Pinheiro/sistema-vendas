package view;

import controller.ControllerProduto;
import controller.ControllerVenda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Venda;
import model.Produto;

public class FrmVenda extends javax.swing.JInternalFrame {

    List<Produto> listap = new ArrayList<Produto>();
    ControllerProduto controlep = new ControllerProduto();

    List<Venda> listav = new ArrayList<Venda>();
    ControllerVenda controlev = new ControllerVenda();

    int indice;

    public FrmVenda() {
        initComponents();
        listap = controlep.getProdutos();
        while (!listap.isEmpty()) {
            if (listap.get(0).getIdProd() < 10) {
                cbxProdutos.addItem("00" + listap.get(0).getIdProd() + " - " + listap.get(0).getDescricao() + " - R$ " + listap.get(0).getValor() + " - Qtd: " + listap.get(0).getQtdProd());
            } else if (listap.get(0).getIdProd() >= 10) {
                cbxProdutos.addItem("0" + listap.get(0).getIdProd() + " - " + listap.get(0).getDescricao() + " - R$ " + listap.get(0).getValor() + " - Qtd: " + listap.get(0).getQtdProd());
            } else if (listap.get(0).getIdProd() >= 100) {
                cbxProdutos.addItem(listap.get(0).getIdProd() + " - " + listap.get(0).getDescricao() + " - R$ " + listap.get(0).getValor() + " - Qtd: " + listap.get(0).getQtdProd());
            }
            listap.remove(0);
        };
        txtIdVenda.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        lblProduto = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtIdVenda = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        cbxProdutos = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblId.setText("Identificação da Venda:");

        lblValor.setText("Quantidade:");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        lblProduto.setText("Produto:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("OCR-B 10 BT", 1, 36)); // NOI18N
        lblTitulo.setText("Comprar");

        cbxProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecionar--" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProduto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblId)
                        .addComponent(lblValor)
                        .addComponent(txtQtd)
                        .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(50, 50, 50)
                        .addComponent(btnSalvar)
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cbxProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtIdVenda.setText("");
        txtQtd.setText("");
        cbxProdutos.setSelectedItem("--Selecionar--");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Venda venda = new Venda();

        if (cbxProdutos.getSelectedItem().toString().equals("--Selecionar--")) {
            venda.setIdProd(-1);
        } else {
            String prod = cbxProdutos.getSelectedItem().toString();
            venda.setIdProd(Integer.parseInt(prod.substring(0, 3)));
        }
        
        try {
            venda.setQtdVenda(Integer.parseInt(txtQtd.getText()));
        } catch (java.lang.RuntimeException erro){
            JOptionPane.showMessageDialog(this, "Você deve digitar um número no campo 'quantidade'"+erro, "Erro", JOptionPane.ERROR_MESSAGE);
            venda.setQtdVenda(-1);
        }

        controlev.inserirVenda(venda);
    }//GEN-LAST:event_btnSalvarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmCadProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxProdutos;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtIdVenda;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables


}
