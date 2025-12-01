import java.util.Scanner;
import java.util.Arrays;
public class sortname{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);

		String names[]=new String[5];
		System.out.println("Enter names");
		for(int i=0;i<5;i++)
		{
			names[i]=scanner.nextLine();
		}
		Arrays.sort(names);
for(int i=0;i<5;i++)
		{
			System.out.println(names[i]);
		}
	}
}
