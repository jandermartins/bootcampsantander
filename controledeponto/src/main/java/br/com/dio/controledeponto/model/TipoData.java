package br.com.dio.controledeponto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_data")
public class TipoData {

    @Id
    @GeneratedValue
    private Long id;
    private String descricao;

    public TipoData(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public TipoData(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
