package vg.yancarlos.huacre.hackathon.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vg.yancarlos.huacre.hackathon.model.Corresponsal;
import vg.yancarlos.huacre.hackathon.repository.CorresponsalRepository;
import vg.yancarlos.huacre.hackathon.service.CorresponsalService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CorresponsalServiceImpl implements CorresponsalService {

    private final CorresponsalRepository repository;

    @Override
    public Corresponsal registrar(Corresponsal corresponsal) {
        return repository.save(corresponsal);
    }

    @Override
    public List<Corresponsal> listar() {
        return repository.findAll();
    }

    @Override
    public Corresponsal obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Corresponsal actualizar(Long id, Corresponsal datos) {
        Corresponsal c = obtener(id);
        if (c == null) return null;

        c.setNombreCompleto(datos.getNombreCompleto());
        c.setDocumento(datos.getDocumento());
        c.setPais(datos.getPais());
        c.setDepartamento(datos.getDepartamento());
        c.setProvincia(datos.getProvincia());
        c.setDistrito(datos.getDistrito());
        c.setCentroPoblado(datos.getCentroPoblado());
        c.setAnexo(datos.getAnexo());
        c.setCaseiro(datos.getCaseiro());
        c.setActivo(datos.isActivo());

        return repository.save(c);
    }

    @Override
    public void eliminar(Long id) {
        Corresponsal c = obtener(id);
        if (c != null) {
            c.setActivo(false); // ELIMINACIÓN LÓGICA
            repository.save(c);
        }
    }
}
