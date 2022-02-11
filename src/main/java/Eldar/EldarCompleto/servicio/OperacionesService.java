package Eldar.EldarCompleto.servicio;

import Eldar.EldarCompleto.domain.Operacion;

import java.util.List;

public interface OperacionesService {

    List<Operacion> listarOperaciones();

    void guardar(Operacion operacion);

    void eliminar(Operacion operacion);

    Operacion encontrarOperacion(Operacion operacion);
}
