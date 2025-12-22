package Person.Passport;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int passportId;
	String passportNum;
	String nationality;
	LocalDate issueDate;
	LocalDate expireDate;
	
	@OneToOne(fetch = FetchType.LAZY , mappedBy = "passport")
	Person1 person;

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passport(String passportNum, String nationality, LocalDate issueDate, LocalDate expireDate) {
		super();
		this.passportNum = passportNum;
		this.nationality = nationality;
		this.issueDate = issueDate;
		this.expireDate = expireDate;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public Person1 getPerson() {
		return person;
	}

	public void setPerson(Person1 person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNum=" + passportNum + ", nationality=" + nationality
				+ ", issueDate=" + issueDate + ", expireDate=" + expireDate + ", person=" + person + "]";
	}
}
