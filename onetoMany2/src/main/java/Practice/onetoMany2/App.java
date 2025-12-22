package Practice.onetoMany2;

import java.util.Arrays;

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
		
		Library lib = new Library();
		Books book1 = new Books("Java Basics", "James", lib);
		Books book2 = new Books("Hibernate Mastery", "Gavin", lib);
		
		lib.setLibraryName("MGR Library");
		lib.setLocation("Chennai");
		
		lib.setBooks(Arrays.asList(book1, book2));
		sess.persist(lib);
		
		tx.commit();
		
		sess.close();
		sf.close();
    }
}
