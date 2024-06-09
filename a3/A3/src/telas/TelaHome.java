
package telas;


public class TelaHome extends javax.swing.JFrame {

    /**
     * Creates new form TelaHome
     */
    public TelaHome() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Consultas = new javax.swing.JMenuItem();
        Perfil = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setText("Menu");

        Consultas.setText("Consultas");
        Consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultasActionPerformed(evt);
            }
        });
        Menu.add(Consultas);

        Perfil.setText("Perfil");
        Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilActionPerformed(evt);
            }
        });
        Menu.add(Perfil);

        jMenuBar1.add(Menu);

        Sair.setText("Sair");
        jMenuBar1.add(Sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed
         InformacoesPessoais Informacoespessoais = new InformacoesPessoais();
        Informacoespessoais.setVisible(true);   
    }//GEN-LAST:event_PerfilActionPerformed
    public void AbrirConsultas(){

        dispose();

        
        TelaDeConsultas consulta = new TelaDeConsultas();
        consulta.setVisible(true);

        }
        
        
     public void Pefil(){

        dispose();

        
        InformacoesPessoais perfil = new InformacoesPessoais();
        perfil.setVisible(true);

        }
        
    
    
    private void ConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultasActionPerformed
    
     TelaDeConsultas telaConsultas = new TelaDeConsultas();
        telaConsultas.setVisible(true);   
    
        

    }//GEN-LAST:event_ConsultasActionPerformed
      
    
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Consultas;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem Perfil;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
