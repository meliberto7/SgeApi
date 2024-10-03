
package model.bean;

import java.util.List;


public class Alunos {
    
    private int id_aluno;
    private String nome, sobrenome, email, senha, imagem;
    private List<Notas> notas;
    private List<Areas> areas;
    private List<Disciplinas> disciplinas;

    public Alunos(int id_aluno, String nome, String sobrenome, String email, String senha, String imagem, List<Notas> notas, List<Areas> areas, List<Disciplinas> disciplinas) {
        this.id_aluno = id_aluno;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.imagem = imagem;
        this.notas = notas;
        this.areas = areas;
        this.disciplinas = disciplinas;
    }

    public List<Areas> getAreas() {
        return areas;
    }

    public void setAreas(List<Areas> areas) {
        this.areas = areas;
    }

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Notas> getNotas() {
        return notas;
    }

    public void setNotas(List<Notas> notas) {
        this.notas = notas;
    }

    public Alunos() {
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
    
}
