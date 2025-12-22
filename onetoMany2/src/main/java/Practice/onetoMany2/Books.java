package Practice.onetoMany2;

import jakarta.persistence.*;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookId;
	String bookName;
	String author;
	
	@ManyToOne
	@JoinColumn(name = "library_id")		// foreign key
	Library library;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(String bookName, String author, Library library) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.library = library;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", library=" + library
				+ "]";
	}
}
