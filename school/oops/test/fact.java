import java.util.Scanner;
public class fact{
	public static void main(String args[])
	{
		System.out.println("Enter num");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
}
