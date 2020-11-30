package com.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		Service service = new Service();
		List<Customer> cust = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("++++++++++++++Select ++++++++++++++");
			System.out.println(
					" 1. Add New Account\n 2. Remove account by account number \n 3. Display account by account number \n "
							+ "4. Display all account by account number \n 5. Display those account having the balance less than 1000 \n 0. Exit \n");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Adding New Account");

				System.out.println("Enter Account No:");
				int accno = sc.nextInt();
				System.out.println("Enter Name:");
				String name = sc.next();
				System.out.println("Enter Balance:");
				double balance = sc.nextDouble();

				try {
					service.addCustomer(accno, name, balance);
				} catch (Exception e) {

					System.out.println(e);
					System.out.println("Acoount No already Exists");
				}

				break;

			case 2:
				System.out.println("Removing account by account number ");

				System.out.println("Enter Account No:");
				int acc = sc.nextInt();
				try {
					service.removeCustomer(acc);
				}

				catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					System.out.println("Account Not Found");
				}

				break;

			case 3:
				System.out.println("Displaying account by account number ");
				System.out.println("Enter Account No:");
				int accn = sc.nextInt();

				try {
					Customer cu = service.displayAccountByAccntNo(accn);
					System.out.println(
							"Account No :" + cu.getAccno() + "Name:" + cu.getName() + "Balance:" + cu.getBalance());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				break;

			case 4:
				System.out.println("Displaying all accounts with account number ");

				cust = service.displayAll();
				cust.forEach(item -> System.out.println(item));

				break;

			case 5:
				System.out.println("Displaying accounts having the balance less than 1000 ");
				cust = service.getAccountsWithBalbelow2000();
				cust.forEach(item -> System.out.println(item));
				break;

			case 0:
				System.out.println("..........Exiting App...... ");
				System.exit(0);

			}

		} while (choice < 6);

	}

}
