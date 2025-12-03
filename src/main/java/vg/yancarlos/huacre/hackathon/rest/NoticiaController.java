package vg.yancarlos.huacre.hackathon.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import vg.yancarlos.huacre.hackathon.model.Noticia;
import vg.yancarlos.huacre.hackathon.service.NoticiaService;

import java.util.List;

@RestController
@RequestMapping("/api/noticias")
@RequiredArgsConstructor
public class NoticiaController {

    private final NoticiaService service;

    @PostMapping
    public Noticia crear(@RequestBody Noticia noticia) {
        return service.crearNoticia(noticia);
    }

    @GetMapping
    public List<Noticia> listar() {
        return service.listarNoticias();
    }

    @GetMapping("/{id}")
    public Noticia obtener(@PathVariable Long id) {
        return service.obtenerNoticiaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminarNoticia(id);
    }
}
