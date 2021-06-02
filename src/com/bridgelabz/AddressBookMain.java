package com.bridgelabz;

import java.util.*;

public class AddressBookMain {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		AddressBookArray addressObject = new AddressBookArray();
		System.out.println("Welcome to Address Book Program!");
		while (true) {
			System.out.println("Enter 1: add 2: edit 3: delete 4: view 5: exit");
			System.out.println("Enter choice : ");
			int switchChoice = scan.nextInt();
			scan.nextLine();
			/**
			 * i have taken 4 options in this switch case According to value it'll call the
			 * method. Case 1 will add new contact data. Case2 will edit the contact. Case3
			 * will delete the contact data. Case4 will print all the data of that
			 * Arraylist. Case5 will exit from this loop.
			 */
			switch (switchChoice) {
			case 1:
				addressObject.add();
				break;
			case 2:
				System.out.println("Enter name of contact to edit : ");
				String nameToEdit = scan.nextLine();
				addressObject.editContact(nameToEdit);
				break;
			case 3:
				System.out.println("Enter name of contact to edit : ");
				String deleteCon = scan.nextLine();
				addressObject.delete(deleteCon);
				break;
			case 4:
				System.out.println("Contact List : ");
				addressObject.printContactDetails();
				break;
			default:
				System.exit(0);
			}
		}

	}

}
