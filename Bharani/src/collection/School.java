package collection;

public class School {
	
	String name="SVM";
	
	public String toString()
	{
		return name;
	}
	
	public static void main(String[] args) {
		School s1=new School();
		System.out.println(s1);
		System.out.println(s1.toString());
	}
}
