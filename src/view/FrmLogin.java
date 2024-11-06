package view;

import dao.DaoUsuarioImp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;

public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        initComponents();
        this.getRootPane().setDefaultButton(btnEntrar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelLogin = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(115, 101, 152));
        setUndecorated(true);

        PainelLogin.setBackground(new java.awt.Color(52, 73, 94));
        PainelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome:");
        PainelLogin.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 139, -1, -1));

        lblSenha.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");
        PainelLogin.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 206, -1, -1));
        PainelLogin.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 168, 266, -1));
        PainelLogin.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 235, 266, -1));

        btnEntrar.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        PainelLogin.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 90, 31));

        btnLimpar.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        PainelLogin.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 90, 31));

        btnCancelar.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        PainelLogin.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 90, 31));

        jPanel1.setBackground(new java.awt.Color(249, 105, 14));

        lblTitulo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );

        PainelLogin.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 399, -1));

        jPanel2.setBackground(new java.awt.Color(249, 105, 14));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PainelLogin.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 362, 399, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(PainelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String nome, senha;

        nome = txtNome.getText();
        senha = String.valueOf(txtSenha.getPassword());
        if (nome.trim().isEmpty() || senha.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Existem campos vazios", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            List<Usuario> lista = new ArrayList<Usuario>();
            DaoUsuarioImp dao = new DaoUsuarioImp();

            lista = dao.getUsuarios();

            for (int i = 0; i < lista.size(); i++) {

                if (nome.equals(lista.get(i).getNome()) && senha.equals(lista.get(i).getSenha())) {

                    Usuario u = new Usuario();

                    u.setIdUsu(lista.get(i).getIdUsu());
                    u.setQtdacesso(lista.get(i).getQtdacesso() + 1);

                    dao.atualizarQtdacesso(u);

                    JOptionPane.showMessageDialog(this, "Bem-vindo ao sistema");
                    if (lista.get(i).getStatus() == 1) {
                        new FrmPrincipal().show();
                        this.dispose();
                        break;
                    } else {
                        new FrmPrincipalCli().show();
                        this.dispose();
                        break;
                    }
                } else if (!nome.equals(lista.get(i).getNome()) && !senha.equals(lista.get(i).getSenha())) {
                    i++;
                }
            }
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtSenha.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "Você tem certeza que deseja sair do sistema", "Sair", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            this.dispose();
        } else {
            return;
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelLogin;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
