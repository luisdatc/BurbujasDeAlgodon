package com.Equipo712IDforIdeas.Burbujas.de.Algodon.Model;

import lombok.Data;

/**
 * @author ltizzi
 */
@Data
public class Inscripcion {

  private String name;
  private String email;
  private String phone;
  private String studentName;
  private int age;
  private int horario; // 1- 9-13 2- 14-18

  public Inscripcion(
      String name, String email, String phone, String studentName, int age, int horario) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.studentName = studentName;
    this.age = age;
    this.horario = horario;
  }
}
