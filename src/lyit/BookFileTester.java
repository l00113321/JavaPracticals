package lyit;

public class BookFileTester {
	public static void main(String[] args) {
		// Create an object of bookFileHandler
		BookFileHandler bookFileHandler = new BookFileHandler();
		
		// Deserialize the ArrayList from the File,
		// i.e. read the books ArrayList from the file back into the ArrayList
		//bookFileHandler.readRecordsFromFile();
		
	    // Create a Menu Object
		Menu menuObj = new Menu();
		
		do{
			// Call it's display() method
			menuObj.display();
			// Call it's readOption() method
			menuObj.readOption();
			// switch on the option and call the appropriate method
			switch(menuObj.getOption()){
			   case 1:bookFileHandler.add();break;
			   case 2:bookFileHandler.list();break;
			   case 3:bookFileHandler.view();break;
			   
			  // case 4:bookFileHandler.edit();break;
			  // case 5:bookFileHandler.delete();break;
			   case 6:break;				
			   default:System.out.println("INVALID OPTION...");
			}
		}while(menuObj.getOption() != 6);	
																			
		// Serialize the ArrayList to the File
		// i.e. write the books ArrayList back into the the file		
		bookFileHandler.writeRecordsToFile();


		// OLD BookFileTester code //

		// Call the add() method twice, to add two books
		//bookFileHandler.add();
		//bookFileHandler.add();

		// Write the ArrayList to the File
		//bookFileHandler.writeRecordsToFile();

		// Read the ArrayList from the File back into the ArrayList books
		//bookFileHandler.readRecordsFromFile();
	
		// Call the list() method to list the Book objects in the ArrayList
		//bookFileHandler.list();
	}

}
