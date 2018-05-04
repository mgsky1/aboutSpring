import com.test.producer.SimpleProducer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Martin Huang on 2018/4/20.
 */
public class OnlyForTest {

    @Test
    public void testAmqProducer()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-activemq.xml");
        SimpleProducer simpleProducer = (SimpleProducer) context.getBean("producer");
        try {
            simpleProducer.sendMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
