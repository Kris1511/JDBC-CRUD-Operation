package Practice.ManyToMany2;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String productName;
	
	@ManyToMany(mappedBy = "product")
	List<Customer> customer;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, List<Customer> customer) {
		super();
		this.productName = productName;
		this.customer = customer;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", customer=" + customer + "]";
	}
}
