package com.example.buensaborserv.services;

import com.example.buensaborserv.entities.Platos;

import java.util.List;

public interface PlatoService extends BaseService<Platos,Long> {
    List<Platos> search(String filtro) throws Exception;
}
