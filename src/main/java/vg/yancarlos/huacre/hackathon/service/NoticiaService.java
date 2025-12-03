package vg.yancarlos.huacre.hackathon.service;

import vg.yancarlos.huacre.hackathon.model.Noticia;

import java.util.List;

public interface NoticiaService {

    List<Noticia> listarActivas();

    List<Noticia> listarTodas();

    Noticia obtenerPorId(Integer id);

    Noticia crear(Noticia noticia);

    Noticia actualizar(Integer id, Noticia noticia);

    void inactivar(Integer id);

    void activar(Integer id);
}
