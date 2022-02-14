package Eldar.EldarCompleto.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "operacion")
public class Operacion {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOperacion")
    private Long idOperacion;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona idPersona;

    @NotNull
    @Column(name = "monto")
    private double monto;

    @NotNull
    @Column(name = "tasaOperacion")
    private float tasaOperacion;

    public boolean isValida(){
        if (this.monto < 1000){
            return true;
        } else {
            return false;
        }
    }
}
