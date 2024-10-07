
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Alunos;
import model.bean.Areas;
import model.bean.Disciplinas;
import model.bean.Notas;


public class AlunosDAO {
    
    public List<Alunos> listar() {
        
        List<Alunos> list = new ArrayList();
        List<Notas> list2 = new ArrayList();
        List<Areas> list3 = new ArrayList();
        List<Disciplinas> list4 = new ArrayList();
         
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("select notas.nota, notas.fk_id_aluno, notas.id_nota, notas.fk_id_disciplina, alunos.id_aluno, alunos.nome, alunos.sobrenome, alunos.email, alunos.senha, alunos.imagem, areas.nome as area, areas.id_area, areas.descricao, disciplinas.disciplina, disciplinas.id_disciplina from notas \n" +
            "inner join alunos on notas.fk_id_aluno = alunos.id_aluno\n" +
            "inner join disciplinas on notas.fk_id_disciplina = disciplinas.id_disciplina\n" +
            "inner join areas on disciplinas.fk_id_area = areas.id_area;");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Alunos aluno = new Alunos();
                Notas notas =  new Notas();
                Areas areas = new Areas();
                Disciplinas disciplina = new Disciplinas();
                
                aluno.setId_aluno(rs.getInt("id_aluno"));
                aluno.setNome(rs.getString("nome"));
                aluno.setSobrenome(rs.getString("sobrenome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setSenha(rs.getString("senha"));
                aluno.setImagem(rs.getString("imagem"));
                
                notas.setId_nota(rs.getInt("id_nota"));
                notas.setNota(rs.getFloat("nota"));
                notas.setFk_id_aluno(rs.getInt("fk_id_aluno"));
                notas.setFk_id_disciplina(rs.getInt("fk_id_disciplina"));
                
                areas.setId_area(rs.getInt("id_area"));
                areas.setNome(rs.getString("area"));
                areas.setDescricao(rs.getString("descricao"));
                
                disciplina.setId_disciplina(rs.getInt("id_disciplina"));
                disciplina.setDisciplina(rs.getString("disciplina"));
                
                list2.add(notas);
                list3.add(areas);
                list4.add(disciplina);
                
                aluno.setNotas(list2);
                aluno.setAreas(list3);
                aluno.setDisciplinas(list4);
                
                list.add(aluno);

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
