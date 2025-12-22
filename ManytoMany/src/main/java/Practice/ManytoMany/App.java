package Practice.ManytoMany;

import java.util.*;

import org.hibernate.*;
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
        
        Trainer trList1 = new Trainer();
        Trainer trList2 = new Trainer();
        Trainer trList3 = new Trainer();
        
        List<Trainer> techL1 = new ArrayList<>();
        techL1.add(trList1);
        techL1.add(trList2);
        
        List<Trainer> techL2 = new ArrayList<>();
        techL2.add(trList1);
        techL2.add(trList3);
        
        List<Trainer> techL3 = new ArrayList<>();
        techL3.add(trList2);
        
        List<Trainer> techL4 = new ArrayList<>();
        techL4.add(trList2);
        techL4.add(trList3);
        
        
        
    }
}
