
package telas;

import conexao.ConnectionFactory;
import javax.swing.JOptionPane;


public class LoginTela extends javax.swing.JFrame {

    
    public LoginTela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        senhas = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        ckSenha = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aula de Java");
        setName("telaLogin"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(30, 170, 200, 30);
        getContentPane().add(senhas);
        senhas.setBounds(30, 240, 200, 30);

        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 140, 110, 16);

        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 210, 100, 16);

        entrar.setBackground(new java.awt.Color(0, 204, 51));
        entrar.setText("Logar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(150, 320, 79, 23);

        ckSenha.setText("Mostrar senha");
        ckSenha.setInheritsPopupMenu(true);
        ckSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(ckSenha);
        ckSenha.setBounds(30, 280, 170, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-login-icon-29.png"))); // NOI18N
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -30, 260, 310);

        jButton1.setText("Registrar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 320, 90, 23);

        setSize(new java.awt.Dimension(275, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        
        String login, senha;
        
        login = txtUsuario.getText();
        senha = senhas.getText();
        
        if ("adm".equals(login) && "adm".equals(senha))
        {
            JOptionPane.showMessageDialog(null, "Seja bem vindo!!!"); 
            ConnectionFactory factory = new ConnectionFactory();
            factory.obtemConexao();
            abrirTelaHome();
        }
        
        else
           JOptionPane.showMessageDialog(null,
               "ERRO. Usuário e/ou Senha inválido!");      
    }//GEN-LAST:event_entrarActionPerformed

    public void abrirTelaHome()
    {
        dispose();
        
        TelaHome telaHome = new TelaHome();
        telaHome.setVisible(true);
    }
     
    private void ckSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckSenhaActionPerformed
        if(ckSenha.isSelected()) {
            senhas.setEchoChar((char) 0);
        }else {
            senhas.setEchoChar('*'); 
                }
    }//GEN-LAST:event_ckSenhaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cadastro telaCadastro = new Cadastro();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ckSenha;
    private javax.swing.JButton entrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField senhas;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
