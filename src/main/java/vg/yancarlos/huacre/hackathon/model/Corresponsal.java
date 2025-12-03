package vg.yancarlos.huacre.hackathon.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Corresponsal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCompleto;
    private String documento;
    private String pais;
    private String departamento;
    private String provincia;
    private String distrito;
    private String centroPoblado;
    private String anexo;
    private String caseiro;

    private boolean activo = true;
}
