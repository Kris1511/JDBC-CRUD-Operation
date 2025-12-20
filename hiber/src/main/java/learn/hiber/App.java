package learn.hiber;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the number to perform the operations: ");
    	System.out.println("1. Insert the data");
    	System.out.println("2. Update the data");
    	System.out.println("3. Fetch the data");
    	System.out.println("4. Delete the data");
    	
    	int n = sc.nextInt();
    	
    	switch(n) {
    		
    	case 1:
    		insertData();
    		break;
    	case 2:
    		updateData();
    		break;
    	case 3:
    		fetchData();
    		break;
    	case 4:
    		deleteData();
    		break;
    	}
    }
    
    public static void insertData() {
    	Student st = new Student(0, "Bharath", "Dharmapuri", 2025);
    	
        Configuration con = new Configuration();
        con.configure();
        
        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();
        
        session.persist(st);
        
        trans.commit();
        
        session.close();
        factory.close();
    }
    
    public static void updateData() {
    	
    	Configuration con = new Configuration();
    	con.configure();
    	
    	SessionFactory fact = con.buildSessionFactory();
    	Session session = fact.openSession();
    	Transaction trans = session.beginTransaction();
    	
    	Student st = session.get(Student.class, 152);
    	st.setName("Hari");
    	st.setAddress("Salem");
    	
    	session.merge(st);	// or persist()
    	
    	trans.commit();
    }
    
    public static void fetchData() {
    	
    	System.out.println("Fetching data...");
    	
    	Configuration con = new Configuration();
    	con.configure();
    	
    	SessionFactory fact = con.buildSessionFactory();
    	Session sess = fact.openSession();
    	
    	Student st = sess.get(Student.class, 102);
    	if (st != null) {
    		System.out.println(st);
    	} else {
    		System.out.println("Student not found");
    	}
    	
    	sess.close();
    	fact.close();
    }

    public static void deleteData() {
    	
    	Configuration con = new Configuration();
    	con.configure();
    	
    	SessionFactory factory = con.buildSessionFactory();
    	Session sess = factory.openSession();
    	Transaction trans = sess.beginTransaction();
    	
    	Student st = sess.get(Student.class, 152);
    	
    	if (st != null) {
    		System.out.println(st.kodId + " row is deleted.");
    	} else {
    		System.out.println("Student not found");
    	}
    	
    	sess.remove(st);
    	
    	trans.commit();
    	
    	sess.close();
    	factory.close();
    }
}
















