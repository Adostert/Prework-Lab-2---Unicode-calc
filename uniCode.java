package uni;

import java.util.Arrays;
import java.util.Scanner;

public class uniCode {

	public static void main(String[] args) {
  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first string : ");
	String s1 = sc.nextLine();
	System.out.println("Enter second string : ");
	String s2 = sc.nextLine();
	System.out.println("Your first word is " + s1 + " Your second word is " + s2);

	System.out.println("My first word unicode values are " + Arrays.toString(s1.getBytes()));
	
	
	System.out.println("My second word unicode values are " + Arrays.toString(s2.getBytes()));
	
	int sum1 = 0;
	int sum2 = 0;
	
	for (int i : s1.getBytes()) {
		sum1 += i;
	};
	
	for (int i : s2.getBytes()) {
		sum2 += i;
	}
	
	System.out.println("The unicode sum for my first word is " + sum1);
	System.out.println("The unicode sum for my second word is " + sum2);
	System.out.println("The unicode difference is " + (sum1 - sum2)); 
	}

}
