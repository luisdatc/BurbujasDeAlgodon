package com.Equipo712IDforIdeas.Burbujas.de.Algodon.Controller;

import com.Equipo712IDforIdeas.Burbujas.de.Algodon.Model.Inscripcion;
import com.Equipo712IDforIdeas.Burbujas.de.Algodon.Service.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ltizzi
 */
@RestController
@CrossOrigin
public class InscripcionController {

  @Autowired private EmailSender mailServ;

  @PostMapping("/api/inscripcion")
  public void sendInscription(@RequestBody Inscripcion ins) {
    int horario = ins.getHorario();
    String turno = "";
    if (horario == 1) {
      turno = "Mañana - 9:00 a 13:00";
    }
    if (horario == 2) {
      turno = "Tarde - 14:00 a 18:00";
    }
    String templateString =
        "Tipo: Preinscripcion \n"
            + "Nombre: "
            + ins.getName()
            + "\n\n"
            + " Email: "
            + ins.getEmail()
            + " \n\n"
            + " Telefono: "
            + ins.getPhone()
            + "\n\n"
            + "Nombre de estudiante: "
            + "\n\n"
            + ins.getStudentName()
            + "\n\n"
            + "Edad: "
            + "\n\n"
            + ins.getAge()
            + "\n\n"
            + "Horario: "
            + "\n\n"
            + turno;
    mailServ.send(templateString);
  }
}
