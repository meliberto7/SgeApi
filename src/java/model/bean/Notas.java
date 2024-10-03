
package model.bean;


public class Notas {
    
    private int id_nota, fk_id_aluno, fk_id_disciplina;
    private float nota;

    public Notas() {
    }

    public Notas(int id_nota, int fk_id_aluno, int fk_id_disciplina, float nota) {
        this.id_nota = id_nota;
        this.fk_id_aluno = fk_id_aluno;
        this.fk_id_disciplina = fk_id_disciplina;
        this.nota = nota;
    }

    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
    }

    public int getFk_id_aluno() {
        return fk_id_aluno;
    }

    public void setFk_id_aluno(int fk_id_aluno) {
        this.fk_id_aluno = fk_id_aluno;
    }

    public int getFk_id_disciplina() {
        return fk_id_disciplina;
    }

    public void setFk_id_disciplina(int fk_id_disciplina) {
        this.fk_id_disciplina = fk_id_disciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
    
}
