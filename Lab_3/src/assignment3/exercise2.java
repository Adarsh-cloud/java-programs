package assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class exercise2 {
	public static String[] arrangecaseAlphabet(String[] s) {
		int i = 0;
		if (s.length % 2 == 0) {
			while (i != s.length / 2) {
				System.out.println(s[i].toUpperCase());
				i++;
			}
		} else {
			while (i != (s.length / 2) + 1) {
				System.out.println(s[i].toUpperCase());
				i++;
			}
		}
		while (i != s.length) {
			System.out.println(s[i].toLowerCase());
			i++;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		int n = scan.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = scan.next();
		}
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		arrangecaseAlphabet(s);
		scan.close();
	}
}
