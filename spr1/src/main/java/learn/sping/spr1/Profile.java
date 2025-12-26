package learn.sping.spr1;

import java.util.*;

public class Profile {
	
	String name;
	String dob;
	List<String> address;
	Map<Integer, String> documents;
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(String name, String dob, List<String> address, Map<Integer, String> documents) {
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.documents = documents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Map<Integer, String> getDocuments() {
		return documents;
	}
	public void setDocuments(Map<Integer, String> documents) {
		this.documents = documents;
	}
	@Override
	public String toString() {
		return "Profile [name=" + name + ", dob=" + dob + ", address=" + address + ", documents=" + documents + "]";
	}
}
