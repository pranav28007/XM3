import java.util.Scanner;
public class palindrome{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter");
		String s=scanner.nextLine();
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		if(res.equals(s))
		{
			System.out.println("IS pAlindrome");
		}
		else
			System.out.println("Not palindrom");
	}
}
