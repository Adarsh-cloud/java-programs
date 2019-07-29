package assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	public static int getSecondSmallest(int[] n) {
		Arrays.sort(n);	
		return n[1];
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int n = scan.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("The Second Smallest number n the array is: " + getSecondSmallest(a));
		scan.close();
	}
}
