
package model.bean;


public class Disciplinas {
    
   private int id_disciplina;
   private String disciplina;
   private Areas area;

    public Disciplinas(int id_disciplina, String disciplina, Areas area) {
        this.id_disciplina = id_disciplina;
        this.disciplina = disciplina;
        this.area = area;
    }

    public Areas getArea() {
        return area;
    }

    public void setArea(Areas area) {
        this.area = area;
    }

    public Disciplinas() {
    }

    public int getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }  
   
   
}
