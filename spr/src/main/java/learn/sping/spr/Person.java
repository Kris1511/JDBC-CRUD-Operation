package learn.sping.spr;

import java.util.*;

public class Person {
	
	String name;
	Set<String> contacts;
	List<String> bike;
	Map<Integer, String> siblings;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Set<String> contacts, List<String> bike, Map<Integer, String> siblings) {
		super();
		this.name = name;
		this.contacts = contacts;
		this.bike = bike;
		this.siblings = siblings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getContacts() {
		return contacts;
	}
	public void setContacts(Set<String> contacts) {
		this.contacts = contacts;
	}
	public List<String> getBike() {
		return bike;
	}
	public void setBike(List<String> bike) {
		this.bike = bike;
	}
	public Map<Integer, String> getSiblings() {
		return siblings;
	}
	public void setSiblings(Map<Integer, String> siblings) {
		this.siblings = siblings;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", contacts=" + contacts + ", bike=" + bike + ", siblings=" + siblings + "]";
	}
}
