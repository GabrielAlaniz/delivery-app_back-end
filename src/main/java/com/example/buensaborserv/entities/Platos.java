package com.example.buensaborserv.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="platos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Platos extends Base {
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private String precio;
    @Column(name="rubro")
    private String rubro;
    @Column(name="imagenPath")
    private String imagenPath;
    @Column(name="ingredientes")
    private ArrayList<String> ingredientes = new ArrayList<>();
}
