package Practice.ManyToMany2;

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
        
        Customer cus1 = new Customer();
        Customer cus2 = new Customer();
        Customer cus3 = new Customer();
        
        List<Customer> c1 = new ArrayList<>();
        c1.add(cus2);
        c1.add(cus3);
        
        List<Customer> c2 = new ArrayList<>();
        c2.add(cus1);
        c2.add(cus3);
        
        List<Customer> c3 = new ArrayList<>();
        c3.add(cus1);
        c3.add(cus2);
        c3.add(cus3);
        
        List<Customer> c4 = new ArrayList<>();
        c4.add(cus3);
        
        Product p1 = new Product("Iphone", c1);
        Product p2 = new Product("Laptop", c2);
        Product p3 = new Product("Speaker", c3);
        Product p4 = new Product("clothes", c4);
        
        List<Product> pro1 = new ArrayList<>();
        pro1.add(p3);
        pro1.add(p4);
        
        List<Product> pro2 = new ArrayList<>();
        pro2.add(p1);
        pro2.add(p4);
        
        List<Product> pro3 = new ArrayList<>();
        pro3.add(p1);
        pro3.add(p2);
        pro3.add(p3);
        pro3.add(p4);
        
        cus1.setCustomerName("Arun");
        cus1.setProduct(pro1);
        
        cus2.setCustomerName("Bharath");
        cus2.setProduct(pro2);
        
        cus3.setCustomerName("Jeeva");
        cus3.setProduct(pro3);
        
        sess.persist(cus1);
        sess.persist(cus2);
        sess.persist(cus3);
        
        tx.commit();
        
        sess.close();
        sf.close();
        
    }
}
