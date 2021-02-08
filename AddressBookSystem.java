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
			System.out.println("2 Edit The Particular Contact");
			System.out.println("3 Delete Particular Contact");
			System.out.println("4 Show The All Contact");
			System.out.println("5 Exit");
			int UserChoice = sc.nextInt();
			switch (UserChoice) {
			case 1:
				CreateContact();
				break;

			case 2:
				EditContact();
				break;

			case 3:
				DeleteContact();

			case 4:
				System.out.println(book);
				break;
			case 5:
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

	public static void EditContact() {

		System.out.println("Enter the First Name you want to Edit ");
		String Edit = sc.next();
		boolean check = book.contains(Edit);
		if (check == true) {
			System.out.println("enter the field which you Want to Edit");
			System.out.println(" 1 First Name");
			System.out.println(" 2 Last Name");
			System.out.println(" 3 Address ");
			System.out.println(" 4 City");
			System.out.println(" 5 State");
			System.out.println(" 6 Zip");
			System.out.println(" 7 Phone Number");
			System.out.println(" 8 Email");
			int Field = sc.nextInt();
			switch (Field) {

			case 1:
				System.out.println("Enter the new First Name");
				String NewFname = sc.next();
				book.set(0, NewFname);
				System.out.println(book);
				System.out.println("Update Succefully");
				break;

			case 2:
				System.out.println("Enter the new Last Name");
				String NewLname = sc.next();
				book.set(1, NewLname);
				System.out.println(book);
				System.out.println("Update Succefully");
				break;

			case 3:
				System.out.println("Enter the new Address");
				String Newaddres = sc.next();
				book.set(2, Newaddres);
				System.out.println(book);
				System.out.println("Update Succefully");
				break;

			case 4:
				System.out.println("Enter the new City");
				String Newcity = sc.next();
				book.set(3, Newcity);
				System.out.println(book);
				System.out.println("Update Succefully");
				break;

			case 5:
				System.out.println("Enter the new state");
				String Newstate = sc.next();
				book.set(4, Newstate);
				System.out.println(book);
				System.out.println("Update Succefully");
				break;

			case 6:
				System.out.println("Enter the new Zip");
				String Newzip = sc.next();
				book.set(5, Newzip);
				System.out.println(book);
				System.out.println("Update Succefully");
				break;

			case 7:
				System.out.println("Enter the new Phone Number");
				String Newph = sc.next();
				book.set(6, Newph);
				System.out.println(book);
				System.out.println("Update Succefully");
				break;

			case 8:
				System.out.println("Enter the new Email Address");
				String Newemail = sc.next();
				book.set(7, Newemail);
				System.out.println(book);
				System.out.println("Update Succefully");
				break;

			}
		} else {
			System.out.println("Contact Has Been Not Found");
		}

	}

	public static void DeleteContact() {

		System.out.println("Enter the First Name you Want to Delete");
		String Delete = sc.next();
		boolean check1 = book.contains(Delete);
		if (check1 == true) {
			book.clear();
			System.out.println("Contact Deleted Succesfully");
		} else {
			System.out.println("Contact Has Been Not Found");
		}

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

