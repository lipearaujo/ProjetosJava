
package interfaces;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.Vector;
import entidade.Visão;
import controles.ControladorVenda;
import entidade.Venda;
import entidade.Produto;
import entidade.Cliente;

/*
    - Label e ComboBox : para visualização e seleção;
    - Label e TextField: para preenchimento ou visualização dos campos de cadastro;
    - Panel: painel de comandos de cada caso, botões(Button) vinculados ao painel associados aos comandos de cada caso;
    - cada um dos botões de comandoestá associado ao correspondente tratador
    do evento actionPerformed;
*/

/*  - a janela do sistema extende o componente Frame; 
    - armazenar o objeto do controlador de cada caso para futuras chamadas de funcionalidades associadas a eventos gerados pelo usuário
    - a partir do BD, atualizamos conjunto de visões associados ao componente ComboBox, utilizado para selecionar vendas cadastradas*/
public class JanelaCadastroVenda extends javax.swing.JFrame {
    
    ControladorVenda controlador;
    Vector<Visão<Integer>> vendas_cadastradas;
    Vector<Visão<Integer>> produtos_cadastrados;
    Vector<Visão<String>> clientes_cadastrados;
    
    public JanelaCadastroVenda(ControladorVenda controlador) {
        this.controlador = controlador;
        vendas_cadastradas = Venda.getVisões();
        produtos_cadastrados = Produto.getVisões();
        clientes_cadastrados = Cliente.getVisões();
        initComponents();
    }
    private int getVisaoCliente(String chave) {
        int i = -1;
        for (Visão<String> visao : clientes_cadastrados) {
            i++;
            if (visao.getChave().equals(chave)) return i;
        }
           return -1 ;
}
 
    private int getVisaoProduto(int chave) {
        int i = -1;
        for (Visão<Integer> visao : produtos_cadastrados) {
            i++;
            if (visao.getChave().equals(chave)) return i;
        }
           return -1 ;
}

    private Visão<Integer> getVisãoAlugaCadastrados(String chave) {
        for (Visão<Integer> visao : vendas_cadastradas) {
            if (visao.getChave().equals(chave)) return visao;
        }
            return null;          
    } 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoVendabuttonGroup = new javax.swing.ButtonGroup();
        jClientesCadastradosComboBox = new javax.swing.JComboBox<>();
        jProdutosCadastradosComboBox = new javax.swing.JComboBox<>();
        jAVistaRadioButton = new javax.swing.JRadioButton();
        jParceladoRadioButton = new javax.swing.JRadioButton();
        jInserirVendaButton = new javax.swing.JButton();
        jConsultarVendaButton = new javax.swing.JButton();
        jAlterarVendaButton = new javax.swing.JButton();
        jRemoverVendaButton = new javax.swing.JButton();
        jLimparVendaButton = new javax.swing.JButton();
        jVendaComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jInserirIDVendaTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPreçoVendaTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jClientesCadastradosComboBox.setModel(new DefaultComboBoxModel  (clientes_cadastrados));

        jProdutosCadastradosComboBox.setModel(new DefaultComboBoxModel(produtos_cadastrados));

        TipoVendabuttonGroup.add(jAVistaRadioButton);
        jAVistaRadioButton.setText("A vista");
        jAVistaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAVistaRadioButtonActionPerformed(evt);
            }
        });

        TipoVendabuttonGroup.add(jParceladoRadioButton);
        jParceladoRadioButton.setText("Parcelado");

        jInserirVendaButton.setText("Inserir");
        jInserirVendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInserirVendaButtonActionPerformed(evt);
            }
        });

        jConsultarVendaButton.setText("Consultar");
        jConsultarVendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarVendaButtonActionPerformed(evt);
            }
        });

        jAlterarVendaButton.setText("Alterar");
        jAlterarVendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarVendaButtonActionPerformed(evt);
            }
        });

        jRemoverVendaButton.setText("Remover");
        jRemoverVendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoverVendaButtonActionPerformed(evt);
            }
        });

        jLimparVendaButton.setText("Limpar");
        jLimparVendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparVendaButtonActionPerformed(evt);
            }
        });

        jVendaComboBox.setModel(new DefaultComboBoxModel (vendas_cadastradas));

        jLabel1.setText("ID Venda:");

        jLabel2.setText("Preço:");

        jLabel3.setText("Vendas:");

        jLabel4.setText("Clientes Cadastrados:");

        jLabel5.setText("Produtos Cadastrados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jInserirVendaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jConsultarVendaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAlterarVendaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRemoverVendaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLimparVendaButton)
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPreçoVendaTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jAVistaRadioButton)
                        .addGap(10, 10, 10)
                        .addComponent(jParceladoRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInserirIDVendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jVendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProdutosCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jClientesCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jVendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jInserirIDVendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPreçoVendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jParceladoRadioButton)
                    .addComponent(jAVistaRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jClientesCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProdutosCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInserirVendaButton)
                    .addComponent(jConsultarVendaButton)
                    .addComponent(jAlterarVendaButton)
                    .addComponent(jRemoverVendaButton)
                    .addComponent(jLimparVendaButton))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* ----- Tratador do evento gerado no botão Inserir -----
        se todos os campos tiverem sido preenchidos:
            – cria objeto venda a partir dos campos de texto informados pelo
            usuário; 
    
        solicita a execução da ação ao controlador:
            – regra: não deve existir venda cadastrada com a chave primária
            da venda a ser inserida;
            - solicita ao BD venda cadastrada a partir da chave: para checar a regra; inserção de registro de venda;
    
        extrai a visão da venda, adiciona ao ComboBox de vendas cadastradas e assinala como último elemento selecionado
    
        em caso de falha(algum campo não preenchido ou falha reportada pelo controlador): informa mensagem de erro */
    private void jInserirVendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInserirVendaButtonActionPerformed
        Venda venda = obterVendaInformada();
        String mensagem_erro = null;
        if (venda != null) mensagem_erro = controlador.inserirVenda(venda);
        else mensagem_erro = "Algum atributo da venda não foi informado";
        if (mensagem_erro == null) {
            Visão<Integer> visão = venda.getVisão();
            jVendaComboBox.addItem(visão);
            jVendaComboBox.setSelectedItem(visão);
        } else JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO",
            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jInserirVendaButtonActionPerformed

    private void jAVistaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAVistaRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAVistaRadioButtonActionPerformed

    /*----- Tratador do evento gerado no botão Consultar -----
        obtém a visão selecionada no ComboBox de vendas cadastrados
        
        busca no BD, a venda com a chave associada à visão selecionada:
            – não existe nenhuma regra a ser checada pelo controlador
        
        preenche os campos de texto do cadastro com os atributos do objeto venda
    
        em caso de falha(inconsistência devido a venda não cadastrada com a chave selecionada): informa mensagem de erro */
    private void jConsultarVendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarVendaButtonActionPerformed
        Visão<Integer> visao = (Visão<Integer>) jVendaComboBox.getSelectedItem();
        Venda venda = null;
        String msgErro = null;
        if (visao != null){
            venda = Venda.buscarVenda(visao.getChave());
            if (venda == null) {
                msgErro = "Venda nao encontrada";
            }else{
                jInserirIDVendaTextField.setText(Integer.toString(venda.getIDvenda()));
                jPreçoVendaTextField.setText(Float.toString(venda.getpreço_Venda()));
                if(venda.getformaPagamento() == 1){
                    jAVistaRadioButton.setSelected(true);
                }
                if(venda.getformaPagamento() == 2){
                    jParceladoRadioButton.setSelected(true);
                }
               int indexClientes = getVisaoCliente(venda.getv_Cliente().getCpf());
               jClientesCadastradosComboBox.setSelectedIndex(indexClientes);
               int indexProdutos = getVisaoProduto(venda.getv_Produto().getSkate());
               jProdutosCadastradosComboBox.setSelectedIndex(indexProdutos);
                
                
            }
        }else{
            msgErro = "Nenhuma Venda Selecionada";
        }
    }//GEN-LAST:event_jConsultarVendaButtonActionPerformed

    /*----- Tratador do evento gerado no botão Alterar -----
        se todos os campos tiverem sido preenchidos:
            – cria objeto venda a partir dos campos de texto informados pelo usuário

        solicita a execução da ação ao controlador
            – regra: deve existir uma venda cadastrada com a chave da venda a ser alterada
            – solicita ao BD:
                - venda cadastrada a partir da chave: para checar regra de negócio
                - alteração do registro de produto
    
        obtém o objeto visão das vendas cadastradas (a partir da chave da venda), altera a informação da visão considerando a visão obtida a partir da venda alterada, 
        atualiza o ComboBox de vendas cadastradas e seleciona item alterado
    
        em caso de falha(algum campo não preenchido ou falha reportada pelo controlador): informa mensagem de erro */
    private void jAlterarVendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarVendaButtonActionPerformed
        Venda venda = obterVendaInformada();
             String msgErro = null;
        if(venda != null){
            msgErro = controlador.alterarVenda(venda);
        }else{
            msgErro = "Campo Vazio";
        }
        if(msgErro == null){
            Visão<Integer> visão = venda.getVisão();
            if(visão != null){
                visão.setChave(venda.getVisão().getChave());
                jVendaComboBox.updateUI();
                jVendaComboBox.setSelectedItem(visão);
            }
            
            
        }else {
            JOptionPane.showMessageDialog(this, msgErro,"Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jAlterarVendaButtonActionPerformed

    /*----- Tratador do evento gerado no botão Limpar -----
        remove o conteúdo dos campos de texto do cadastro da venda */
    private void jLimparVendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparVendaButtonActionPerformed
        jInserirIDVendaTextField.setText("");
        jPreçoVendaTextField.setText("");
        TipoVendabuttonGroup.clearSelection();
        
    }//GEN-LAST:event_jLimparVendaButtonActionPerformed

    /*----- Tratador do evento gerado no botão Remover -----
        obtém a visão selecionada no ComboBox de venda cadastradas

        solicita a execução da ação ao controlador
            – regra: deve existir uma venda cadastrada com a chave da venda a ser removida
            – solicita ao BD:
                venda cadastrada a partir da chave: para checar regra 
                remoção do registro da venda

        remove a visão selecionada no ComboBox de vendas cadastrados e seleciona o primeiro item da lista
            – ou nenhum item, se o último item foi removido
    
        em caso de falha(nenhuma venda selecionado para remoção ou falha reportada pelo controlador): informa mensagem de erro */
    private void jRemoverVendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoverVendaButtonActionPerformed
        Visão<Integer> visão = (Visão<Integer>) jVendaComboBox.getSelectedItem();
       String msgErro = null;
       if(visão != null){
           msgErro = controlador.removerVenda(visão.getChave());
       }else{
           msgErro = "Nenhuma venda cadastrada";
       }
       if(msgErro == null){
           vendas_cadastradas.remove(visão);
           if(vendas_cadastradas.size() >= 1){
               jVendaComboBox.setSelectedIndex(0);
           }else{
               jVendaComboBox.setSelectedIndex(-1);
           }
       }else{
            JOptionPane.showMessageDialog(this, msgErro, "ERRO", JOptionPane.ERROR_MESSAGE);
       }
       jInserirIDVendaTextField.setText("");
       jPreçoVendaTextField.setText("");
       TipoVendabuttonGroup.clearSelection();
        
    }//GEN-LAST:event_jRemoverVendaButtonActionPerformed

    //pega as informaçoes da venda
    private Venda obterVendaInformada(){
        Cliente cliente = null;
        Produto produto = null;
        
        int id_Venda = Integer.parseInt(jInserirIDVendaTextField.getText());
        if (id_Venda == -1) return null;
        float preço_Venda = Float.parseFloat(jPreçoVendaTextField.getText());
        if (preço_Venda == -1) return null;
        Visão<String> visãoClientes = (Visão<String>)jClientesCadastradosComboBox.getSelectedItem();
        if(visãoClientes == null) return null;
        Visão<Integer> visãoProdutos = (Visão<Integer>)jProdutosCadastradosComboBox.getSelectedItem();
        if(visãoProdutos == null) return null;
        
        int formaPagamento = -1;
        if(jAVistaRadioButton.isSelected()){
            formaPagamento = 1;
        }
        if(jParceladoRadioButton.isSelected()){
            formaPagamento = 2;
        }
        if(formaPagamento == -1){
            return null;
        }
        
        cliente = Cliente.buscarCliente(visãoClientes.getChave());
        produto = Produto.buscarProduto(visãoProdutos.getChave());
        
        return new Venda (id_Venda, cliente , produto, preço_Venda, formaPagamento);
    }
    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TipoVendabuttonGroup;
    private javax.swing.JRadioButton jAVistaRadioButton;
    private javax.swing.JButton jAlterarVendaButton;
    private javax.swing.JComboBox<Visão<String>> jClientesCadastradosComboBox;
    private javax.swing.JButton jConsultarVendaButton;
    private javax.swing.JTextField jInserirIDVendaTextField;
    private javax.swing.JButton jInserirVendaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLimparVendaButton;
    private javax.swing.JRadioButton jParceladoRadioButton;
    private javax.swing.JTextField jPreçoVendaTextField;
    private javax.swing.JComboBox<Visão<Integer>> jProdutosCadastradosComboBox;
    private javax.swing.JButton jRemoverVendaButton;
    private javax.swing.JComboBox<Visão<Integer>> jVendaComboBox;
    // End of variables declaration//GEN-END:variables
}
