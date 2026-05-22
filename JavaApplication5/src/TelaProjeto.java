/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class TelaProjeto extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaProjeto.class.getName());
    public TelaProjeto() {
        initComponents();
        carregarGerentes();
        carregarEquipesNaTelaProjeto();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomeProjeto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        txtDataInicio = new javax.swing.JFormattedTextField();
        txtDataTermino = new javax.swing.JFormattedTextField();
        cbGerente = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        cbEquipe = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRO DE PROJETOS");

        jLabel2.setText("Nome:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Data de início:");

        jLabel5.setText("Data de término:");

        jLabel6.setText("Gerente responsável:");

        txtNomeProjeto.addActionListener(this::txtNomeProjetoActionPerformed);

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbGerente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbGerente.addActionListener(this::cbGerenteActionPerformed);

        jButton1.setText("Salvar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel7.setText("Status:");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planejado", "Em andamento", "Em hiatus", "Concluído", "Cancelado" }));
        cbStatus.addActionListener(this::cbStatusActionPerformed);

        cbEquipe.addActionListener(this::cbEquipeActionPerformed);

        jLabel8.setText("Equipe responsável:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbEquipe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(txtNomeProjeto)
                    .addComponent(txtDataInicio)
                    .addComponent(txtDataTermino)
                    .addComponent(cbGerente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProjetoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

String nome = txtNomeProjeto.getText();
String descricao = txtDescricao.getText();
String dataInicio = txtDataInicio.getText();
String dataTermino = txtDataTermino.getText();
String status = cbStatus.getSelectedItem().toString();


String gerente = "";
if (cbGerente.getSelectedItem() != null) {
    gerente = cbGerente.getSelectedItem().toString();
}


String equipe = "";
if (cbEquipe.getSelectedItem() != null) {
    equipe = cbEquipe.getSelectedItem().toString();
}

try {
    ConexaoBD conexao = new ConexaoBD();
    java.sql.Connection conn = conexao.conectar();
    
    if (conn != null) {
      
        String sql = "INSERT INTO projetos (nome, descricao, data_inicio, data_termino, status, gerente, equipe_responsavel) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
        
        stmt.setString(1, nome);
        stmt.setString(2, descricao);
        stmt.setString(3, dataInicio);
        stmt.setString(4, dataTermino);
        stmt.setString(5, status);
        stmt.setString(6, gerente);
        stmt.setString(7, equipe);
        
        stmt.executeUpdate();
        
        stmt.close();
        conn.close();
        
        javax.swing.JOptionPane.showMessageDialog(this, "Projeto salvo com Gerente e Equipe com sucesso!");
        
        txtNomeProjeto.setText("");
        txtDescricao.setText("");
        txtDataInicio.setText("");
        txtDataTermino.setText("");
    }
} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar projeto: " + e.getMessage());
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void cbGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGerenteActionPerformed

    private void cbEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEquipeActionPerformed

    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(() -> new TelaProjeto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEquipe;
    private javax.swing.JComboBox<String> cbGerente;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JFormattedTextField txtDataTermino;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNomeProjeto;
    // End of variables declaration//GEN-END:variables

public void carregarGerentes() {
    try {
       
        ConexaoBD conexao = new ConexaoBD();
        java.sql.Connection conn = conexao.conectar();
        
        if (conn != null) {
           
            String sql = "SELECT nome FROM usuarios ORDER BY nome ASC";
            java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stmt.executeQuery();
            
           
            cbGerente.removeAllItems();
            cbGerente.addItem("Selecionar...");
            
            
            while (rs.next()) {
                String nomeUsuario = rs.getString("nome");
                cbGerente.addItem(nomeUsuario);
            }
            
            rs.close();
            stmt.close();
            conn.close();
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar gerentes: " + e.getMessage());
    }
}
public void carregarEquipesNaTelaProjeto() {
    try {
        ConexaoBD conexao = new ConexaoBD();
        java.sql.Connection conn = conexao.conectar();
        
        if (conn != null) {
            String sql = "SELECT nome_equipe FROM equipes ORDER BY nome_equipe ASC";
            java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stmt.executeQuery();
            
            
            cbEquipe.removeAllItems();
            cbEquipe.addItem("Selecionar Equipe...");
            
            while (rs.next()) {
                String nomeEquipe = rs.getString("nome_equipe");
                cbEquipe.addItem(nomeEquipe);
            }
            
            rs.close();
            stmt.close();
            conn.close();
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar equipes: " + e.getMessage());
    }
}}
