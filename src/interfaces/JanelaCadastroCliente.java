package interfaces;

import javax.swing.JOptionPane;
import controles.ControladorCadastroCliente;
import entidade.Cliente;
import entidade.Visão;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

/*
    - Label e ComboBox : para visualização e seleção;
    - Label e TextField: para preenchimento ou visualização dos campos de cadastro;
    - Panel: painel de comandos de cada caso, botões(Button) vinculados ao painel associados aos comandos de cada caso;
    - cada um dos botões de comandoestá associado ao correspondente tratador
    do evento actionPerformed;
*/

/*  - a janela do sistema extende o componente Frame; 
    - armazenar o objeto do controlador de cada caso para futuras chamadas de funcionalidades associadas a eventos gerados pelo usuário
    - a partir do BD, atualizamos conjunto de visões associados ao componente ComboBox, utilizado para selecionar clientes cadastrados*/
public class JanelaCadastroCliente extends javax.swing.JFrame {

    ControladorCadastroCliente controlador;
    Vector<Visão<String>> clientes_cadastrados;
    
    public JanelaCadastroCliente(ControladorCadastroCliente controlador) {
        this.controlador = controlador;
        clientes_cadastrados = Cliente.getVisões();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCPFTextField = new javax.swing.JTextField();
        jNomeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jEndereçoTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTelefoneTextField = new javax.swing.JTextField();
        jInserirButton = new javax.swing.JButton();
        jConsultarButton = new javax.swing.JButton();
        jAlterarButton = new javax.swing.JButton();
        jRemoverButton = new javax.swing.JButton();
        jLimparButton = new javax.swing.JButton();
        jClientesCadastradosComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jObservaçõesTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CPF:");

        jLabel2.setText("Nome:");

        jNomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Endereço:");

        jEndereçoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEndereçoTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone:");

        jTelefoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefoneTextFieldActionPerformed(evt);
            }
        });

        jInserirButton.setText("Inserir");
        jInserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInserirButtonActionPerformed(evt);
            }
        });

        jConsultarButton.setText("Consultar");
        jConsultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarButtonActionPerformed(evt);
            }
        });

        jAlterarButton.setText("Alterar");
        jAlterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarButtonActionPerformed(evt);
            }
        });

        jRemoverButton.setText("Remover");
        jRemoverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoverButtonActionPerformed(evt);
            }
        });

        jLimparButton.setText("Limpar");
        jLimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparButtonActionPerformed(evt);
            }
        });

        jClientesCadastradosComboBox.setModel(new DefaultComboBoxModel(clientes_cadastrados));
        jClientesCadastradosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClientesCadastradosComboBoxActionPerformed(evt);
            }
        });

        jObservaçõesTextArea.setColumns(20);
        jObservaçõesTextArea.setRows(5);
        jScrollPane1.setViewportView(jObservaçõesTextArea);

        jLabel5.setText("Observações:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jClientesCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(1, 1, 1)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jEndereçoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTelefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jNomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jInserirButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jConsultarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAlterarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRemoverButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLimparButton)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jClientesCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jNomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jEndereçoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTelefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInserirButton)
                    .addComponent(jConsultarButton)
                    .addComponent(jRemoverButton)
                    .addComponent(jLimparButton)
                    .addComponent(jAlterarButton))
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTelefoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefoneTextFieldActionPerformed

    private void jNomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeTextFieldActionPerformed

    private void jEndereçoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEndereçoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEndereçoTextFieldActionPerformed
   
    /* ----- Tratador do evento gerado no botão Inserir -----
        se todos os campos tiverem sido preenchidos:
            – cria objeto cliente a partir dos campos de texto informados pelo
            usuário; 
    
        solicita a execução da ação ao controlador:
            – regra: não deve existir cliente cadastrado com a chave (CPF)
            do cliente a ser inserido;
            - solicita ao BD cliente cadastrado a partir da chave: para checar a regra; inserção de registro de cliente;
    
        extrai a visão do cliente, adiciona ao ComboBox de clientes cadastrados e assinala como último elemento selecionado
    
        em caso de falha(algum campo não preenchido ou falha reportada pelo controlador): informa mensagem de erro */
    private void jInserirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInserirButtonActionPerformed
        Cliente cliente = obterClienteInformado();
        String mensagem_erro = null;
        if (cliente != null) mensagem_erro = controlador.inserirCliente(cliente);
        else mensagem_erro = "Algum atributo do cliente não foi informado";
        if (mensagem_erro == null) {
            Visão<String> visão = cliente.getVisão();
            jClientesCadastradosComboBox.addItem (visão);
            jClientesCadastradosComboBox.setSelectedItem(visão);
        } else JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO",
            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jInserirButtonActionPerformed

    /*----- Tratador do evento gerado no botão Limpar -----
        remove o conteúdo dos campos de texto do cadastro do cliente */
    private void jLimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparButtonActionPerformed
        jCPFTextField.setText ("");
        jNomeTextField.setText ("");
        jEndereçoTextField.setText ("");
        jTelefoneTextField.setText ("");
        jObservaçõesTextArea.setText("");
    }//GEN-LAST:event_jLimparButtonActionPerformed

    /*----- Tratador do evento gerado no botão Consultar -----
        obtém a visão selecionada no ComboBox de clientes cadastrados
        
        busca no BD, o cliente com a chave associada à visão selecionada:
            – não existe nenhuma regra a ser checada pelo controlador
        
        preenche os campos de texto do cadastro com os atributos do objeto cliente
    
        em caso de falha(inconsistência devido a cliente não cadastrado com a chave selecionada): informa mensagem de erro */
    private void jConsultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarButtonActionPerformed
        Visão<String> visão
        = (Visão<String>) jClientesCadastradosComboBox.getSelectedItem ();
        Cliente cliente = null;
        String mensagem_erro = null;
        if (visão != null) {
            cliente = Cliente.buscarCliente (visão.getChave());
            if (cliente == null) mensagem_erro = "Cliente não cadastrado";
        }else mensagem_erro = "Nenhum cliente selecionado";
        if (mensagem_erro == null) {
            jCPFTextField.setText (cliente.getCpf());
            jNomeTextField.setText (cliente.getNome());
            jEndereçoTextField.setText (cliente.getEndereço());
            jTelefoneTextField.setText (cliente.getTelefone());
            jObservaçõesTextArea.setText(cliente.getObs_Cliente());
        } else JOptionPane.showMessageDialog
        (this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jConsultarButtonActionPerformed
    
    /*----- Tratador do evento gerado no botão Alterar -----
        se todos os campos tiverem sido preenchidos:
            – cria objeto cliente a partir dos campos de texto informados pelo usuário

        solicita a execução da ação ao controlador
            – regra: deve existir um cliente cadastrado com a chave do cliente a ser alterado
            – solicita ao BD:
                - cliente cadastrado a partir da chave: para checar regra de negócio
                - alteração do registro de cliente
    
        obtém o objeto visão dos clientes cadastrados (a partir da chave do cliente), altera a informação da visão considerando a visão obtida a partir do cliente alterado, 
        atualiza o ComboBox de clientes cadastrados e seleciona item alterado
    
        em caso de falha(algum campo não preenchido ou falha reportada pelo controlador): informa mensagem de erro */
    private void jAlterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarButtonActionPerformed
        Cliente cliente = obterClienteInformado();
        String mensagem_erro = null;
        if (cliente != null) mensagem_erro = controlador.alterarCliente(cliente);
        else mensagem_erro = "Algum atributo do cliente não foi informado";
        if (mensagem_erro == null) {
            Visão<String> visão = getVisãoClientesCadastrados(cliente.getCpf());
            if (visão != null) {
                visão.setInfo(cliente.getVisão().getInfo());
                jClientesCadastradosComboBox.updateUI();
                jClientesCadastradosComboBox.setSelectedItem(visão);
            }
        } else JOptionPane.showMessageDialog
        (this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jAlterarButtonActionPerformed

    /*----- Tratador do evento gerado no botão Remover -----
        obtém a visão selecionada no ComboBox de clientes cadastrados

        solicita a execução da ação ao controlador
            – regra: deve existir um cliente cadastrado com a chave do cliente a ser removido
            – solicita ao BD:
                cliente cadastrado a partir da chave: para checar regra 
                a remoção do registro do cliente

        remove a visão selecionada no ComboBox de clientes cadastrados e seleciona o primeiro item da lista
            – ou nenhum item, se o último item foi removido
    
        em caso de falha(nenhum cliente selecionado para remoção ou falha reportada pelo controlador): informa mensagem de erro */
    private void jRemoverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoverButtonActionPerformed
        Visão<String> visão = (Visão<String>) jClientesCadastradosComboBox.getSelectedItem ();
        String mensagem_erro = null;
        if (visão != null) mensagem_erro = controlador.removerCliente(visão.getChave());
        else mensagem_erro = "Nenhum cliente selecionado";
            if (mensagem_erro == null) {
                clientes_cadastrados.remove(visão);
                    if (clientes_cadastrados.size() >= 1)
                        jClientesCadastradosComboBox.setSelectedIndex(0);
                            else jClientesCadastradosComboBox.setSelectedIndex(-1);
            } else {
                JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO",
                JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jRemoverButtonActionPerformed

    private void jClientesCadastradosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClientesCadastradosComboBoxActionPerformed
        
    }//GEN-LAST:event_jClientesCadastradosComboBoxActionPerformed
    
    //pega as informaçoes do cliente
    private Cliente obterClienteInformado() {
        String cpf = jCPFTextField.getText();
        if (cpf.isEmpty()) return null;
        String nome = jNomeTextField.getText();
        if (nome.isEmpty()) return null;
        String endereço = jEndereçoTextField.getText();
        if (endereço.isEmpty()) return null;
        String telefone = jTelefoneTextField.getText();
        if (telefone.isEmpty()) return null;
        String obs_cliente = jObservaçõesTextArea.getText();
        return new Cliente (cpf, nome, endereço, telefone, obs_cliente);
    }
    
    //a partir do BD, atualizamos conjunto de visões associados ao componente ComboBox, utilizado para selecionar clientes cadastrados;
    private Visão<String> getVisãoClientesCadastrados(String chave) {
        for (Visão<String> visão : clientes_cadastrados) {
            if (visão.getChave().equals(chave)) return visão;
        }
        return null;
    }
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAlterarButton;
    private javax.swing.JTextField jCPFTextField;
    private javax.swing.JComboBox<Visão<String>> jClientesCadastradosComboBox;
    private javax.swing.JButton jConsultarButton;
    private javax.swing.JTextField jEndereçoTextField;
    private javax.swing.JButton jInserirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLimparButton;
    private javax.swing.JTextField jNomeTextField;
    private javax.swing.JTextArea jObservaçõesTextArea;
    private javax.swing.JButton jRemoverButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTelefoneTextField;
    // End of variables declaration//GEN-END:variables
}
