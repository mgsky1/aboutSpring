package com.landicorp.creator;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * Created by Martin Huang on 2018/4/20.
 */
public class MyMessageCreator implements MessageCreator {

    private int id;

    public MyMessageCreator(int id)
    {
        this.id = id;
    }

    @Override
    public Message createMessage(Session session) throws JMSException {
        TextMessage message = session.createTextMessage("Spring-ActiveMQ发送的第【"+id+"】条消息");
        System.out.println("Spring-ActiveMQ发送的第【"+id+"】条消息");
        return message;
    }
}
