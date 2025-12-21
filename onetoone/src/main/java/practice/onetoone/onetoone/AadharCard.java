package practice.onetoone.onetoone;

import jakarta.persistence.*;

@Entity
public class AadharCard {
	
	@Id
	int aadharNum;
	@Column(name = "Name")
	String name;
	@Column(name = "Address")
	String address;
	@Column(name = "Gender")
	String gender;
	
	@OneToOne(mappedBy  = "ac")
	Person p;

	public AadharCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AadharCard(int aadharNum, String name, String address, String gender, Person p) {
		super();
		this.aadharNum = aadharNum;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.p = p;
	}

	public int getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(int aadharNum) {
		this.aadharNum = aadharNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "AadharCard [aadharNum=" + aadharNum + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", p=" + p + "]";
	}

}
