package Eldar.EldarCompleto.servicio.ServiceIMPL;

import Eldar.EldarCompleto.dao.OperacionDAO;
import Eldar.EldarCompleto.domain.Operacion;
import Eldar.EldarCompleto.servicio.OperacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OperacionesServiceIMPL implements OperacionesService {

    @Autowired
    private OperacionDAO operacionDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Operacion> listarOperaciones() {
        return operacionDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Operacion operacion) {
        operacionDAO.save(operacion);
    }

    @Override
    @Transactional
    public void eliminar(Operacion operacion) {
        operacionDAO.delete(operacion);
    }

    @Override
    @Transactional(readOnly = true)
    public Operacion encontrarOperacion(Operacion operacion) {
        return(operacionDAO.findById(operacion.getIdOperacion())).orElse(null);
    }
}
