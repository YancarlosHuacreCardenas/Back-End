package vg.yancarlos.huacre.hackathon.service.impl;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import vg.yancarlos.huacre.hackathon.model.Noticia;
import vg.yancarlos.huacre.hackathon.repository.NoticiaRepository;
import vg.yancarlos.huacre.hackathon.service.NoticiaService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticiaServiceImpl implements NoticiaService {

    private final NoticiaRepository repository;

    @Override
    public List<Noticia> listarActivas() {
        return repository.findByEstadoTrue();
    }

    @Override
    public List<Noticia> listarTodas() {
        return repository.findAll();
    }

    @Override
    public Noticia obtenerPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Noticia crear(Noticia noticia) {
        return repository.save(noticia);
    }

    @Override
    public Noticia actualizar(Integer id, Noticia datos) {
        Noticia n = obtenerPorId(id);
        if (n == null) return null;

        n.setTitulo(datos.getTitulo());
        n.setContenido(datos.getContenido());
        n.setCategoria(datos.getCategoria());
        n.setAutor(datos.getAutor());
        n.setEstado(datos.isEstado());

        return repository.save(n);
    }

    @Override
    public void inactivar(Integer id) {
        Noticia n = obtenerPorId(id);
        if (n != null) {
            n.setEstado(false);
            repository.save(n);
        }
    }

    @Override
    public void activar(Integer id) {
        Noticia n = obtenerPorId(id);
        if (n != null) {
            n.setEstado(true);
            repository.save(n);
        }
    }
}
