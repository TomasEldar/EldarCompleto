package Eldar.EldarCompleto.controlador;

import Eldar.EldarCompleto.domain.Tarjeta;
import Eldar.EldarCompleto.servicio.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorTarjeta {

    @Autowired
    private TarjetaService tarjetaService;

    @GetMapping("tarjeta")
    public Tarjeta obtenerTarjeta(@RequestBody Tarjeta tarjeta){
        return (tarjetaService.encontrarTarjeta(tarjeta));
    }

    @PostMapping("tarjeta/guardar")
    public void guardarTarjeta(@RequestBody Tarjeta tarjeta){
        tarjetaService.guardar(tarjeta);
    }

}
