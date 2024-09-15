package com.educacionit.practica9.controlador;

import com.educacionit.practica9.modelo.Ropa;
import com.educacionit.practica9.repositorios.RopaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RopaControlador {

  @Autowired
  private RopaRepositorio ropaRepositorio;

  @PostMapping("/guardar")
  public Ropa guardarRopa(@RequestBody Ropa ropa) {
    return ropaRepositorio.save(ropa);
  }
}
