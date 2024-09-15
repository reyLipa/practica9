package com.educacionit.practica9.modelo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ropas")
public class Ropa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String nombre;
    @Column(length = 30, nullable = false)
    private String tipoMaterial;
    @Column(length = 30, nullable = false)
    private String talla;

    private Double precio;
    @Column(length = 30, nullable = false)
    private String temporada;
    @Column(length = 30, nullable = false)
    private String marca;
    @Column(length = 10, nullable = false)
    private String genero;


    public Ropa() {}

    public Ropa(Long id, String nombre, String tipoMaterial, String talla, Double precio, String temporada, String marca, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.tipoMaterial = tipoMaterial;
        this.talla = talla;
        this.precio = precio;
        this.temporada = temporada;
        this.marca = marca;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

