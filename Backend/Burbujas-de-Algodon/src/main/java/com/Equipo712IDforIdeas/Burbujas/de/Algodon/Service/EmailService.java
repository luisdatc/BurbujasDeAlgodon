package com.Equipo712IDforIdeas.Burbujas.de.Algodon.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author ltizzi
 */
@Service
@AllArgsConstructor
public class EmailService implements EmailSender {

  private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

  private final JavaMailSender mailSender;

  @Override
  @Async
  public void send(String email) {

    try {
      MimeMessage mimeMessage = mailSender.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");

      helper.setText(email, true);
      helper.setTo("terlizzileonardo@gmail.com");
      helper.setSubject("Contacto");
      helper.setFrom("api-noreply@BurbujasDeAlgodon.com");
      mailSender.send(mimeMessage);
    } catch (MessagingException e) {
      LOGGER.error("failed to send email", e);

      throw new IllegalStateException("failed to send email");
    }
  }
}
