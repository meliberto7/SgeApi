
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Areas;
import model.bean.Disciplinas;


public class DisciplinasDAO {
    
    public List<Disciplinas> listar() {
        
        List<Disciplinas> list = new ArrayList();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT dis.id_disciplina, dis.disciplina,"
                    + "areas.id_area, areas.nome as nome_area, areas.descricao as descricao_area "
                    + "FROM disciplinas as dis "
                    + "INNER JOIN areas ON dis.fk_id_area = areas.id_area");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Disciplinas dis = new Disciplinas();
                Areas are = new Areas();
                
                dis.setDisciplina(rs.getString("disciplina"));
                dis.setId_disciplina(rs.getInt("id_disciplina"));
                
                are.setId_area(rs.getInt("id_area"));
                are.setNome(rs.getString("nome_area"));
                are.setDescricao(rs.getString("descricao_area"));
                
                dis.setArea(are);
                
                list.add(dis);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return list;
    }
    
    public Disciplinas lerDisciplinaEspecifica(int id) {
        
        Disciplinas disciplina = new Disciplinas();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT dis.id_disciplina, dis.disciplina, \n" +
            "areas.id_area, areas.nome as nome_area, areas.descricao as descricao_area \n" +
            "FROM disciplinas as dis \n" +
            "INNER JOIN areas ON dis.fk_id_area = areas.id_area WHERE dis.id_disciplina = ?");
            
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {

                Areas are = new Areas();
                
                disciplina.setDisciplina(rs.getString("disciplina"));
                disciplina.setId_disciplina(rs.getInt("id_disciplina"));
                
                are.setId_area(rs.getInt("id_area"));
                are.setNome(rs.getString("nome_area"));
                are.setDescricao(rs.getString("descricao_area"));
                
                disciplina.setArea(are);
                 
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return disciplina;
    }
    
}
