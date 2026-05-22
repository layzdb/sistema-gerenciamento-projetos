
public class TelaConsultaProjeto extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaConsultaProjeto.class.getName());

    public TelaConsultaProjeto() {
        initComponents();
        carregarTabelaProjetos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProjetos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PROJETOS CADASTRADOS");

        tblProjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProjetos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       

      
        java.awt.EventQueue.invokeLater(() -> new TelaConsultaProjeto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProjetos;
    // End of variables declaration//GEN-END:variables
public void carregarTabelaProjetos() {
    
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblProjetos.getModel();
    
   
    modelo.setRowCount(0);
    
   
    modelo.setColumnIdentifiers(new Object[]{
        "ID", "Nome do Projeto", "Descrição", "Data Início", "Data Término", "Status", "Gerente", "Equipe Responsável"
    });
    
    tblProjetos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    
    tblProjetos.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
    tblProjetos.getColumnModel().getColumn(1).setPreferredWidth(180); // Nome do Projeto
    tblProjetos.getColumnModel().getColumn(2).setPreferredWidth(220); // Descrição
    tblProjetos.getColumnModel().getColumn(3).setPreferredWidth(100); // Data Início
    tblProjetos.getColumnModel().getColumn(4).setPreferredWidth(100); // Data Término
    tblProjetos.getColumnModel().getColumn(5).setPreferredWidth(120); // Status
    tblProjetos.getColumnModel().getColumn(6).setPreferredWidth(150); // Gerente
    tblProjetos.getColumnModel().getColumn(7).setPreferredWidth(180); // Equipe Responsável

    try {
        ConexaoBD conexao = new ConexaoBD();
        java.sql.Connection conn = conexao.conectar();
        
        if (conn != null) {
            String sql = "SELECT id, nome, descricao, data_inicio, data_termino, status, gerente, equipe_responsavel FROM projetos ORDER BY id DESC";
            java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                String gerenteStr = rs.getString("gerente");
                if (gerenteStr == null) {
                    gerenteStr = "Não atribuído";
                }
                
                String equipeStr = rs.getString("equipe_responsavel");
                if (equipeStr == null) {
                    equipeStr = "Não atribuída";
                }

                modelo.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getString("data_inicio"),
                    rs.getString("data_termino"),
                    rs.getString("status"),
                    gerenteStr,
                    equipeStr
                });
            }
            
            rs.close();
            stmt.close();
            conn.close();
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar consulta de projetos: " + e.getMessage());
    } 
}}
