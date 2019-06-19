package website.marcioheleno.forum.model;

import lombok.Data;

@Data
public class Curso {

    private Long id;
    private String nome;
    private String categoria;

    public Curso(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

}
