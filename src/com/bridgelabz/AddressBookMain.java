package com.bridgelabz;
import java.util.*;
class AddressBookMain {
	    public static void main(String[]args) {
	        Scanner scan = new Scanner(System.in);
	        AddressBookArray addressObject = new AddressBookArray();
	        String choice = "y";
	        System.out.println("Welcome to Address Book Program!");
	/**
	 * This while loop will iterate till you add new contacts.
	 */
	        while(choice.equals("y") || choice.equals("Y")) {
	            System.out.println("Firstname : ");
	            String firstname = scan.nextLine();
	            System.out.println("Lastname : ");
	            String lastname = scan.nextLine();
	            System.out.println("Address : ");
	            String address = scan.nextLine();
	            System.out.println("City : ");
	            String city = scan.nextLine();
	            System.out.println("State : ");
	            String state = scan.nextLine();
	            System.out.println("Zip : ");
	            long zip = scan.nextInt();
	            System.out.println("PhoneNumber : ");
	            long phonenumber = scan.nextLong();
	            System.out.println("Email : ");
	            String email = scan.nextLine();
	            System.out.println("Do you want add more contact ");
	            choice = scan.nextLine();
	        

	            AddressBook contact = new AddressBook(firstname, lastname, address, city, state, zip, phonenumber, email);
	            addressObject.insertContact(contact);
	        }

	    
	    }
	}
	


