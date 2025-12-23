package Practice.ManyToMany2;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String customerName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_product",
			   joinColumns = @JoinColumn(name = "customer_id"),
			   inverseJoinColumns = @JoinColumn(name = "product_id")
			)
	List<Product> product;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, List<Product> product) {
		super();
		this.customerName = customerName;
		this.product = product;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", product=" + product + "]";
	}
}
