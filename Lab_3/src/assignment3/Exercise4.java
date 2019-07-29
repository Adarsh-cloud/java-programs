package assignment3;

public class Exercise4 {
	int count;
	public static void characterCount(char[] c){
		for(int i=0;i<c.length;i++){
			int count=0;
			for(int j=0;j<c.length;j++){
			if(c[i]==c[j]){
				count++;
			}
		}
			System.out.println(c[i]+" is present: "+count+" times");
	}
	}
	public static void main(String[] args) {
		char[] c={'a','c','a','b','c'};
		characterCount(c);
	}

}
