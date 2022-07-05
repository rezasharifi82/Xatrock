package xatrock;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
    class Email{

        public static void send(String reciver_address,String subject,String text)
        {
            final String to = reciver_address;
            final String from = "noreply.xatrock@yahoo.com";

            String host = "smtp.mail.yahoo.com";
            Properties properties = System.getProperties();

            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.auth", "true");

            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("noreply.xatrock", "fqufkuwvavqrdvlo");
                }
            });
            try {
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                message.setSubject(subject);
                message.setText(text);
                Transport.send(message);
            } catch (MessagingException mex) {
                mex.printStackTrace();
            }
        }

        public static String developer() {
            return "developed by: \n\n Xatrock team";
        }

    }