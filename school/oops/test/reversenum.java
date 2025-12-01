import java.util.Scanner;

public class reversenum{
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter");
		int n=scanner.nextInt();
		int res=0;
		while(n>0)
		{
			int last=n%10;
			res=res*10+last;
			n=n/10;
		}
		System.out.println(res);
	}
}
