package model.bean;

import java.util.List;


public class Alunos {
    
    private int id_aluno;
    private String nome, sobrenome, email, imagem;
    private List<Tarefas> tarefas;
    private Turmas turma;

    public Alunos() {
    }

    public Alunos(int id_aluno, String nome, String sobrenome, String email, String imagem, List<Tarefas> tarefas, Turmas turma) {
        this.id_aluno = id_aluno;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.imagem = imagem;
        this.tarefas = tarefas;
        this.turma = turma;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public List<Tarefas> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefas> tarefas) {
        this.tarefas = tarefas;
    }

    public Turmas getTurma() {
        return turma;
    }

    public void setTurma(Turmas turma) {
        this.turma = turma;
    }
    
    
    
}
