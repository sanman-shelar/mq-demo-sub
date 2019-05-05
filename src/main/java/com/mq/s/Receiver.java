package com.mq.s;

import java.util.List;
import javax.jms.JMSException;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

  @JmsListener(destination = "${ibm.queue.name}")
  public void receiveMessage(List<SubscriberPerson> persons) throws JMSException {   
   
    for(SubscriberPerson person: persons)
      System.out.println("Received <" + person + ">");
  }

}
