package collection;

import java.util.Stack;

public class A3 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		
		
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);
		s.push(5);
		System.out.println(s.peek());
	}
}
