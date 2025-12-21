package practice.onetoone.onetoone;

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
        Transaction trans = sess.beginTransaction();
        
        Person p = new Person();
        
        AadharCard ac = new AadharCard(112, "Ram", "Namakkal", "Male", p);
        
        p.setId(102);
        p.setName("Chandru");
        p.setAc(ac);
        
        sess.persist(p);
        sess.persist(ac);
        
        trans.commit();
        
        sess.close();
        sf.close();
    }
}
