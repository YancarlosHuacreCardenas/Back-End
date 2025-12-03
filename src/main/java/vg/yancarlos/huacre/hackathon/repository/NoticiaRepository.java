package vg.yancarlos.huacre.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vg.yancarlos.huacre.hackathon.model.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
}
