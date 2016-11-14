//Dermot McGee l00113321

package lyit;

import java.io.Serializable;

public class Address implements Serializable {

	private String name;
	private String street;
	private String town;
	private String county;

	private static final long serialVersionUID = 1L;

	public Address() {
		this(null, null, null, null);
	}

	public Address(String name, String street, String town, String county) {

		this.name = name;
		this.street = street;
		this.town = town;
		this.county = county;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public boolean equals(Address address) {

		if (address.name.equals(name) && address.street.equals(street) && address.town.equals(town)
				&& address.county.equals(county)) {

			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Address : Name/Number =" + name + ", Street =" + street + ", Town =" + town + ", County =" + county
				+ "\n";
	}
}
