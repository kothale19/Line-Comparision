package com.blz.LineComparision;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation Program!!");
		int X1 = 2;
		int Y1 = 3;

		int X2 = 5;
		int Y2 = 6;

		double length = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
		System.out.println("length of line is: " + length);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First line Points:");
		System.out.println("Enter the number for x1:");
		int x1 = scan.nextInt();
		System.out.println("Enter the number for x2:");
		int x2 = scan.nextInt();
		System.out.println("Enter the number for y1:");
		int y1 = scan.nextInt();
		System.out.println("Enter the number for y2:");
		int y2 = scan.nextInt();
		double length1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		System.out.println("Length of first line is " + length1);
		System.out.println();

		System.out.println("Enter the Second line Points:");
		System.out.println("Enter the number for a1:");
		int a1 = scan.nextInt();
		System.out.println("Enter the number for a2:");
		int a2 = scan.nextInt();
		System.out.println("Enter the number for b1:");
		int b1 = scan.nextInt();
		System.out.println("Enter the number for b2:");
		int b2 = scan.nextInt();
		double length2 = Math.sqrt((Math.pow((a2 - a1), 2)) + (Math.pow((b2 - b1), 2)));
		System.out.println("Length of Second Line is " + length2);

		if (length1 == length2) {
			System.out.println("Both lines are equals");
		} else if (length1 > length2) {
			System.out.println("Length of First Line is Greater Than Length Of Second Line");
		} else {
			System.out.println("Length Of First Line Is Less Than Length Of Second Line");

		}

	}

}
