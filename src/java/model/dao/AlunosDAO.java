package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Alunos;


public class AlunosDAO {
    
    public List<Alunos> listar() {
        
        List<Alunos> list = new ArrayList();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM alunos");
            ResultSet rs = stmt.executeQuery();
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return list;
    }
    
}
