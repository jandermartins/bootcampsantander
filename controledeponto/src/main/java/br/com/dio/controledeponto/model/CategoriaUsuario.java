package br.com.dio.controledeponto.model;


import javax.persistence.*;

@Entity
@Table(name="categoria_usuario")
public class CategoriaUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;

    public CategoriaUsuario(){

    }

    public CategoriaUsuario(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return "JornadaTrabalho{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
