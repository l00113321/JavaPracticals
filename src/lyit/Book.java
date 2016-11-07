package lyit;

import java.util.*;

public class Book {
	private String name; ////////////////////////
	private String isbnNumber; // Instance Variables //
	private String author; ////////////////////////
	private String publishingCompany;
	private int libraryNumber;

	private static int nextNumber = 0000; // static for unique number - starts
											// off at 1

	// Default Constructor - set Instance Variables to null
	public Book() {
		name = isbnNumber = author = publishingCompany = "";

		// Set number to static nextNumber before incrementing nextNumber
		libraryNumber = nextNumber++;
	}

	// Initialisation Constructor
	public Book(String name, String isbnNumber, String author, String publishingCompany) {
		this.name = name;
		this.isbnNumber = isbnNumber;
		;
		this.author = author;
		this.publishingCompany = publishingCompany;
		// Set number to static nextNumber before incrementing nextNumber
		libraryNumber = nextNumber++;
	}

	// read() - To read a book from the user
	public void read() {
		@SuppressWarnings("resource")
		Scanner kbString = new Scanner(System.in);
		System.out.println("ENTER BOOK DETAILS ==>");
		System.out.print("NAME : ");
		name = kbString.nextLine();
		System.out.print("ISBN NUMBER : ");
		isbnNumber = kbString.nextLine();
		System.out.print("AUTHOR : ");
		author = kbString.nextLine();
		System.out.print("PUBLISHING COMPANY : ");
		publishingCompany = kbString.nextLine();
	}

	// get() and set() methods for each Instance Variable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public int getLibraryNumber() {
		return libraryNumber;
	}
	// SHOULD NOT HAVE A setLibraryNumber() METHOD

	// toString() method for displaying a Book objects
	// Display Book object as
	// "BOOK 100001:Clean Code by Robert Martin [ISBN 978-0132350884 PUBLISHER
	// Prentice Hall]"
	@Override
	public String toString() {
		return ("BOOK " + libraryNumber + ":" + name + " by " + author + " [ISBN " + isbnNumber + " PUBLISHER "
				+ publishingCompany);
	}

	// equals() method for comparison of two Book objects
	@Override
	public boolean equals(Object o) {
		// First check if o is a null reference to prevent run-time exceptions
		if (o == null)
			return false;

		// Next check if o references the current object, if it does it must be
		// equal
		if (this == o)
			return true;

		// Next check if o is in fact an Book object
		if (!(o instanceof Book))
			return false;
		else {
			// If none of the above are true, cast o to a Book object so that
			// we can compare the object's instance variables and methods
			Book other = (Book) o;

			return (this.libraryNumber == other.libraryNumber);
		}
	}
}
