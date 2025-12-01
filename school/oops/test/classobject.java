class Animal{
	String name;
	int sp;

	void display()
	{
		System.out.println("thhe name is"+name+" "+sp);
	}
}
public class classobject{
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.name="jeremey";
		a.sp=10;
		Animal b=new Animal();
		b.name="pranav";
		b.sp=7;
		a.display();
		b.display();
	}
}
