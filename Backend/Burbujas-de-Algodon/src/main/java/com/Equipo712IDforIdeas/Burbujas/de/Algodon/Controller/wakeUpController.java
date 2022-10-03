package com.Equipo712IDforIdeas.Burbujas.de.Algodon.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ltizzi
 */
@RestController
@CrossOrigin
public class wakeUpController {

  @GetMapping("/api/status")
  public int getStatus() {
    return 200;
  }
}
