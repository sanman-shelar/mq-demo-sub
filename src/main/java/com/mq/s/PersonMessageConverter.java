
package com.mq.s;

import java.util.ArrayList;
import java.util.List;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class PersonMessageConverter implements MessageConverter {

  @Autowired
  ObjectMapper mapper;
  
  public Message toMessage(Object object, Session session)
      throws JMSException, MessageConversionException {
    return null;
  }

  public Object fromMessage(Message message) throws JMSException, MessageConversionException {
    TextMessage textMessage = (TextMessage) message;
    String payload = textMessage.getText();

    List<SubscriberPerson> persons = new ArrayList<>();
    try {
      persons = mapper.readValue(payload, new TypeReference<List<SubscriberPerson>>() {});
    } catch (Exception e) {
      System.out.println( "Error with payload: " + payload);
    }
    return persons;
  }
}

