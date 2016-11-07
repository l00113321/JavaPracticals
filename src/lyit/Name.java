package lyit;
import java.util.Scanner;
import java.io.Serializable;

public class Name implements Serializable{
	
	private String title;
	private String firstName;
	private String lastName;
	
	public Name(){
		
	}
	
	public Name(String title, String firstName, String lastName) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void read(){
		@SuppressWarnings("resource")
		Scanner kbString = new Scanner(System.in);
		System.out.println("Please Enter Name Details :");
		
		System.out.println("Title :");
		this.title = kbString.nextLine();
		System.out.println("First Name :");
		this.firstName = kbString.nextLine();
		System.out.println("Surname :");
		this.lastName = kbString.nextLine();
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return title +" "+ firstName +" " +lastName ;
	}
	
	public boolean equals(Name n){
		   return( firstName.equals(n.firstName) &&
	              lastName.equals(n.lastName));
	}
	
	public boolean isFemale(){
		if(title.equalsIgnoreCase("Miss") || 
		   title.equalsIgnoreCase("Ms") || 
		   title.equalsIgnoreCase("Mrs")) 
		    return true;
		else
		    return false;
	}	
			
	
	

}
