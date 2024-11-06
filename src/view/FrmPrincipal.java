package view;


public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrinciapalDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuItemProduto = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuVenda = new javax.swing.JMenu();
        menuVizualizarVendas = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EletroInfo");

        javax.swing.GroupLayout PrinciapalDesktopLayout = new javax.swing.GroupLayout(PrinciapalDesktop);
        PrinciapalDesktop.setLayout(PrinciapalDesktopLayout);
        PrinciapalDesktopLayout.setHorizontalGroup(
            PrinciapalDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        PrinciapalDesktopLayout.setVerticalGroup(
            PrinciapalDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        menuCadastro.setText("Cadastro");

        menuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuItemProduto.setText("Produtos");
        menuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemProduto);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(240, 240, 240));
        menuCadastro.add(jSeparator2);

        menuItemUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menuItemUsuario.setText("Usuário");
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemUsuario);

        jMenuBar1.add(menuCadastro);

        menuRelatorio.setText("Relatórios");
        menuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRelatorioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuRelatorio);

        menuVenda.setText("Comprar");
        menuVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVendaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuVenda);

        menuVizualizarVendas.setText("Vendas");
        menuVizualizarVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVizualizarVendasMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuVizualizarVendas);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PrinciapalDesktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrinciapalDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProdutoActionPerformed
        FrmCadProdutos cadprodutos = new FrmCadProdutos();
        PrinciapalDesktop.add(cadprodutos);
        cadprodutos.setVisible(true);
    }//GEN-LAST:event_menuItemProdutoActionPerformed
    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed
        FrmCadUsuario cadusuario = new FrmCadUsuario();
        PrinciapalDesktop.add(cadusuario);
        cadusuario.setVisible(true);
    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    private void menuRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRelatorioMouseClicked
        FrmGerarRelatorio gerarel = new FrmGerarRelatorio();
        PrinciapalDesktop.add(gerarel);
        gerarel.setVisible(true);
    }//GEN-LAST:event_menuRelatorioMouseClicked

    private void menuVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVendaMouseClicked
        FrmVenda venda = new FrmVenda();
        PrinciapalDesktop.add(venda);
        venda.setVisible(true);
    }//GEN-LAST:event_menuVendaMouseClicked

    private void menuVizualizarVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVizualizarVendasMouseClicked
        FrmVizualizarVenda vervenda = new FrmVizualizarVenda();
        PrinciapalDesktop.add(vervenda);
        vervenda.setVisible(true);
    }//GEN-LAST:event_menuVizualizarVendasMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PrinciapalDesktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemProduto;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuVenda;
    private javax.swing.JMenu menuVizualizarVendas;
    // End of variables declaration//GEN-END:variables
}
