package vg.yancarlos.huacre.hackathon.service;

import vg.yancarlos.huacre.hackathon.model.Noticia;

import java.util.List;

public interface NoticiaService {

    List<Noticia> listarNoticias();

    Noticia obtenerNoticiaPorId(Long id);

    Noticia crearNoticia(Noticia noticia);

    Noticia actualizarNoticia(Long id, Noticia noticia);

    void eliminarNoticia(Long id);
}
