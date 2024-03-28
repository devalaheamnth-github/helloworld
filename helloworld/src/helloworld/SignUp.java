package helloworld;

import java.util.*;
// oops--> constructor--> singup
public class SignUp {
	String name ;
	String email;
	long contact;
	String gender;
	String city ;
	String password;
	int age;
	
	
	public SignUp(String name ,String email ,long contact ,String gender ,String city ,String password ,int age)
	{
		this.name = name ;
		this.email = email;
		this.contact = contact;
		this.gender=gender;
		this.city = city;
		this.password = password;
		this.age =age;
		
	}
	
	public void showDetails()
	{
		System.out.println(name);
		System.out.println(email);
		System.out.println(contact);
		System.out.println(gender);
		System.out.println(city);
		System.out.println(password);
		System.out.println(age);
	}
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String name = sc.next();
//		System.out.println();
		
		String email = sc.next();
//		System.out.println();
		
		long contact = sc.nextLong();
		
		String gender = sc.next();
//		System.out.println();
		
		String city = sc.next();
//		System.out.println();
		
		String password = sc.next();
//		System.out.println();
		
		int age = sc.nextInt();
		
		SignUp user1 = new SignUp(name , email , contact , gender , city , password , age);
		user1.showDetails();
		

	}

}
