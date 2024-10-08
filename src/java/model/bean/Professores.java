package model.bean;

import java.util.List;

public class Professores {
    
    private int id_professor;
    private String nome, sobrenome, senha, email, imagem;
    private List<Disciplinas> disciplinas;

    public Professores() {
    }

    
    
    public Professores(int id_professor, String nome, String sobrenome, String senha, String email, String imagem, List<Disciplinas> disciplinas) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.email = email;
        this.imagem = imagem;
        this.disciplinas = disciplinas;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    
    
}
