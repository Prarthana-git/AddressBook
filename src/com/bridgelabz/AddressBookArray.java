package com.bridgelabz;
import java.util.*;

public class AddressBookArray {
    Scanner sc=new Scanner(System.in);
    private ArrayList<AddressBook> contactList = new ArrayList<AddressBook>();

    public void insertContact(AddressBook contactDetailObject) {

        contactList.add(contactDetailObject);
    }
    public void add()
	 {
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
		int zip = scan.nextInt();
		System.out.println("PhoneNumber : ");
		long phonenumber = scan.nextLong();
		System.out.println("Email : ");
		scan.nextLine();
		String email = scan.nextLine();
		AddressBook contact = new AddressBook(firstname, lastname, address, city, state, zip, phonenumber,
							email);
    }
    /**
     * This Editcontact method will take the firstname as a parameter and according to that it will edit the data.
     * nameToEdit
     */
    public void editContact(String nameToEdit) {
        for(AddressBook editContact: contactList) {
            if(editContact.getFirstName().equals(nameToEdit)) {

                System.out.println("Edit Firstname : ");
                String firstname = sc.nextLine();
                editContact.setFirstName(firstname);

                System.out.println("Edit Lastname : ");
                String lastname = sc.nextLine();
                editContact.setLastName(lastname);

                System.out.println("Edit Address : ");
                String address = sc.nextLine();
                editContact.setAddress(address);

                System.out.println("Edit City : ");
                String city = sc.nextLine();
                editContact.setCity(city);

                System.out.println("Edit State : ");
                String state = sc.nextLine();
                editContact.setState(state);

                System.out.println("Edit Zip : ");
                int zip = sc.nextInt();
                editContact.setZip(zip);

                System.out.println("Edit PhoneNumber : ");
                long phonenumber = sc.nextLong();
                sc.nextLine();
                editContact.setPhoneNo(phonenumber);

                System.out.println("Edit Email : ");
                String email = sc.nextLine();
                editContact.setEmail(email);
            }
        }
    }

    /**
     * Here i have added delete method which will delete the data comparing to the firstname.
     * nameToDelete
     */
    public void delete(String nameToDelete) {
        int i=0;
        for(i=0;i<contactList.size();i++) {
            if(contactList.get(i).getFirstName.equals(nameToDelete)) {
                AddressBook contact=contactList.get(i);
                contactList.remove(contact);
                System.out.println("Contact is Deleted");
            }
            else {
                System.out.println("Contact not found!");
            }
        }
    }

    /**
     * This printContactDetails will print all the information after data got edited.
     */
    public void printContactDetails() {
        for(AddressBook getInfo: contactList) {
            System.out.println("Firstname : " + getInfo.getFirstName());
            System.out.println("Lastname : " + getInfo.getLastName());
            System.out.println("Address : " + getInfo.getAddress());
            System.out.println("City : " + getInfo.getCity());
            System.out.println("State : " + getInfo.getState());
            System.out.println("Zip : " + getInfo.getZip());
            System.out.println("PhoneNumber : " + getInfo.getPhoneNo());
            System.out.println("Email : " + getInfo.getEmail());
        }
    }
}
