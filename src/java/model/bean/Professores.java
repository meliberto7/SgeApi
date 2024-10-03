package model.bean;


import java.util.Date;


public class Professores {
    
    private int id_professor, fk_id_area;
    private String nome, matricula, senha, email, imagem;
    private Date admissao;

    public Professores() {
    }

    
    
    public Professores(int id_professor, int fk_id_area, String nome, String matricula, String senha, String email, String imagem, Date admissao) {
        this.id_professor = id_professor;
        this.fk_id_area = fk_id_area;
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
        this.email = email;
        this.imagem = imagem;
        this.admissao = admissao;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public int getFk_id_area() {
        return fk_id_area;
    }

    public void setFk_id_area(int fk_id_area) {
        this.fk_id_area = fk_id_area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }
    
    
}
