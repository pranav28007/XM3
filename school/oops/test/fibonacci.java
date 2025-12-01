import java.util.Scanner;

public class fibonacci{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=scanner.nextInt();
		int a=0,b=1,c;
		for(int i=0;i<n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;}
	}
}
