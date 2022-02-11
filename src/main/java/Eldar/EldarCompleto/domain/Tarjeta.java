package Eldar.EldarCompleto.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@Table(name = "tarjeta")
public class Tarjeta implements Serializable {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTarjeta")
    private Long idTarjeta;

    @NotNull
    private String numeroTarjeta;

    @ManyToOne
    @JoinColumn(name = "idMarca")
    private Marca idMarca;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona idPersona;

}
