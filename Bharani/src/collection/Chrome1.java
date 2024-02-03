package collection;

public class Chrome1 extends Chrome{
	
	public static void version() {
		System.out.println("version is 14");
		
	}

	
	public static void main(String[] args) {
		Chrome ch=new Chrome1();
		ch.version();
	}
}
