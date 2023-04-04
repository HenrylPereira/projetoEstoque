package br.univille.projfabsoft2023.entity;

import javax.persistence.*;
import java.util.List;

@Entity()
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private String password;

    public Categoria(String titulo, String descricao, String password) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.password = password;
    }

    public Categoria() {

    }
}