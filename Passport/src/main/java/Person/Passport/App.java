package Person.Passport;

import java.time.LocalDate;

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
        
        Person1 p = new Person1();
        Passport pass = new Passport("P9876543", "Indian", LocalDate.of(2020, 5, 12), LocalDate.of(2030, 5, 11));
        
        p.setName("Chandru");
        p.setAge(25);
        p.setGender("Male");
        p.setAddress("Namakkal");
        
        p.setPassport(pass);        
        pass.setPerson(p); 		// important for bidirectional
        
        sess.persist(p);
        
        tx.commit();
        
        sess.close();
        sf.close();
    }
}
