package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.dummy.emp.Emp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Id:");
		int id = Integer.valueOf(bf.readLine());
		System.out.print("Enter Name:");
		String name = bf.readLine();
		System.out.print("Enter emailId:");
		String emailId = bf.readLine();
		System.out.print("Enter phone no:");
		long phone = Long.valueOf(bf.readLine());
		Emp employee = new Emp(id, name, emailId, phone);
		System.out.print("\n Id: " + employee.getId() + "\n Name " + employee.getName() + "\n EmailId: "
				+ employee.getEmailId() + "\n Phone: " + employee.getPhone() );
		
		session.close();
 }
}
