package interfaces;

import entidade.Venda;
import java.util.Vector;

/*
    - Label e ComboBox : para visualização e seleção;
    - Label e TextField: para preenchimento ou visualização dos campos de cadastro;
    - Panel: painel de comandos de cada caso, botões(Button) vinculados ao painel associados aos comandos de cada caso;
    - cada um dos botões de comandoestá associado ao correspondente tratador
    do evento actionPerformed;
*/
public class janelaPesquisar extends javax.swing.JFrame {
    
    public janelaPesquisar() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoPagamentobuttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jenderecoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtipoTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jresultadoTextArea = new javax.swing.JTextArea();
        jPesquisarButton = new javax.swing.JButton();
        javistaRadioButton = new javax.swing.JRadioButton();
        jparceladoRadioButton = new javax.swing.JRadioButton();
        jLimparButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Endereço");

        jLabel2.setText("Tipo Skate");

        jLabel3.setText("Forma de pagamento");

        jresultadoTextArea.setColumns(20);
        jresultadoTextArea.setRows(5);
        jScrollPane1.setViewportView(jresultadoTextArea);

        jPesquisarButton.setText("Pesquisar");
        jPesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisarButtonActionPerformed(evt);
            }
        });

        tipoPagamentobuttonGroup.add(javistaRadioButton);
        javistaRadioButton.setText("A vista");

        tipoPagamentobuttonGroup.add(jparceladoRadioButton);
        jparceladoRadioButton.setText("Parcelado");

        jLimparButton.setText("Limpar");
        jLimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPesquisarButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLimparButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jenderecoTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(javistaRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(jparceladoRadioButton)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jenderecoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(javistaRadioButton)
                    .addComponent(jparceladoRadioButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPesquisarButton)
                    .addComponent(jLimparButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*  Pesquisa os clientes com base no endereço, tipo do produto comprado e a forma de pagamento inseridos no banco de dados
        As informaçoes são capturadas do banco de dados e mostradas em um campo de texto*/
    private void jPesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesquisarButtonActionPerformed
        Vector<Venda> venda;

        String endereco = "";
        String enderecoString = "";
        if (!jenderecoTextField.getText().isEmpty()) {
            endereco = jenderecoTextField.getText();
            enderecoString = jenderecoTextField.getText();
        } else {
            enderecoString = "Todos os endereços";
        }
        String tipoSkate = "";
        String tipoSkateString = "";
        if (!jtipoTextField.getText().isEmpty()) {
            tipoSkate = jtipoTextField.getText();
            tipoSkateString = jtipoTextField.getText();
        } else {
            tipoSkateString = "Todos os tipos";
        }
        int tipoPag = 0;
        String tipoPagString = "Todos";
        if (javistaRadioButton.isSelected()) {
            tipoPag = 1;
            tipoPagString = "A vista";
        }
        if (jparceladoRadioButton.isSelected()) {
            tipoPag = 2;
            tipoPagString = "Parcelado";
        }

        jresultadoTextArea.setText(null);

        jresultadoTextArea.append("Endereco do Cliente: " + enderecoString + "\n"
                + "Tipo do Skate: " + tipoSkateString + "\n"
                + "Forma de Pagamento: " + tipoPagString + "\n" + "\n");

        venda = Venda.pesquisarVenda(endereco, tipoSkate, tipoPag);

        int i;
        for (i = 0; i < venda.size(); i++) {

            jresultadoTextArea.append(venda.get(i).toString() + "\n");

        }

        if (i == 0) {
            jresultadoTextArea.append("Nenhum Resultado foi encontrado \n ");
        }
        jresultadoTextArea.append("----------------------------------------------- \n \n");

    }//GEN-LAST:event_jPesquisarButtonActionPerformed

    /*----- Tratador do evento gerado no botão Limpar -----
        remove o conteúdo dos campos de texto da pesquisa */
    private void jLimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparButtonActionPerformed
        jenderecoTextField.setText("");
        jtipoTextField.setText("");
        tipoPagamentobuttonGroup.clearSelection();
    }//GEN-LAST:event_jLimparButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(janelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janelaPesquisar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jLimparButton;
    private javax.swing.JButton jPesquisarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton javistaRadioButton;
    private javax.swing.JTextField jenderecoTextField;
    private javax.swing.JRadioButton jparceladoRadioButton;
    private javax.swing.JTextArea jresultadoTextArea;
    private javax.swing.JTextField jtipoTextField;
    private javax.swing.ButtonGroup tipoPagamentobuttonGroup;
    // End of variables declaration//GEN-END:variables
}
