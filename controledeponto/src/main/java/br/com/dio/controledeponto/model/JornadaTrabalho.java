package br.com.dio.controledeponto.model;

import javax.persistence.*;

@Entity
@Table(name = "jornada_trabalho")
public class JornadaTrabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String descricao;

    public JornadaTrabalho(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public JornadaTrabalho(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "JornadaTrabalho{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
