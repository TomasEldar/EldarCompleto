package Eldar.EldarCompleto.controlador;

import Eldar.EldarCompleto.domain.Marca;
import Eldar.EldarCompleto.servicio.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorMarca {

    @Autowired
    private MarcaService marcaService;

    @GetMapping("marca")
    public Marca ObtenerMarca(@RequestBody Marca marca){
        return (marcaService.encontrarMarca(marca));
    }

    @PostMapping("marca/guardar")
    public void GuardarMarca(@RequestBody Marca marca){
        marcaService.guardar(marca);
    }


}
