
public class TelaEquipe extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaEquipe.class.getName());
    private javax.swing.DefaultListModel<String> modeloLista = new javax.swing.DefaultListModel<>();
    
    public TelaEquipe() {
        initComponents();
        carregarUsuariosComoMembros();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeEquipe = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoEquipe = new javax.swing.JTextArea();
        cbMembros = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnAdicionarMembro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listMembrosSelecionados = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRO DE EQUIPES");

        jLabel2.setText("Nome da equipe:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Membros:");

        txtNomeEquipe.addActionListener(this::txtNomeEquipeActionPerformed);

        txtDescricaoEquipe.setColumns(20);
        txtDescricaoEquipe.setRows(5);
        jScrollPane1.setViewportView(txtDescricaoEquipe);

        cbMembros.addActionListener(this::cbMembrosActionPerformed);

        jButton1.setText("Salvar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        btnAdicionarMembro.setText("+");
        btnAdicionarMembro.addActionListener(this::btnAdicionarMembroActionPerformed);

        jScrollPane2.setViewportView(listMembrosSelecionados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(cbMembros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeEquipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionarMembro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnAdicionarMembro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEquipeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String nomeEquipe = txtNomeEquipe.getText();
    String descricao = txtDescricaoEquipe.getText();

    if (nomeEquipe.trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, insira o nome da equipe.");
        return;
    }

    try {
        ConexaoBD conexao = new ConexaoBD();
        java.sql.Connection conn = conexao.conectar();
        
        if (conn != null) {
           
            String sqlEquipe = "INSERT INTO equipes (nome_equipe, descricao) VALUES (?, ?)";
            java.sql.PreparedStatement stmtEquipe = conn.prepareStatement(sqlEquipe);
            stmtEquipe.setString(1, nomeEquipe);
            stmtEquipe.setString(2, descricao);
            stmtEquipe.executeUpdate();
            stmtEquipe.close();
            
            
            String sqlMembros = "INSERT INTO membros_equipe (nome_equipe, nome_membro) VALUES (?, ?)";
            java.sql.PreparedStatement stmtMembros = conn.prepareStatement(sqlMembros);
            
            for (int i = 0; i < modeloLista.getSize(); i++) {
                String nomeMembro = modeloLista.getElementAt(i);
                stmtMembros.setString(1, nomeEquipe);
                stmtMembros.setString(2, nomeMembro);
                stmtMembros.addBatch(); 
            }
            
            stmtMembros.executeBatch(); 
            stmtMembros.close();
            conn.close();
            
            javax.swing.JOptionPane.showMessageDialog(this, "Equipe e todos os membros salvos com sucesso!");
            
          
            txtNomeEquipe.setText("");
            txtDescricaoEquipe.setText("");
            modeloLista.clear();
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar equipe: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMembrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMembrosActionPerformed

    private void btnAdicionarMembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarMembroActionPerformed

    String membroSelecionado = cbMembros.getSelectedItem().toString();
    
    if (!membroSelecionado.equals("Selecionar Líder/Membro...")) {
        
        if (!modeloLista.contains(membroSelecionado)) {
            modeloLista.addElement(membroSelecionado); 
            listMembrosSelecionados.setModel(modeloLista); 
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Este membro já foi adicionado à equipe!");
        }
    }    
    }//GEN-LAST:event_btnAdicionarMembroActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new TelaEquipe().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarMembro;
    private javax.swing.JComboBox<String> cbMembros;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listMembrosSelecionados;
    private javax.swing.JTextArea txtDescricaoEquipe;
    private javax.swing.JTextField txtNomeEquipe;
    // End of variables declaration//GEN-END:variables

    public void carregarUsuariosComoMembros() {
        try {
            ConexaoBD conexao = new ConexaoBD();
            java.sql.Connection conn = conexao.conectar();
            
            if (conn != null) {
                String sql = "SELECT nome FROM usuarios ORDER BY nome ASC";
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
                java.sql.ResultSet rs = stmt.executeQuery();
                
                cbMembros.removeAllItems();
                cbMembros.addItem("Selecionar membros...");
                
                while (rs.next()) {
                    String nomeUsuario = rs.getString("nome");
                    cbMembros.addItem(nomeUsuario);
                }
                
                rs.close();
                stmt.close();
                conn.close();
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar membros: " + e.getMessage());
        }
    }
}
