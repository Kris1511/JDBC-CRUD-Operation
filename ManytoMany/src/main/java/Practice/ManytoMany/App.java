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
        
        Tech t1 = new Tech(101, "Java", techL1);
        Tech t2 = new Tech(102, "SQL", techL2);
        Tech t3 = new Tech(103, "Python", techL3);
        Tech t4 = new Tech(104, "React", techL4);
        
        List<Tech> tech1 = new ArrayList<>();
        tech1.add(t1);
        tech1.add(t3);
        
        List<Tech> tech2 = new ArrayList<>();
        tech2.add(t1);
        tech2.add(t3);
        tech2.add(t4);
        
        List<Tech> tech3 = new ArrayList<>();
        tech3.add(t2);
        tech3.add(t4);
        
        trList1.setTrainerId(1);
        trList1.setTrainerName("Ayush");
        trList1.setTechList(tech1);
        
        trList2.setTrainerId(2);
        trList2.setTrainerName("Deep");
        trList2.setTechList(tech2);
        
        trList3.setTrainerId(3);
        trList3.setTrainerName("Ankit");
        trList3.setTechList(tech3);
        
        sess.persist(t1);
        sess.persist(t2);
        sess.persist(t3);
        sess.persist(t4);
        
        sess.persist(trList1);
        sess.persist(trList2);
        sess.persist(trList3);
        
        tx.commit();
        
        
    }
}
