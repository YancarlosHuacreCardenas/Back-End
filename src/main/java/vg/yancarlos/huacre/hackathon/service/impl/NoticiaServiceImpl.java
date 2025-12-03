package vg.yancarlos.huacre.hackathon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vg.yancarlos.huacre.hackathon.model.Noticia;
import vg.yancarlos.huacre.hackathon.repository.NoticiaRepository;
import vg.yancarlos.huacre.hackathon.service.NoticiaService;

import java.util.List;

@Service
public class NoticiaServiceImpl implements NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;

    @Override
    public List<Noticia> listarNoticias() {
        return noticiaRepository.findAll();
    }

    @Override
    public Noticia obtenerNoticiaPorId(Long id) {
        return noticiaRepository.findById(id).orElse(null);
    }

    @Override
    public Noticia crearNoticia(Noticia noticia) {
        return noticiaRepository.save(noticia);
    }

    @Override
    public Noticia actualizarNoticia(Long id, Noticia noticia) {
        Noticia noticiaExistente = noticiaRepository.findById(id).orElse(null);
        if (noticiaExistente != null) {
            noticiaExistente.setTitulo(noticia.getTitulo());
            noticiaExistente.setContenido(noticia.getContenido());
            noticiaExistente.setFecha(noticia.getFecha());
            return noticiaRepository.save(noticiaExistente);
        }
        return null;
    }

    @Override
    public void eliminarNoticia(Long id) {
        noticiaRepository.deleteById(id);
    }
}
