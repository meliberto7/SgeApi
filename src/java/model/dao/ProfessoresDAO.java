
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Disciplinas;
import model.bean.Professores;


public class ProfessoresDAO {
    
    public List<Professores> listar() {
     
        List<Professores> list = new ArrayList();
        List<Integer> listIds = new ArrayList();
        DisciplinasDAO dao = new DisciplinasDAO();
        Prof_DisDAO dao2 = new Prof_DisDAO();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM professores");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                List<Disciplinas> listDis = new ArrayList();
                Professores prof = new Professores();
                
                prof.setId_professor(rs.getInt("id_professor"));
                prof.setNome(rs.getString("nome"));
                prof.setEmail(rs.getString("email"));
                prof.setImagem(rs.getString("imagem"));
                prof.setSobrenome(rs.getString("sobrenome"));
                
                listIds = dao2.buscar(prof.getId_professor());

                for (int i = 0; i < listIds.size(); i++) {

                    Disciplinas dis = dao.lerDisciplinaEspecifica(listIds.get(i));

                    listDis.add(dis);
                    
                }
                
                prof.setDisciplinas(listDis);

                list.add(prof);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return list;
    }
        
}
