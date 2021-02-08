package com.addressbook;

import java.util.*;

public class AddressBookSystem {
	static Scanner sc = new Scanner(System.in);
	static ArrayList book = new ArrayList();
	static boolean ans = true;

	public static void main(String args[]) {
		System.out.println("Welcome to Address Book Program");
		while (ans != false) {
			System.out.println("Please Enter your Choice");
			System.out.println("1 Add New Contact");
			System.out.println("2 Show All The Contact");
			System.out.println("3 exit");
			int UserChoice = sc.nextInt();
			switch (UserChoice) {
			case 1:
				CreateContact();
				break;

			case 2:
				System.out.println(book);

			case 3:
				ans = false;
			}

		}
	}

	public static void CreateContact() {
		System.out.println("Enter the First name");
		NewContact.fname = sc.next();
		book.add(NewContact.fname);

		System.out.println("Enter the Last name");
		NewContact.lname = sc.next();
		book.add(NewContact.lname);

		System.out.println("Enter the Address");
		NewContact.address = sc.next();
		book.add(NewContact.address);

		System.out.println("Enter the City");
		NewContact.city = sc.next();
		book.add(NewContact.city);

		System.out.println("Enter the State");
		NewContact.state = sc.next();
		book.add(NewContact.state);

		System.out.println("Enter the Zip");
		NewContact.zip = sc.nextInt();
		book.add(NewContact.zip);

		System.out.println("Enter the Phone Number");
		NewContact.phonenumber = sc.nextInt();
		book.add(NewContact.phonenumber);

		System.out.println("Enter the Email");
		NewContact.email = sc.next();
		book.add(NewContact.email);

		System.out.println("Contact added Successfully");

	}

}

class NewContact {

	static String fname;
	static String lname;
	static String address;
	static String city;
	static String state;
	static int zip;
	static int phonenumber;
	static String email;

	NewContact(String fname, String lname, String address, String city, String state, int zip, int phonenumber,
			String email) {

		NewContact.fname = fname;
		NewContact.lname = lname;
		NewContact.address = address;
		NewContact.city = city;
		NewContact.state = state;
		NewContact.zip = zip;
		NewContact.phonenumber = phonenumber;
		NewContact.email = email;

	}

}

