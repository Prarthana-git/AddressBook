/**
 * Here i have imported Scanner to take user input.
 * imported ArrayList to store the values in an ArrayList.
 */
public class AddressBook {
	public String firstname, lastname;
	public String address, city, state;
	public int zip;
	public long phoneNumber;
	public String email;

	/**
	 * This is a parameterized constructor having the given parameters.
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param phonenumber
	 * @param email
	 */
	public AddressBook(String firstname, String lastname, String address, String city, String state, int zip, long phonenumber, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phonenumber;
		this.email = email;
	}

	/**
	 * this constructor will work if we'll not pass any parmeters.
	 */
	public AddressBook
	{

	}

	public toString() {
		return "AddressBook{" +
				"firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", address='" + address + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zip=" + zip +
				", phoneNumber=" + phoneNumber +
				", email='" + email + '\'' +
				'}';
	}
}
}