package vg.yancarlos.huacre.hackathon.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "noticia")
@Data
public class Noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String contenido;

    private LocalDate fecha;
}
