package vg.yancarlos.huacre.hackathon.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import vg.yancarlos.huacre.hackathon.model.Corresponsal;
import vg.yancarlos.huacre.hackathon.service.CorresponsalService;

import java.util.List;

@RestController
@RequestMapping("/api/corresponsales")
@RequiredArgsConstructor
public class CorresponsalController {

    private final CorresponsalService service;

    @PostMapping
    public Corresponsal crear(@RequestBody Corresponsal c) {
        return service.registrar(c);
    }

    @GetMapping
    public List<Corresponsal> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Corresponsal obtener(@PathVariable Long id) {
        return service.obtener(id);
    }

    @PutMapping("/{id}")
    public Corresponsal actualizar(@PathVariable Long id, @RequestBody Corresponsal c) {
        return service.actualizar(id, c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
