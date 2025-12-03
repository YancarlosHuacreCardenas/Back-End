package vg.yancarlos.huacre.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vg.yancarlos.huacre.hackathon.model.Noticia;
import vg.yancarlos.huacre.hackathon.service.NoticiaService;

import java.util.List;

@RestController
@RequestMapping("/api/noticias")
@CrossOrigin("*")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;

    @GetMapping("/activas")
    public List<Noticia> listarActivas() {
        return noticiaService.listarActivas();
    }

    @GetMapping("/todas")
    public List<Noticia> listarTodas() {
        return noticiaService.listarTodas();
    }

    @GetMapping("/{id}")
    public Noticia obtenerPorId(@PathVariable Integer id) {
        return noticiaService.obtenerPorId(id);
    }

    @PostMapping
    public Noticia crear(@RequestBody Noticia noticia) {
        return noticiaService.crear(noticia);
    }

    @PutMapping("/{id}")
    public Noticia actualizar(@PathVariable Integer id, @RequestBody Noticia noticia) {
        return noticiaService.actualizar(id, noticia);
    }

    @PutMapping("/inactivar/{id}")
    public void inactivar(@PathVariable Integer id) {
        noticiaService.inactivar(id);
    }

    @PutMapping("/activar/{id}")
    public void activar(@PathVariable Integer id) {
        noticiaService.activar(id);
    }
}
