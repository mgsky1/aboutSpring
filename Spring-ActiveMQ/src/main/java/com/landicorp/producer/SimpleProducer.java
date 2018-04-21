package com.landicorp.producer;

import com.landicorp.creator.MyMessageCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Martin Huang on 2018/4/20.
 */
@Component(value = "producer")
public class SimpleProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage() throws Exception
    {
        //每次发送10条信息
        for(int i = 0 ; i < 10 ; i++)
        {
            //这里填入创建好的信息生成器
            jmsTemplate.send(new MyMessageCreator(i));
        }
    }
}
