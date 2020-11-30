package com.example.buensaborserv.controllers;

import com.example.buensaborserv.entities.Platos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.buensaborserv.services.PlatoServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/v1/platos")
public class PlatoController extends BaseControllerImpl<Platos, PlatoServiceImpl> {
    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\""+e.getMessage()+"\"}"));
        }
    }
}
