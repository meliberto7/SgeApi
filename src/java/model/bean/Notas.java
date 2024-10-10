package model.bean;


public class Notas {
    
    private int id_nota;
    private float nota;

    public Notas() {
    }

    public Notas(int id_nota, float nota) {
        this.id_nota = id_nota;
        this.nota = nota;
    }

    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }  
    
}
