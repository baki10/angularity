package js.angular.common;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by ilmir on 05.07.16.
 */
public class MailMail {
  private MailSender mailSender;

  public MailSender getMailSender() {
    return mailSender;
  }

  public void setMailSender(MailSender mailSender) {
    this.mailSender = mailSender;
  }

  public void sendMail(String from, String to, String subject, String msg) {

    SimpleMailMessage message = new SimpleMailMessage();

    message.setFrom(from);
    message.setTo(to);
    message.setSubject(subject);
    message.setText(msg);
    mailSender.send(message);
  }
}
