package model.bean;

import java.sql.Date;


public class Tarefas {
    
    private int id_tarefa;
    private String tarefa, descircao_tarefa;
    private Date data_entrega;
    private Notas nota;

    public Tarefas() {
    }

    public Tarefas(int id_tarefa, String tarefa, String descircao_tarefa, Date data_entrega, Notas nota) {
        this.id_tarefa = id_tarefa;
        this.tarefa = tarefa;
        this.descircao_tarefa = descircao_tarefa;
        this.data_entrega = data_entrega;
        this.nota = nota;
    }

    public int getId_tarefa() {
        return id_tarefa;
    }

    public void setId_tarefa(int id_tarefa) {
        this.id_tarefa = id_tarefa;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getDescircao_tarefa() {
        return descircao_tarefa;
    }

    public void setDescircao_tarefa(String descircao_tarefa) {
        this.descircao_tarefa = descircao_tarefa;
    }

    public Date getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(Date data_entrega) {
        this.data_entrega = data_entrega;
    }

    public Notas getNota() {
        return nota;
    }

    public void setNota(Notas nota) {
        this.nota = nota;
    }
    
    
    
}
