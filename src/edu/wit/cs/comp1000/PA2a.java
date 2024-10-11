package edu.wit.cs.comp1000;

import java.util.Scanner;
public class PA2a {

	public static void main(String[] args) {
		
		int positiveSum=0;
		int negativeSum=0;
		int totalSum=0;
		int positiveCount=0;
		int negativeCount=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter five whole numbers: ");
		for(int i=0;i<5;i++) {
			int num=scanner.nextInt();
			totalSum+=num;
			
			if (num>0) {
				positiveSum+=1;
				positiveCount++;
			} else {
				negativeSum+=1;
				negativeCount++;
			}
		}
		double positiveAverage=positiveSum/positiveCount;
		double negativeAverage=negativeSum/negativeCount;
		double totalAverage=totalSum/5;
		
	if (positiveCount != 1) {
            System.out.printf("The sum of the %d positive numbers: %d%n" ,positiveCount, positiveSum);
     }
		else {
            System.out.printf("The sum of the %d positive number: %d%n" ,positiveCount, positiveSum);
     }
	if (negativeCount != 1) {
            System.out.printf("The sum of the %d non-positive numbers: %d%n" ,negativeCount, negativeSum);
     }
     else {
            System.out.printf("The sum of the %d non-positive number: %d%n" ,negativeCount, negativeSum);
     }
     System.out.printf("The sum of the 5 numbers: %d%n" , totalSum);
    if (positiveCount != 1) {
            System.out.printf("The average of the %d positive numbers: %.2f%n",positiveCount, positiveAverage);
     }
     else {
            System.out.printf("The average of the %d positive number: %.2f%n",positiveCount, positiveAverage);
     }
    if (negativeCount != 1) {
            System.out.printf("The average of the %d non-positive numbers: %.2f%n",negativeCount, negativeAverage);
     }
     else {
            System.out.printf("The average of the %d non-positive number: %.2f%n",negativeCount, negativeAverage);
     }
     System.out.printf("The average of the 5 numbers: %.2f%n", totalAverage);
	}
}



