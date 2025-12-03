package vg.yancarlos.huacre.hackathon.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Noticia") // nombre exacto de la tabla en SQL Server
public class Noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "autor")
    private String autor;

    @Column(name = "estado")
    private boolean estado = true;
}
