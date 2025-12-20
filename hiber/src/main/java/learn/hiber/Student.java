package learn.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int kodId;
	String name;
	String address;
	int passout;
	
	public Student() {
		
	}
	
	public Student(int kodId, String name, String address, int passout) {
		this.kodId = kodId;
		this.name = name;
		this.address = address;
		this.passout = passout;
	}

	public int getKodId() {
		return kodId;
	}

	public void setKodId(int kodId) {
		this.kodId = kodId;
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

	public int getPassout() {
		return passout;
	}

	public void setPassout(int passout) {
		this.passout = passout;
	}

	@Override
	public String toString() {
		return "Student [kodId=" + kodId + ", name=" + name + ", address=" + address + ", passout=" + passout + "]";
	}

}
