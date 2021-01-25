package uk.nhs.prm.deductions.test;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;

@Component
public class JmsConsumer {

    public JmsConsumer() {
        System.out.println("in jms consumer");
    }

    @JmsListener(destination = "${active-mq.queue}")
    public void onMessage(Message message) throws Exception {
        try {
            ActiveMQTextMessage objectMessage = (ActiveMQTextMessage)message;
            System.out.println("Received Message: "+ objectMessage.getText());

        } catch(Exception e) {
            System.out.println("Received Exception : "+ e);
        }
    }
}
