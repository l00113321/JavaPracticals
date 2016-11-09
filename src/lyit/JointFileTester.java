package lyit;

public class JointFileTester {
		
	
		public static void main(String[] args) {
			// Create an object of bookFileHandler
			JointFileHandler jointFileHandler = new JointFileHandler();
			
			// Deserialize the ArrayList from the File,
			// i.e. read the books ArrayList from the
			
			
		    // Create a Menu Object
			Menu menuObj = new Menu();
			
			do{
				// Call it's display() method
				menuObj.display();
				// Call it's readOption() method
				menuObj.readOption();
				// switch on the option and call the appropriate method
				switch(menuObj.getOption()){
				   case 1:jointFileHandler.add();break;
				   case 2:jointFileHandler.list();break;
				   case 3:jointFileHandler.view();break;
				   
				  case 4:jointFileHandler.edit();break;
				  case 5:jointFileHandler.delete();break;
				   case 6:break;				
				   default:System.out.println("INVALID OPTION...");
				}
			}while(menuObj.getOption() != 6);	
																				
			// Serialize the ArrayList to the File
			// i.e. write the books ArrayList back into the the file		
			//jointFileHandler.writeRecordsToFile();


	
		// OLD BookFileTester code //

			// Call the add() method twice, to add two books
			//bookFileHandler.add();
			//bookFileHandler.add();

			// Write the ArrayList to the File
			jointFileHandler.writeRecordsToFile();

			// Read the ArrayList from the File back into the ArrayList books
			jointFileHandler.readRecordsFromFile();
		
			// Call the list() method to list the Book objects in the ArrayList
			jointFileHandler.list();
		}

	}

