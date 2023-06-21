package interfaces;

import javax.swing.JOptionPane;
import controles.ControladorCadastroProduto;
import entidade.Produto;
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
    - a partir do BD, atualizamos conjunto de visões associados ao componente ComboBox, utilizado para selecionar produtos cadastrados*/
public class JanelaCadastroProduto extends javax.swing.JFrame {
    
    ControladorCadastroProduto controlador;
    Vector<Visão<Integer>> produtos_cadastrados;
    
    public JanelaCadastroProduto(ControladorCadastroProduto controlador) {
        this.controlador = controlador;
        produtos_cadastrados = Produto.getVisões();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SimOuNaobuttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jProdutosCadastradosComboBox = new javax.swing.JComboBox<>();
        jSkateTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMarcaTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTipoRodinhaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTamanhoShapeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTipoSkateTextField = new javax.swing.JTextField();
        jInserirProdutoButton = new javax.swing.JButton();
        jConsultarProdutoButton = new javax.swing.JButton();
        jAlterarProdutoButton = new javax.swing.JButton();
        jRemoverProdutoButton = new javax.swing.JButton();
        jLimparProdutoButton = new javax.swing.JButton();
        jSimRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jNãoRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jObservaçõesTextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID Skate:");

        jProdutosCadastradosComboBox.setModel(new DefaultComboBoxModel(produtos_cadastrados));
        jProdutosCadastradosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProdutosCadastradosComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca:");

        jLabel3.setText("Tipo Rodinha:");

        jTipoRodinhaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTipoRodinhaTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Tamanho Shape:");

        jLabel5.setText("Tipo Skate:");

        jInserirProdutoButton.setText("Inserir");
        jInserirProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInserirProdutoButtonActionPerformed(evt);
            }
        });

        jConsultarProdutoButton.setText("Consultar");
        jConsultarProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarProdutoButtonActionPerformed(evt);
            }
        });

        jAlterarProdutoButton.setText("Alterar");
        jAlterarProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarProdutoButtonActionPerformed(evt);
            }
        });

        jRemoverProdutoButton.setText("Remover");
        jRemoverProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoverProdutoButtonActionPerformed(evt);
            }
        });

        jLimparProdutoButton.setText("Limpar");
        jLimparProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparProdutoButtonActionPerformed(evt);
            }
        });

        SimOuNaobuttonGroup.add(jSimRadioButton);
        jSimRadioButton.setText("Sim");
        jSimRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimRadioButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Skate Profissional:");

        SimOuNaobuttonGroup.add(jNãoRadioButton);
        jNãoRadioButton.setText("Não");

        jObservaçõesTextArea.setColumns(20);
        jObservaçõesTextArea.setRows(5);
        jScrollPane1.setViewportView(jObservaçõesTextArea);

        jLabel7.setText("Observações:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProdutosCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSkateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jMarcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTipoRodinhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTamanhoShapeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTipoSkateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSimRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(jNãoRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInserirProdutoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jConsultarProdutoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAlterarProdutoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRemoverProdutoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLimparProdutoButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProdutosCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSkateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jMarcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTipoRodinhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTamanhoShapeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTipoSkateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSimRadioButton)
                    .addComponent(jNãoRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInserirProdutoButton)
                    .addComponent(jConsultarProdutoButton)
                    .addComponent(jAlterarProdutoButton)
                    .addComponent(jRemoverProdutoButton)
                    .addComponent(jLimparProdutoButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTipoRodinhaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTipoRodinhaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTipoRodinhaTextFieldActionPerformed

     /* ----- Tratador do evento gerado no botão Inserir -----
        se todos os campos tiverem sido preenchidos:
            – cria objeto produto a partir dos campos de texto informados pelo
            usuário; 
    
        solicita a execução da ação ao controlador:
            – regra: não deve existir produto cadastrado com a chave primária
            do produto a ser inserido;
            - solicita ao BD produto cadastrado a partir da chave: para checar a regra; inserção de registro de produto;
    
        extrai a visão do produto, adiciona ao ComboBox de produtos cadastrados e assinala como último elemento selecionado
    
        em caso de falha(algum campo não preenchido ou falha reportada pelo controlador): informa mensagem de erro */
    private void jInserirProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInserirProdutoButtonActionPerformed
        Produto produto = obterProdutoInformado();
        String mensagem_erro = null;
        if (produto != null) mensagem_erro = controlador.inserirProduto(produto);
        else mensagem_erro = "Algum atributo do produto não foi informado";
        if (mensagem_erro == null) {
            Visão<Integer> visão = produto.getVisão();
            jProdutosCadastradosComboBox.addItem(visão);
            jProdutosCadastradosComboBox.setSelectedItem(visão);
        } else JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO",
            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jInserirProdutoButtonActionPerformed

    /*----- Tratador do evento gerado no botão Consultar -----
        obtém a visão selecionada no ComboBox de produtos cadastrados
        
        busca no BD, o produto com a chave associada à visão selecionada:
            – não existe nenhuma regra a ser checada pelo controlador
        
        preenche os campos de texto do cadastro com os atributos do objeto produto
    
        em caso de falha(inconsistência devido a produto não cadastrado com a chave selecionada): informa mensagem de erro */
    private void jConsultarProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarProdutoButtonActionPerformed
         Visão<Integer> visão
        = (Visão<Integer>) jProdutosCadastradosComboBox.getSelectedItem ();
        Produto produto = null;
        String mensagem_erro = null;
        if (visão != null) {
            produto = Produto.buscarProduto(visão.getChave());
            if (produto == null) mensagem_erro = "Produto não cadastrado";
        }else mensagem_erro = "Nenhum Produto selecionado";
        if (mensagem_erro == null) {
            jSkateTextField.setText (Integer.toString(produto.getSkate()));
            jMarcaTextField.setText (produto.getMarca());
            jTipoRodinhaTextField.setText (produto.getTipoRodinha());
            jTamanhoShapeTextField.setText (Float.toString(produto.getTamanhoShape()));
            jTipoSkateTextField.setText(produto.getTipoSkate());
            jObservaçõesTextArea.setText(produto.getObs_Produto());
            
            if(produto.getmodeloSkate() == 1){
                    jSimRadioButton.setSelected(true);
                }
                if(produto.getmodeloSkate() == 2){
                    jNãoRadioButton.setSelected(true);
                }
            
        } else 
            JOptionPane.showMessageDialog
        (this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);                                                
    }//GEN-LAST:event_jConsultarProdutoButtonActionPerformed

     /*----- Tratador do evento gerado no botão Alterar -----
        se todos os campos tiverem sido preenchidos:
            – cria objeto produto a partir dos campos de texto informados pelo usuário

        solicita a execução da ação ao controlador
            – regra: deve existir um produto cadastrado com a chave do produto a ser alterado
            – solicita ao BD:
                - produto cadastrado a partir da chave: para checar regra de negócio
                - alteração do registro de produto
    
        obtém o objeto visão dos produtos cadastrados (a partir da chave do produto), altera a informação da visão considerando a visão obtida a partir do produto alterado, 
        atualiza o ComboBox de produtos cadastrados e seleciona item alterado
    
        em caso de falha(algum campo não preenchido ou falha reportada pelo controlador): informa mensagem de erro */
    private void jAlterarProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarProdutoButtonActionPerformed
         Produto produto = obterProdutoInformado();
        String mensagem_erro = null;
        if (produto != null) mensagem_erro = controlador.alterarProduto(produto);
        else mensagem_erro = "Algum atributo do produto não foi informado";
        if (mensagem_erro == null) {
            Visão<Integer> visão = getVisãoProdutosCadastrados(produto.getSkate());
            if (visão != null) {
                visão.setInfo(produto.getVisão().getInfo());
                jProdutosCadastradosComboBox.updateUI();
                jProdutosCadastradosComboBox.setSelectedItem(visão);
            }
        } else JOptionPane.showMessageDialog
        (this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jAlterarProdutoButtonActionPerformed

     /*----- Tratador do evento gerado no botão Remover -----
        obtém a visão selecionada no ComboBox de produto cadastrados

        solicita a execução da ação ao controlador
            – regra: deve existir um produto cadastrado com a chave do cliente a ser removido
            – solicita ao BD:
                produto cadastrado a partir da chave: para checar regra 
                remoção do registro do produto

        remove a visão selecionada no ComboBox de produtos cadastrados e seleciona o primeiro item da lista
            – ou nenhum item, se o último item foi removido
    
        em caso de falha(nenhum produto selecionado para remoção ou falha reportada pelo controlador): informa mensagem de erro */
    private void jRemoverProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoverProdutoButtonActionPerformed
        Visão<Integer> visão
        = (Visão<Integer>) jProdutosCadastradosComboBox.getSelectedItem ();
        String mensagem_erro = null;
        if (visão != null) mensagem_erro = controlador.removerProduto(visão.getChave());
        else mensagem_erro = "Nenhum produto selecionado";
            if (mensagem_erro == null) {
                produtos_cadastrados.remove(visão);
                    if (produtos_cadastrados.size() >= 1)
                        jProdutosCadastradosComboBox.setSelectedIndex(0);
                            else jProdutosCadastradosComboBox.setSelectedIndex(-1);
            } else {
                JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO",
                JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jRemoverProdutoButtonActionPerformed

     /*----- Tratador do evento gerado no botão Limpar -----
        remove o conteúdo dos campos de texto do cadastro do produto */
    private void jLimparProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparProdutoButtonActionPerformed
        jSkateTextField.setText ("");
        jMarcaTextField.setText ("");
        jTipoRodinhaTextField.setText ("");
        jTamanhoShapeTextField.setText ("");
        jTipoSkateTextField.setText ("");
        jObservaçõesTextArea.setText("");
        SimOuNaobuttonGroup.clearSelection();
    }//GEN-LAST:event_jLimparProdutoButtonActionPerformed

    private void jProdutosCadastradosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProdutosCadastradosComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProdutosCadastradosComboBoxActionPerformed

    private void jSimRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSimRadioButtonActionPerformed
    
    //pega as informaçoes do produto
    private Produto obterProdutoInformado() {
        int skate = Integer.parseInt(jSkateTextField.getText());
        if (skate == -1) return null;
        String marca = jMarcaTextField.getText();
        if (marca.isEmpty()) return null;
        String tipo_rodinha  = jTipoRodinhaTextField.getText();
        if (tipo_rodinha.isEmpty()) return null;
        String tipo_skate = jTipoSkateTextField.getText();
        float tamanho_shape = Float.parseFloat(jTamanhoShapeTextField.getText()); 
        if (tamanho_shape == -1) return null;
        if(tipo_skate.isEmpty()) return null;
        String obs_produto = jObservaçõesTextArea.getText();
        
        int modeloSkate = -1;
        if(jSimRadioButton.isSelected()){
            modeloSkate = 1;
        }
        if(jNãoRadioButton.isSelected()){
            modeloSkate = 2;
        }
        if(modeloSkate == -1){
            return null;
        }
        
        return new Produto (skate, marca, tipo_rodinha, tipo_skate, tamanho_shape, obs_produto, modeloSkate);
    }
    
    // - a partir do BD, atualizamos conjunto de visões associados ao componente ComboBox, utilizado para selecionar clientes cadastrados
    private Visão<Integer> getVisãoProdutosCadastrados(int chave) {
        for (Visão<Integer> visão : produtos_cadastrados) {
            if (visão.getChave().equals(chave)) return visão;
        }
        return null;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup SimOuNaobuttonGroup;
    private javax.swing.JButton jAlterarProdutoButton;
    private javax.swing.JButton jConsultarProdutoButton;
    private javax.swing.JButton jInserirProdutoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jLimparProdutoButton;
    private javax.swing.JTextField jMarcaTextField;
    private javax.swing.JRadioButton jNãoRadioButton;
    private javax.swing.JTextArea jObservaçõesTextArea;
    private javax.swing.JComboBox<Visão<Integer>> jProdutosCadastradosComboBox;
    private javax.swing.JButton jRemoverProdutoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jSimRadioButton;
    private javax.swing.JTextField jSkateTextField;
    private javax.swing.JTextField jTamanhoShapeTextField;
    private javax.swing.JTextField jTipoRodinhaTextField;
    private javax.swing.JTextField jTipoSkateTextField;
    // End of variables declaration//GEN-END:variables
}
