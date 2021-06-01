package com.bridgelabz;
import java.util.*;
public class AddressBook {

	
	    public String firstname;
		public String lastname;
	    public String address, city, state;
	    public long zip;
	    public long phoneNumber;
	    public String email;

	    public AddressBook(String firstname, String lastname, String address, String city, String state, long zip, long phonenumber, String email) {
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
	     * This printContactDetails method will print all the values given below.
	     */
	    public void printContactDetails() {
	        System.out.println("Firstname : " + firstname);
	        System.out.println("Lastname : " + lastname);
	        System.out.println("Address : " + address);
	        System.out.println("City : " + city);
	        System.out.println("State : " + state);
	        System.out.println("Zip : " + zip);
	        System.out.println("PhoneNumber : " + phoneNumber);
	        System.out.println("Email : " + email);
	    }
	    /**
	     * these get methods are used to get the values according to the user input.
	     * @return
	     */
	        public String getFirstName() {
	            return firstname;
	        }
	        public void setFirstName(String firstName) {
	            this.firstname = firstName;
	        }
	        public String getLastName() {
	            return lastname;
	        }
	        public void setLastName(String lastName) {
	            this.lastname = lastName;
	        }
	        public String getAddress() {
	            return address;
	        }
	        public void setAddress(String address) {
	            this.address = address;
	        }
	        public String getCity() {
	            return city;
	        }
	        public void setCity(String city) {
	            this.city = city;
	        }
	        public String getState() {
	            return state;
	        }
	        public void setState(String state) {
	            this.state = state;
	        }
	        public long getZip() {
	            return zip;
	        }
	        public void setZip(int zip) {
	            this.zip = zip;
	        }
	        public long getPhoneNo() {
	            return phoneNumber;
	        }
	        public void setPhoneNo(long phno) {
	            this.phoneNumber = phno;
	        }
	        public String getEmail() {
	            return email;
	        }
	        public void setEmail(String email) {
	            this.email = email;
	        }
	        /**
	         * This method will display the data of the addressbook.
	         */
	        public void editContact() {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Edit Firstname : ");
	            String firstname = sc.nextLine();
	            setFirstName(firstname);

	            System.out.println("Edit Lastname : ");
	            String lastname = sc.nextLine();
	            setLastName(lastname);

	            System.out.println("Edit Address : ");
	            String address = sc.nextLine();
	            setAddress(address);

	            System.out.println("Edit City : ");
	            String city = sc.nextLine();
	            setCity(city);

	            System.out.println("Edit State : ");
	            String state = sc.nextLine();
	            setState(state);

	            System.out.println("Edit Zip : ");
	            int zip = sc.nextInt();
	            setZip(zip);

	            System.out.println("Edit PhoneNumber : ");
	            long phonenumber = sc.nextLong();
	            sc.nextLine();
	            setPhoneNo(phonenumber);

	            System.out.println("Edit Email : ");
	            String email = sc.nextLine();
	            setEmail(email);
	        }
	        }
	    

