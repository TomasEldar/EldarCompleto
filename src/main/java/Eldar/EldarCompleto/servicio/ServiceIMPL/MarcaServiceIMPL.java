package Eldar.EldarCompleto.servicio.ServiceIMPL;

import Eldar.EldarCompleto.dao.MarcaDAO;
import Eldar.EldarCompleto.domain.Marca;
import Eldar.EldarCompleto.servicio.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MarcaServiceIMPL implements MarcaService {

    @Autowired
    private MarcaDAO marcaDAO;

    @Override
    @Transactional
    public void guardar(Marca marca) {
        marcaDAO.save(marca);
    }

    @Override
    @Transactional(readOnly = true)
    public Marca encontrarMarca(Marca marca) {
        return(marcaDAO.findById(marca.getIdMarca())).orElse(null);
    }
}
