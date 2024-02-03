package collection;

import java.util.ArrayList;
import java.util.Collections;

public class A1 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(new Student("Bharani",13));
	a.add(new Student("Vikas",12));
	a.add(new Student("Pradi",15));
	
	System.out.println(a);
	
	Collections.sort(a);
	System.out.println(a);
}
}
