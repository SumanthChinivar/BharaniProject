package collection;

public class Employee {
	String name;
	double salary;
	
	Employee(double salary){
		this.salary=salary;
	}
	
	public String toString() {
          return name;
	}
	
	public boolean equals(Object o)
	{
		Employee e=(Employee)o;
		 return this.name.equals(e.name);
	}
	
	public int hashCode()
	{
		return name.hashCode();
	}

	public static void main(String[] args) {
	Employee emp=new Employee(2000);
	
	Employee e1=new Employee(2001);
		
	System.out.println(e1.equals(emp));
	
	System.out.println(e1.hashCode()==emp.hashCode());
	}

}
