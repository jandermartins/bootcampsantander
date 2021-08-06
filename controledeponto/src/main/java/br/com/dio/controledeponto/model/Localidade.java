package br.com.dio.controledeponto.model;

import javax.persistence.*;

@Entity
@Table(name = "localidade")
public class Localidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;

    public Localidade(){

    }

    public Localidade(Long id, NivelAcesso nivelAcesso, String descricao) {
        this.id = id;
        this.nivelAcesso = nivelAcesso;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
