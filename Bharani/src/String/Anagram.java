package String;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s="Listen";
	String s1="Silent";
	
	if(s.length()!=s.length()) {
		System.out.println("Not an anagram");
		return;
	}else
	{
		s1=s1.toLowerCase();
		s=s.toLowerCase();
		
		char[] ch=s.toCharArray();
		char[] ch1=s1.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		int flag=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=ch1[i]) {
				flag=1;
				System.out.println("Not an anagram");
				break;
			}
		}
		if(flag==0) {
			System.out.println("It is an anagram");
		}
	}
	
}
}
