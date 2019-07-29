package assignment3;

import java.util.Arrays;

public class Exercise3 {
	public static int[] getSorted(int[] n) {
		for(int i=0;i<n.length;i++){
			int reversed=0;
			while(n[i]!=0){
				int digit=n[i]%10;
				reversed=reversed*10+digit;
				n[i]/=10;
			}
			n[i]=reversed;
		}
		Arrays.sort(n);
		for(int m:n){
			System.out.println(m);
		}
	    
		return n;
	}

	public static void main(String[] args) {
		int[] a = { 12, 13, 14 };
		System.out.println("Sorted Strings..."+Arrays.toString(getSorted(a)));
	}

}
