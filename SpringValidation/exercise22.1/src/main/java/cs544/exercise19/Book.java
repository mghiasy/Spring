package cs544.exercise19;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class Book {

	@NotNull(message = "cannot be null")
	private int id;

	@NotNull(message = "cannot be null")
	private String title;

	@NotNull(message = "cannot be null")
	@Pattern(regexp="\\d{3}-\\d{10}", message="length must be 3")
	private String ISBN;

	@NotNull(message = "cannot be null")
	private String author;

	@NotNull(message = "cannot be null")
	@Min(value = 1, message = "From must be greater than zero")
	private double price;

//	@Past
//	private Date publishedDate;

	public Book() {
		super();
	}


	public Book(String title, String iSBN, String author, double price) {
		super();
		this.title = title;
		ISBN = iSBN;
		this.author = author;
		this.price = price;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public Date getPublishedDate() {
//		return publishedDate;
//	}
//
//	public void setPublishedDate(Date publishedDate) {
//		this.publishedDate = publishedDate;
//	}
}
