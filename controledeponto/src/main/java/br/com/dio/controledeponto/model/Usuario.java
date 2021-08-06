package br.com.dio.controledeponto.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime fimJornada;

    public Usuario(){

    }

    public Usuario(Long id, CategoriaUsuario categoriaUsuario, String nome,
                   Empresa empresa, NivelAcesso nivelAcesso, JornadaTrabalho jornadaTrabalho,
                        BigDecimal tolerancia, LocalDateTime inicioJornada, LocalDateTime fimJornada) {
        this.id = id;
        this.categoriaUsuario = categoriaUsuario;
        this.nome = nome;
        this.empresa = empresa;
        this.nivelAcesso = nivelAcesso;
        this.jornadaTrabalho = jornadaTrabalho;
        this.tolerancia = tolerancia;
        this.inicioJornada = inicioJornada;
        this.fimJornada = fimJornada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategoriaUsuario getCategoriaUsuario() {
        return categoriaUsuario;
    }

    public void setCategoriaUsuario(CategoriaUsuario categoriaUsuario) {
        this.categoriaUsuario = categoriaUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public JornadaTrabalho getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public void setJornadaTrabalho(JornadaTrabalho jornadaTrabalho) {
        this.jornadaTrabalho = jornadaTrabalho;
    }

    public BigDecimal getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(BigDecimal tolerancia) {
        this.tolerancia = tolerancia;
    }

    public LocalDateTime getInicioJornada() {
        return inicioJornada;
    }

    public void setInicioJornada(LocalDateTime inicioJornada) {
        this.inicioJornada = inicioJornada;
    }

    public LocalDateTime getFimJornada() {
        return fimJornada;
    }

    public void setFimJornada(LocalDateTime fimJornada) {
        this.fimJornada = fimJornada;
    }
}
