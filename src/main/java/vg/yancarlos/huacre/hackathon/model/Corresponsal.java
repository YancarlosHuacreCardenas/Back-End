package vg.yancarlos.huacre.hackathon.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Corresponsal")
public class Corresponsal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombreCompleto")
    private String nombreCompleto;

    @Column(name = "documento")
    private String documento;

    @Column(name = "pais")
    private String pais;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "centroPoblado")
    private String centroPoblado;

    @Column(name = "anexo")
    private String anexo;

    @Column(name = "caseiro")
    private String caseiro;

    @Column(name = "activo")
    private boolean activo = true;
}
