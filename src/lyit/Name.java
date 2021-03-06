//Dermot McGee l00113321

package lyit;

import java.io.Serializable;


public class Name implements Serializable {

	protected String title;
	protected String firstName;
	protected String lastName;

	private IllegalArgumentException error = new IllegalArgumentException();

	private static final long serialVersionUID = 1L;

	public Name() {

	}

	public Name(String title, String firstName, String lastName) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws IllegalArgumentException {
		if (title.equals("Mr") || title.equals("Miss") || title.equals("Mrs") || title.equals("Ms")) {
			this.title = title;
		} else
			throw error;
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
		return title + " " + firstName + " " + lastName;
	}

	public boolean equals(Name n) {
		return (firstName.equals(n.firstName) && lastName.equals(n.lastName));
	}

	public boolean isFemale() {
		if (title.equalsIgnoreCase("Miss") || title.equalsIgnoreCase("Ms") || title.equalsIgnoreCase("Mrs"))
			return true;
		else
			return false;
	}
}
