package com.Equipo712IDforIdeas.Burbujas.de.Algodon.Controller;

import com.Equipo712IDforIdeas.Burbujas.de.Algodon.Model.Contacto;
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
public class ContactoController {

  @Autowired private EmailSender mailServ;

  @PostMapping("/api/contacto")
  public void mandarContacto(@RequestBody Contacto form) {
    //    Map<String, String> mailData = new HashMap<String, String>();
    //    mailData.put("nombre", form.getNombre());
    //    mailData.put("email", form.getEmail());
    //    mailData.put("telefono", form.getTelefono());
    //    mailData.put("mensaje", form.getMensaje());
    String templateString =
        "Tipo: Contacto \n"
            + "Nombre: "
            + form.getNombre()
            + "\n\n"
            + " Email: "
            + form.getEmail()
            + " \n\n"
            + " Telefono: "
            + form.getTelefono()
            + "\n\n"
            + "Mensaje: "
            + "\n\n"
            + form.getMensaje();
    //    StringSubstitutor sub = new StringSubstitutor(mailData);
    //    String resolvedString = sub.replace(templateString);
    mailServ.send(templateString);
  }
}
