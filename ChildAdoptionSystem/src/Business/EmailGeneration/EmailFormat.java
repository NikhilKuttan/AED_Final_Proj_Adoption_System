/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmailGeneration;


import java.util.Properties;  
import javax.mail.Session;  
import javax.mail.internet.*;
import javax.mail.*;
import javax.mail.MessagingException;
import javax.mail.Transport;
/**
 *
 * @author simran
 */
public class EmailFormat {
    private String to;
    private String from;
    private String textBody;
    private String host = "smtp.gmail.com";
    private String password;
    private String subject;

    public EmailFormat(String to, String message, String sub) {
        this.to = to;
        this.from = "taskplannermernproject@gmail.com";
        this.textBody = message;
        this.password = "taskplannermernproject@123";
        this.subject = sub;
        
    }
  
    public void sendEmail(){
      Properties properties = new Properties();
      properties.setProperty("mail.smtp.host", host);  
      properties.put("mail.smtp.auth", "true");  
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "587"); 
      Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    return new PasswordAuthentication(from,password);  
      }  
      } );
      try {
         // Create a default MimeMessage object.
        Message message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject(subject);

         // Now set the actual message
         message.setContent(textBody, "text/html");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }   
}
}
