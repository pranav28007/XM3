import java.awt.*;
import java.awt.event.*;

 class calculator extends Frame implements ActionListener{

	TextField tf;
	String operator="";
	double num1=0,num2=0;
	String btnnames[]={
				"9","8","7","+",
				"6","5","4","-",
				"1","2","3","CLR",
				"0","%","=","*"};
public	calculator(){
		tf=new TextField();
		tf.setEditable(false);
		add(tf,BorderLayout.NORTH);

	Panel p=new Panel();
	p.setLayout(new GridLayout(5,5));
	for(int i=0;i<btnnames.length;i++)
	{
		Button b=new Button(btnnames[i]);
		b.addActionListener(this);
		p.add(b);

	}
	add(p);
	setTitle("Calculator");
	setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String cmd=e.getActionCommand();
		if(cmd.charAt(0)>='0'&&cmd.charAt(0)<='9')
		{
			tf.setText(tf.getText()+cmd);
		}
		else if(cmd.equals("CLR")){
			tf.setText("");
		}


		else if(cmd.equals("=")){
			num2=Double.parseDouble(tf.getText());
			double result=0;

			switch(operator){
				case "+":result=num1+num2;
					break;
				case "-":result=num1-num2;
					break;
				case "%":result=num1/num2;
					 break;
				case "*":result=num1*num2;
					 break;


			}
			tf.setText(String.valueOf(result));
		}
		else
		{
			operator=cmd;
			num1=Double.parseDouble(tf.getText());
			tf.setText("");


		}
	}
}
	public class calc{
		public static void main(String args[])
		{
			new calculator();
		}
	}
