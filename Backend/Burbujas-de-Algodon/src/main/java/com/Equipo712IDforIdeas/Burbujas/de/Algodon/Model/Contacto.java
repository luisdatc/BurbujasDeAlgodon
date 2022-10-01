package com.Equipo712IDforIdeas.Burbujas.de.Algodon.Model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ltizzi
 */
@Getter
@Setter
public class Contacto {

  private String name;
  private String email;
  private String phone;
  private String message;

  public Contacto(String nombre, String email, String telefono, String mensaje) {
    this.name = nombre;
    this.email = email;
    this.phone = telefono;
    this.message = mensaje;
  }
}
