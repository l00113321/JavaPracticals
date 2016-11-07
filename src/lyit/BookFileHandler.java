package lyit;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookFileHandler {

	private ArrayList<Book> books;
	private ObjectOutputStream os;
	private ObjectInputStream is;
	private File file = new File("Library/books.bin");

	public BookFileHandler() {
		books = new ArrayList<Book>();
	}

	public void add() {
		Book b = new Book();
		b.read();
		this.books.add(b);
	}

	public void list() {

		for (Book tmpBook : books)
			System.out.println(tmpBook);
	}
	
	public void view(){
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);		

		// Read the number of the book to be viewed from the user
		System.out.println("ENTER NUMBER OF BOOK : ");
		String bookToView=keyboard.nextLine();
		
		// for every Book object in books
	    for(Book tmpBook:books){
		   // if it's number equals the number of the bookToView
		   if(tmpBook.getIsbnNumber().equalsIgnoreCase(bookToView)){
		      // display it
			  System.out.println(tmpBook);
			  break;
			  //return tmpBook;
			  }
	    }
	}

	public void writeRecordsToFile() {
		try {
			os = new ObjectOutputStream(new FileOutputStream(file));
			os.writeObject(books);
			;
		} catch (Exception e) {

			System.out.println(e.getMessage());
			
		} finally {

			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public void readRecordsFromFile() {

		if (file.exists()) {

			try {

				is = new ObjectInputStream(new FileInputStream(file));

				books = (ArrayList<Book>) is.readObject();

			} catch (Exception e) {

				System.out.println(e.getMessage());

			} finally {

				try {

					is.close();

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		} else {

			try {
				file.createNewFile();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
