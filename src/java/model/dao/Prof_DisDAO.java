package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Prof_DisDAO {
   
    public List<Integer> buscar(int id_prof) {
        
        List<Integer> ids = new ArrayList();
                
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM professor_disciplina WHERE fk_id_professor = ?");
            stmt.setInt(1, id_prof);
 
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                int id;
   
                id = rs.getInt("fk_id_disciplina");

                ids.add(id);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return ids;
    }
    
}
