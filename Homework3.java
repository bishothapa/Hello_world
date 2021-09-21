package test3;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		System.out.println("Please enter a String:");
		Scanner userInputstr = new Scanner(System.in);
		Scanner userInputint = new Scanner(System.in);
		String Homework3 = userInputstr.nextLine();
		
		String a = "hello";
		String b = " Test";
		System.out.println(a.toUpperCase());
		System.out.println(a.length());
		String a1 = a.toUpperCase();
		System.out.println(a1.replace("O", "Z"));
		String a2 = a1.replace("O", "Z");
		System.out.println(a2.charAt(a2.length()-1));
		System.out.println(a.concat(b));
		
		
		
		

	}

}
