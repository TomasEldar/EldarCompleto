package Eldar.EldarCompleto.servicio;


import Eldar.EldarCompleto.domain.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> listarPersonas();

    void guardar(Persona persona);

    void eliminar(Persona persona);

    Persona encontrarPersona (Persona persona);
}
