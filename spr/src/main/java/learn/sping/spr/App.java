package learn.sping.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext apx = new ClassPathXmlApplicationContext("config.xml");
//        Laptop tap = apx.getBean("lappy", Laptop.class);
//        System.out.println(tap);
//        
//        MotherBoard mb = apx.getBean("mother", MotherBoard.class);
//        System.out.println(mb);
        
        Person p = apx.getBean("person", Person.class);
        System.out.println(p);
    }
}
