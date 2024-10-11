package edu.wit.cs.comp1000;

import java.util.Scanner;
public class PA2b {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a b and c: ");
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();
		
		double discriminant=b*b-4*a*c;
		if (discriminant<0) {
			System.out.printf("Roots : Imaginary");
		}
		else if(discriminant==0) {
			double root=-b/2*a;
			System.out.print("Root: %.2f%n"+root);
		}
		else {
			 double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
	         double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
	         if(root1<root2) {
	        	 System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
	         }
	         else {
	        	 System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
	         }
	         }
		}
	}



