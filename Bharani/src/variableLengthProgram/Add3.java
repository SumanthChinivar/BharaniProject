package variableLengthProgram;

public class Add3 {
public static void main(String[] args) {
	add(1,2,3);
}

public static void add(int...a)
{
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}
