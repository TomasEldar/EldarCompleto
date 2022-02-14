package Eldar.EldarCompleto.servicio;

import Eldar.EldarCompleto.domain.Marca;
import Eldar.EldarCompleto.domain.Operacion;
import org.springframework.transaction.annotation.Transactional;

public interface MarcaService {

    void guardar(Marca marca);

    Marca encontrarMarca(Marca marca);
}
