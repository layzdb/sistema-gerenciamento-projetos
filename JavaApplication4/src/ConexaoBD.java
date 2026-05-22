import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoBD {
    
    public Connection conectar() {
        Connection conn = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
                    
            String url = "jdbc:mysql://localhost:3306/sistema_projetos";
            
            String usuario = "root";
           
            String senha = "IXtsmigt@340";
            
            conn = DriverManager.getConnection(url, usuario, senha);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco: " + e.getMessage());
        }
        
        return conn;
    }
}
