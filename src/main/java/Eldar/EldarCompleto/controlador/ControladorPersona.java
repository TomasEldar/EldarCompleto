package Eldar.EldarCompleto.controlador;

import Eldar.EldarCompleto.domain.Persona;
import Eldar.EldarCompleto.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorPersona {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/persona")
    public Persona obtenerPersona(@RequestBody Persona p){
        return(personaService.encontrarPersona(p));
    }

    @PostMapping("/persona/guardar")
    public void crearPersona(@RequestBody Persona p){
        personaService.guardar(p);
    }


}