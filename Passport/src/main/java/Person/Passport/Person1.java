package Person.Passport;

import jakarta.persistence.*;

@Entity
public class Person1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int personId;
	String name;
	int age;
	String gender;
	String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passportId", referencedColumnName = "passportId", unique = true, nullable = false)
	Passport passport;
	
	public Person1() {
		
	}
	
	public Person1(int personId, String name, int age, String gender, String address, Passport passport) {
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.passport = passport;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address="
				+ address + ", passport=" + passport + "]";
	}
}
