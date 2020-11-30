package com.example.buensaborserv.services;

import com.example.buensaborserv.entities.Platos;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.buensaborserv.repositories.BaseRepository;
import com.example.buensaborserv.repositories.PlatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoServiceImpl extends BaseServiceImpl<Platos,Long> implements PlatoService {
    @Autowired
    private PlatoRepository platoRepository;

    public PlatoServiceImpl(BaseRepository<Platos, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Platos> search(String filtro) throws Exception {
        try{
            List <Platos> platos = platoRepository.search(filtro);
            return platos;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
