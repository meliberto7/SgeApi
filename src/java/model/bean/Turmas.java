package model.bean;

import java.util.List;


public class Turmas {
    
    private int id_turma;
    private String turma;
    private List<Disciplinas> disciplinas;

    public Turmas(int id_turma, String turma, List<Disciplinas> disciplinas) {
        this.id_turma = id_turma;
        this.turma = turma;
        this.disciplinas = disciplinas;
    }

    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    
    
}
