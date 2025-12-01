import java.util.Scanner;

public class prime{
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter");
		int n=scanner.nextInt();
		for(int i=2;i<=n;i++)
		{
			boolean isrime=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					 isrime=false;
					break;
				}

			}
			if(isrime)
			{
				System.out.println(i);
			}
		}
	}
}
