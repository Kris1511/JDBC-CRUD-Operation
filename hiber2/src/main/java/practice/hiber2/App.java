package practice.hiber2;

import java.util.Scanner;

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
    	int choice = sc.nextInt();
    	
    	switch (choice) {
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
    		case 5:
    			System.out.println("Invalid choice.");
    			break;
    	}
    }
    
    public static void insertData() {
    	
    	Employee emp = new Employee(0, "Ayush", 140000, "Software Engineer", "Learn and Dev");
    	
        Configuration con = new Configuration();
        con.configure();
        
        SessionFactory sf = con.buildSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();
        
        sess.persist(emp);
        
        sess.getTransaction().commit();
        
        sess.clear();
        sf.close();
    }
    
    public static void updateData() {
    	
    	Configuration con = new Configuration();
    	con.configure();
    	
    	SessionFactory sf = con.buildSessionFactory();
    	Session sess = sf.openSession();
    	Transaction trans = sess.beginTransaction();
    	
    	Employee ep = sess.get(Employee.class, 1);
    	ep.setName("Chandru");
    	ep.setSalary(50000);
    	
    	sess.merge(ep);
    	trans.commit();
    }
    
    public static void fetchData() {
    	
    	Configuration con = new Configuration();
    	con.configure();
    	
    	SessionFactory sf = con.buildSessionFactory();
    	Session sess = sf.openSession();
    	
    	Employee emp = sess.get(Employee.class, 1);
    	
    	if (emp != null) {
    		System.out.println(emp);
    	} else {
    		System.out.println("Employee not found.");
    	}
    }
    
    public static void deleteData() {
    	
    	Configuration con = new Configuration();
    	con.configure();
    	
    	SessionFactory sf = con.buildSessionFactory();
    	Session sess = sf.openSession();
    	Transaction trans = sess.beginTransaction();
    	
    	Employee emp = sess.get(Employee.class, 2);
    	
    	if (emp != null) {
    		System.out.println(emp.getId() + " row is deleted.");
    	} else {
    		System.out.println("Employee not found");
    	}
    	
    	sess.remove(emp);
    	
    	trans.commit();
    	
    	sess.close();
    	sf.close();
    	
    }
}












