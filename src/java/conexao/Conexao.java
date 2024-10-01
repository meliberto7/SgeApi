
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/projeto_sge";
    private static final String user = "root";
    private static final String password = "";
    
    public Connection conectar() {
        
        Connection conexao = null;
        
        try{
            
            Class.forName("mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, user, password);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
       return conexao; 
    }
    
}
