package lyit;

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
	
	public BookFileHandler(){
		books = new ArrayList<Book>();
	}
	
	public void add(Book b){
		b = new Book();
		b.read();
		books.add(b);
	}
	
	public void writeRecordsToFile(){
		try{
			os = new ObjectOutputStream(new FileOutputStream(file));
			os.writeObject(books);;
		}catch(Exception e){
			
			System.out.println(e.getMessage());;
		}finally{
			
			try{
				os.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public void readRecordsFromFile(){
		
		if(file.exists()){
			
			try{
				
				is = new ObjectInputStream(new FileInputStream(file));
				
				books = (ArrayList<Book>) is.readObject();
			
			}catch (Exception e){
			
				System.out.println(e.getMessage());
		
		}finally{
			
			try{
					
					is.close();
					
			}catch(IOException e){
						e.printStackTrace();
				}
		
	}
		}else{
	
			try{
				file.createNewFile();
				
		}catch (IOException e){
			
				e.printStackTrace();
			}
		}
	}
}
