package Practice.onetoMany2;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Library {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int libraryId;
	String libraryName;
	String location;
	
	@OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
	List<Books> books;

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(String libraryName, String location) {
		super();
		this.libraryName = libraryName;
		this.location = location;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", location=" + location
				+ ", books=" + books + "]";
	}
	

}
