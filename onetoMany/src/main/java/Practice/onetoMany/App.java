package Practice.onetoMany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration();
        con.configure();
        
        SessionFactory sf = con.buildSessionFactory();
        Session sess = sf.openSession();
        Transaction tx = sess.beginTransaction();
        
        Person2 p = new Person2();
        Bike b1 = new Bike(1, 101, "Yamaha", 100000.0, p);
        Bike b2 = new Bike(2, 102, "Pulsar", 120000.78, p);
        Bike b3 = new Bike(3, 103, "Splender", 98990.90, p);
        Bike b4 = new Bike(4, 104, "Royal Enfield", 250000.89, p);
        
        List<Bike> bikeL = new ArrayList<>();
        bikeL.add(b1);
        bikeL.add(b2);
        bikeL.add(b3);
        bikeL.add(b4);
        
        p.setpId(1);
        p.setpName("Mahi");
        p.setBike(bikeL);
        
        sess.persist(p);
        sess.persist(b1);
        sess.persist(b2);
        sess.persist(b3);
        sess.persist(b4);
        
        tx.commit();
        
        sess.close();
        sf.close();
    }
}
