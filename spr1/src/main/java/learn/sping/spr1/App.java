package learn.sping.spr1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext apx = new ClassPathXmlApplicationContext("config.xml");
        User pro = apx.getBean("user", User.class);
        System.out.println(pro);
    }
}
