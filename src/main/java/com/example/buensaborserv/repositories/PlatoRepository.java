package com.example.buensaborserv.repositories;

import com.example.buensaborserv.entities.Platos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlatoRepository extends BaseRepository<Platos, Long>{
    @Query(value = "SELECT p FROM Platos p WHERE p.nombre LIKE %:filtro%")
    List<Platos> search(@Param("filtro") String filtro);
}
