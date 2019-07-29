package basics;
import java.util.*;
interface IStack{
	void stack_Push(Stack<Integer> sc);
	void stack_Pop(Stack<Integer> sc);
	void stack_Peek(Stack<Integer> sc);
	void stack_Search(Stack<Integer> sc,int k);
}
class IStackImp1 implements IStack{
	@Override
	 public void stack_Push(Stack<Integer> s) {
		System.out.println("The elements in the stack are");
		for(int i=0;i<5;i++) {
			s.push(i);
			stack_Peek(s);
		}
	}
	 public void stack_Pop(Stack<Integer> s) {
		int m= (Integer)s.pop();
		System.out.println("The element poped out of the stack is"+m);
	}
	@Override
	 public void stack_Peek(Stack<Integer> s) {
		int m=(Integer)s.peek();
		System.out.println(m);
		}
	@Override
	 public void stack_Search(Stack<Integer> s,int k) {
		int pos=(Integer)s.search( k);
		if(pos==-1) {
			System.out.println("element not found");
		}
		else {
			System.out.println("element is found"+pos);
		}
	}
}
	


public class IstackImp1_Test {
	public static void main(String [] args) {
		System.out.println("this is main");
		 IStackImp1 s=new IStackImp1();
		 Stack<Integer> sc=new Stack<Integer>();
		 s.stack_Push(sc );
		 s.stack_Pop(sc);
		 s.stack_Peek(sc);
		 s.stack_Search(sc,3);
		 
		
	}

		
}

