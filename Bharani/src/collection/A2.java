package collection;

import java.util.ArrayList;
import java.util.Collections;

public class A2 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(1);
	a.add(0);
	a.add(-3);
	a.add(10);
	a.add(null);
	a.add(null);
	a.add(null);
	
	System.out.println(a);
	
	Collections.sort(a);
	System.out.println(a);
	//Hai
}
}
