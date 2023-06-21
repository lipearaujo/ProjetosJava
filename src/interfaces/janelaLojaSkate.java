package interfaces;

import javax.swing.JOptionPane;
import controles.ControladorCadastroCliente;
import Conexão.BD;
import controles.ControladorCadastroProduto;
import controles.ControladorVenda;


/* - a janela do sistema extende o componente Frame;
   - cria conexão com o BD e os comandos para execução de scripts SQL; */
public class janelaLojaSkate extends javax.swing.JFrame {

    public janelaLojaSkate() {
        BD.criaConexão();
        initComponents();
    }

/* - encerrar o comando e a conexão com o BD;
   - terminar a execução do sistema; */   
private void terminarSistema(java.awt.event.WindowEvent evt){
    BD.fechaConexão();
    System.exit(1);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jCadastrarClientesMenu = new javax.swing.JMenu();
        jCadastrarClientesMenuItem = new javax.swing.JMenuItem();
        jProdutoSkateMenu = new javax.swing.JMenu();
        jCadastrarProdutoMenuItem = new javax.swing.JMenuItem();
        jCadastrarVendaMenu = new javax.swing.JMenu();
        jCadastrarVendaMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Five-O Skate Shop");

        jCadastrarClientesMenu.setText("Clientes");

        jCadastrarClientesMenuItem.setText("Cadastrar");
        jCadastrarClientesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarClientesMenuItemActionPerformed(evt);
            }
        });
        jCadastrarClientesMenu.add(jCadastrarClientesMenuItem);

        jMenuBar1.add(jCadastrarClientesMenu);

        jProdutoSkateMenu.setText("Produto");

        jCadastrarProdutoMenuItem.setText("Cadastrar Produto");
        jCadastrarProdutoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarProdutoMenuItemActionPerformed(evt);
            }
        });
        jProdutoSkateMenu.add(jCadastrarProdutoMenuItem);

        jMenuBar1.add(jProdutoSkateMenu);

        jCadastrarVendaMenu.setText("Venda");

        jCadastrarVendaMenuItem.setText("Cadastrar Venda");
        jCadastrarVendaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarVendaMenuItemActionPerformed(evt);
            }
        });
        jCadastrarVendaMenu.add(jCadastrarVendaMenuItem);

        jMenuBar1.add(jCadastrarVendaMenu);

        jMenu1.setText("Pesquisar");

        jMenuItem1.setText("Pesquisar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /*  - item de menu cadastrar cliente da janela principal; 
        - cada componente de item de menu está associado tratador do evento actionPerformed;
        - cada tratador de evento de um dado item de menu chama o controlador de seu respectivo caso; */
    private void jCadastrarClientesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarClientesMenuItemActionPerformed
       new ControladorCadastroCliente();
    }//GEN-LAST:event_jCadastrarClientesMenuItemActionPerformed
    
     /* - item de menu cadastrar produto da janela principal; 
        - cada componente de item de menu está associado tratador do evento actionPerformed;
        - cada tratador de evento de um dado item de menu chama o controlador de seu respectivo caso; */
    private void jCadastrarProdutoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarProdutoMenuItemActionPerformed
        new ControladorCadastroProduto();
    }//GEN-LAST:event_jCadastrarProdutoMenuItemActionPerformed
    
     /* - item de menu cadastrar venda da janela principal; 
        - cada componente de item de menu está associado tratador do evento actionPerformed;
        - cada tratador de evento de um dado item de menu chama o controlador de seu respectivo caso; */
    private void jCadastrarVendaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarVendaMenuItemActionPerformed
        new ControladorVenda();
    }//GEN-LAST:event_jCadastrarVendaMenuItemActionPerformed
    
     /* - item de menu pesquisar da janela principal; 
        - cada componente de item de menu está associado tratador do evento actionPerformed;
        - cada tratador de evento de um dado item de menu chama o controlador de seu respectivo caso; */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new janelaPesquisar().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(janelaLojaSkate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janelaLojaSkate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janelaLojaSkate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janelaLojaSkate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janelaLojaSkate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jCadastrarClientesMenu;
    private javax.swing.JMenuItem jCadastrarClientesMenuItem;
    private javax.swing.JMenuItem jCadastrarProdutoMenuItem;
    private javax.swing.JMenu jCadastrarVendaMenu;
    private javax.swing.JMenuItem jCadastrarVendaMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jProdutoSkateMenu;
    // End of variables declaration//GEN-END:variables
}
