package br.com.dio.controledeponto.model;

import javax.persistence.*;

@Entity
@Table(name = "calendario")
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private TipoData tipoData;
}
