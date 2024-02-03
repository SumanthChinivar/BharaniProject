package collection;

import java.util.HashMap;
import java.util.Map;

public class A5 {
	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap();
		hs.put(1,"Sumanth");
		hs.put(2, "Naveen");
		hs.put(3,"Prema");
		
		for(Map.Entry<Integer,String> hc:hs.entrySet()) {
			System.out.println(hc.getValue());
			System.out.println(hc.getKey());
		}
		
		for(Integer i:hs.keySet()) {
			System.out.println(i);
		}
		
		for(String s:hs.values()) {
			System.out.println(s);
		}
	}
}
