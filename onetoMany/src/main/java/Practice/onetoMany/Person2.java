package Practice.onetoMany;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Person2 {
	
	@Id
	int pId;
	String pName;
	
	@OneToMany
	List<Bike> bikeList;

	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person2(int pId, String pName, List<Bike> bikeList) {
		super();
		this.pName = pName;
		this.bikeList = bikeList;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Bike> getBike() {
		return bikeList;
	}

	public void setBike(List<Bike> bikeList) {
		this.bikeList = bikeList;
	}

	@Override
	public String toString() {
		return "Person2 [pId=" + pId + ", pName=" + pName + ", bike=" + bikeList + "]";
	}
}
