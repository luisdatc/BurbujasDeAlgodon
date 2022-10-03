package com.Equipo712IDforIdeas.Burbujas.de.Algodon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BurbujasDeAlgodonApplication {

  public static void main(String[] args) {
    SpringApplication.run(BurbujasDeAlgodonApplication.class, args);
  }

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry
            .addMapping("/**")
            .allowedHeaders("*")
            .allowedMethods("POST")
            .allowCredentials(false)
            .allowedOrigins(("https://burbujasdealgodon.netlify.app/"));
      }
    };
  }
}
