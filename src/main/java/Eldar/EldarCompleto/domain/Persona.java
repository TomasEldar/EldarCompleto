package Eldar.EldarCompleto.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "persona")
public class Persona {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Long idPersona;

    @NotEmpty
    @Column(name = "nombre")
    private String nombre;

    @NotEmpty
    @Column(name = "apellido")
    private String apellido;

    @NotEmpty
    @Column(name = "dni")
    private String DNI;

    @OneToMany
    @JoinColumn(name = "idOperacion")
    private List<Operacion> operaciones = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "idTarjeta")
    private List<Tarjeta> tarjetas = new ArrayList<>();


}
