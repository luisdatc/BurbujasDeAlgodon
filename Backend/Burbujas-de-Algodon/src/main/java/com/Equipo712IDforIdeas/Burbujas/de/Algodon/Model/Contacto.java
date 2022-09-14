package com.Equipo712IDforIdeas.Burbujas.de.Algodon.Model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ltizzi
 */
@Getter
@Setter
public class Contacto {

  private String nombre;
  private String email;
  private String telefono;
  private String mensaje;

  public Contacto(String nombre, String email, String telefono, String mensaje) {
    this.nombre = nombre;
    this.email = email;
    this.telefono = telefono;
    this.mensaje = mensaje;
  }
}
