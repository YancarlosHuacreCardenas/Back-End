package vg.yancarlos.huacre.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vg.yancarlos.huacre.hackathon.model.Noticia;

import java.util.List;

public interface NoticiaRepository extends JpaRepository<Noticia, Integer> {

    // Solo noticias activas
    List<Noticia> findByEstadoTrue();

    // Solo noticias inactivas
    List<Noticia> findByEstadoFalse();
}
