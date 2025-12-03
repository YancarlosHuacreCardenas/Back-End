package vg.yancarlos.huacre.hackathon.service;

import vg.yancarlos.huacre.hackathon.model.Corresponsal;

import java.util.List;

public interface CorresponsalService {

    Corresponsal registrar(Corresponsal corresponsal);

    List<Corresponsal> listar();

    Corresponsal obtener(Long id);

    Corresponsal actualizar(Long id, Corresponsal datos);

    void eliminar(Long id);
}
