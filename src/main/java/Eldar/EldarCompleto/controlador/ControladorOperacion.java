package Eldar.EldarCompleto.controlador;

import Eldar.EldarCompleto.domain.Operacion;
import Eldar.EldarCompleto.servicio.OperacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControladorOperacion {

    @Autowired
    private OperacionesService operacionesService;

    @GetMapping("/operaciones")
    public Operacion obtenerOperacion(@RequestBody Operacion operacion) throws Exception{
        return(operacionesService.encontrarOperacion(operacion));
    }

    @PostMapping("/operaciones/guardar")
    public void guardarOperacion(Operacion operacion) throws Exception{
        operacionesService.guardar(operacion);
    }

    @ExceptionHandler()
    public String handleException(Exception e){
        return e.getMessage();
    }

}
