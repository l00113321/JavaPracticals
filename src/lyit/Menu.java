//Dermot McGee l00113321

package lyit;

import java.util.*;

public class Menu extends JointFileHandler {
	private int option;

	public void display() {
		System.out.println("\t1. Add");
		System.out.println("\t2. List");
		System.out.println("\t3. View");
		System.out.println("\t4. Edit");
		System.out.println("\t5. Delete");
		System.out.println("\t6. Quit");
	}

	public void readOption() {
		@SuppressWarnings("resource")
		Scanner kbInt = new Scanner(System.in);
		System.out.println("\n\tEnter Option [1|2|3|4|5|6]");
		option = kbInt.nextInt();
	}

	public int getOption() {
		return option;
	}
}
