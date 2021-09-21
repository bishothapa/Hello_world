package class_C;

import java.util.Scanner;

public class ProjectC {

	public static void main(String[] args) {
		 Scanner userInputstr = new Scanner(System.in);
		 Scanner userInputint = new Scanner(System.in);
		 //Question a.
		  System.out.println("What is your name?");
		  String name = userInputstr.nextLine();
		  System.out.println("Hello, you are "+name );
		 //Question b. 
		  System.out.println("How old are you?");
		  int age = userInputint.nextInt();
		  System.out.println("Ohh, you are "+ age + "years old" );
		  //Question c.
		  System.out.println("What is your gender?");
		  String gender = userInputstr.nextLine();
		  System.out.println("You are "+ gender );
		  //Question d.
		  System.out.println("Where are you from?");
		  String location  = userInputstr.nextLine();
		  System.out.println("You are from  "+ location );
		  //Question e.
		  System.out.println("Where do you live now?");
		  String address  = userInputstr.nextLine();
		  System.out.println("Ok, you live in "+ address );
		  //Question f.
		  System.out.println(" Where do you work?");
		  String job  = userInputstr.nextLine();
		  System.out.println("You are working at "+ job + "nice ." );
		  //Question g.
		  System.out.println("What is your job role?");
		  String jobrole = userInputstr.nextLine();
		  System.out.println("You work as an"+ jobrole );
		  //Question h.
		  System.out.println("What is your Salary?");
		  double salary = userInputint.nextDouble();
		  System.out.println("You are getting "+ salary + "dollors anually ." );
		  //Question i.
		  System.out.println("How much raise are you getting next year?");
		  double raise  = userInputint.nextDouble();
		  System.out.println("You are getting "+ raise + "then your total salary will be "+ (salary + raise) + " dollors next year. ");
		  
		  System.out.println("My name is "+ name + ". I am "+ age + "years old. "+ "I am a " + gender + ".Originally, I am from "+ location + ".Right now, I live in "+ address + " .I work at "+ job + "I am a "+ jobrole + "I am getting "+ salary +  "dollors anually "+ "I am getting "+ raise + " dollor next year, then my total salary will be "+ (salary + raise) + " dollors ." );
		  
		 
		 
	}

}
