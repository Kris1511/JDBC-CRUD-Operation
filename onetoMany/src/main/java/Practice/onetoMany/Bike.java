package Practice.onetoMany;

import jakarta.persistence.*;

@Entity
public class Bike {
	
	@Id
	int bikeId;
	int modelNum;	
	String brand;
	double price;
	
	@ManyToOne
	Person2 person;

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(int bikeId, int modelNum, String brand, double price, Person2 person) {
		super();
		this.bikeId = bikeId;
		this.modelNum = modelNum;
		this.brand = brand;
		this.price = price;
		this.person = person;
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public int getModelNum() {
		return modelNum;
	}

	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Person2 getPerson() {
		return person;
	}

	public void setPerson(Person2 person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", modelNum=" + modelNum + ", brand=" + brand + ", price=" + price
				+ ", person=" + person + "]";
	}
}
