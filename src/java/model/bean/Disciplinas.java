
package model.bean;


public class Disciplinas {
    
   private int id_disciplina, fk_id_area;
   private String disciplina;

    public Disciplinas(int id_disciplina, int fk_id_area, String disciplina) {
        this.id_disciplina = id_disciplina;
        this.fk_id_area = fk_id_area;
        this.disciplina = disciplina;
    }

    public Disciplinas() {
    }

    public int getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public int getFk_id_area() {
        return fk_id_area;
    }

    public void setFk_id_area(int fk_id_area) {
        this.fk_id_area = fk_id_area;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
   
   
}
