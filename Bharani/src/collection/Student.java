package collection;

public class Student implements Comparable{
	String name;
	int id;
	
	Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String toString() {
		return name+";"+id;
	}
	
	public int compareTo(Object o) {
		Student s=(Student)o;
		if(this.id==s.id) {
			return 0;
		}
		else if(this.id>s.id) {
			return 1;
		}
		else
			return -1;
	}
}
