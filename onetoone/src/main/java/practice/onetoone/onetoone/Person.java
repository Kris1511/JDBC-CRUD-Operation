package practice.onetoone.onetoone;

import jakarta.persistence.*;

@Entity
public class Person {
	
	@Id
	int id;
	@Column(name = "Fullname")
	String name;
	
	@OneToOne		// if we give casecade here no need to use of persist in sess.persist(ac);in main.java
	@JoinColumn(name = "aadharNum", referencedColumnName = "aadharNum")
	AadharCard ac;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, AadharCard ac) {
		super();
		this.id = id;
		this.name = name;
		this.ac = ac;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AadharCard getAc() {
		return ac;
	}

	public void setAc(AadharCard ac) {
		this.ac = ac;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", ac=" + ac + "]";
	}
}
