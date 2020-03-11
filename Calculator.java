package calculator;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener, WindowListener
{

	// to initialize button size
	private int size = 30;
	
	//to initialize position for button x-coordinate and y-coordinate
	private int x = 20;
	private int y = 140;
	
	private TextField answer;
	
	private Button input_no1 ;
	private Button input_no2 ;
	private Button input_no3 ;
	private Button input_no4 ;
	private Button input_no5 ;
	private Button input_no6 ;
	private Button input_no7 ;
	private Button input_no8 ;
	private Button input_no9 ;
	private Button input_no0 ;
	private Button input_dot ;
	
	private Button reset;
	private Button correction;
	private Button equal;
	
	private Button add ;
	private Button sub ;
	private Button mul ;
	private Button div ;
	
	Calculator()
	{
		//initialise
		answer = new TextField(250);
		
		input_no1 = new Button("1");
		input_no2 = new Button("2");
		input_no3 = new Button("3");
		input_no4 = new Button("4");
		input_no5 = new Button("5");
		input_no6 = new Button("6");
		input_no7 = new Button("7");
		input_no8 = new Button("8");
		input_no9 = new Button("9");
		input_no0 = new Button("0");
		input_dot = new Button(".");
		
		reset = new Button("AC");
		correction = new Button("<");
		equal = new Button("=");
		
		add = new Button("+");
		sub = new Button("-");
		mul = new Button("x");
		div = new Button("/");
		
		 setLayout(null);
		 
		//textfield 
		 answer.setSize(250, 40);
		 answer.setLocation(20,40);
		
		//button
		 input_no1.setSize(size, size);
		 input_no1.setLocation(x,y);
		 input_no1.addActionListener(this);
		 
		 input_no2.setSize(size, size);
		 input_no2.setLocation(x+size+10,y);
		 input_no2.addActionListener(this);
		 
		 input_no3.setSize(size, size);
		 input_no3.setLocation(x+size+size+20,y);
		 input_no3.addActionListener(this);
		 
		 input_no4.setSize(size, size);
		 input_no4.setLocation(x,y+size+10);
		 input_no4.addActionListener(this);
		 
		 input_no5.setSize(size, size);
		 input_no5.setLocation(x+size+10,y+size+10);
		 input_no5.addActionListener(this);
		 
		 input_no6.setSize(size, size);
		 input_no6.setLocation(x+size+size+20,y+size+10);
		 input_no6.addActionListener(this);
		 
		 input_no7.setSize(size, size);
		 input_no7.setLocation(x,y+size+size+20);
		 input_no7.addActionListener(this);
		 
		 input_no8.setSize(size, size);
		 input_no8.setLocation(x+size+10,y+size+size+20);
		 input_no8.addActionListener(this);
		 
		 input_no9.setSize(size, size);
		 input_no9.setLocation(x+size+size+20,y+size+size+20);
		 input_no9.addActionListener(this);
		 
		 input_no0.setSize(size+size+10, size);
		 input_no0.setLocation(x,y+size+size+size+30);
		 input_no0.addActionListener(this);
		 
		 input_dot.setSize(size, size);
		 input_dot.setLocation(x+size+size+20,y+size+size+size+30);
		 input_dot.addActionListener(this);
		 
		 reset.setSize(size, size);
		 reset.setLocation(20,100);
		 reset.addActionListener(this);
		 
		 correction.setSize(size, size);
		 correction.setLocation(60,100);
		 correction.addActionListener(this);
		 
		 equal.setSize(size, size);
		 equal.setLocation(100,100);
		 equal.addActionListener(this);
		 
		 add.setSize(size, size);
		 add.setLocation(180,100);
		 add.addActionListener(this);
		 
		 sub.setSize(size, size);
		 sub.setLocation(220,100);
		 sub.addActionListener(this);
		 
		 mul.setSize(size, size);
		 mul.setLocation(180,140);
		 mul.addActionListener(this);
		 
		 div.setSize(size, size);
		 div.setLocation(220,140);
		 div.addActionListener(this);
		 
		//add component
		 add(answer); add(input_no1); add(input_no2); add(input_no3); 
		              add(input_no4);  add(input_no5);add(input_no6);
		              add(input_no7);  add(input_no8);add(input_no9);
		              add(input_dot);  add(input_no0);
		              add(add); add(sub); add(mul); add(div);
		              add(equal);
		              add(reset);
		              add(correction);
		              
		            
		              
		  answer.setEditable(false); 
		  
		  setTitle("Calculator");            
		 setResizable(false);              
		setVisible(true);
		setSize(300, 300);
		this.addWindowListener(this);
		
	}
	
	//this method check whether a string contain a dot(.) or not
	   public static int check(String s)
		{
			int a = 0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i) == '.')
				{a = a+1;}	
			}
			return a;
		}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Button bobj = (Button)e.getSource();
		
		 if(bobj == input_no1)
			answer.setText(answer.getText()+"1");
		 
		else if(bobj == input_no2)
			answer.setText(answer.getText()+"2");
		 
		else if(bobj == input_no3)
			answer.setText(answer.getText()+"3");
		 
		else if(bobj == input_no4)
			answer.setText(answer.getText()+"4");
		 
		else if(bobj == input_no5)
			answer.setText(answer.getText()+"5");
		 
		else if(bobj == input_no6)
			answer.setText(answer.getText()+"6");
		 
		else if(bobj == input_no7)
			answer.setText(answer.getText()+"7");
		 
		else if(bobj == input_no8)
			answer.setText(answer.getText()+"8");
		 
		else if(bobj == input_no9)
			answer.setText(answer.getText()+"9");
		 
		else if(bobj == input_no0)
		{
				answer.setText(answer.getText()+"0");	
		}
		 
		else if(bobj == input_dot)
		{
			String s = answer.getText();
			
			 if( s.isEmpty())
			 {
				 answer.setText(answer.getText()+"0.");
			 }
			
			 char c = s.charAt(s.length()-1) ;
			 
			  if(c=='+'  || c=='-' ||  c=='x' || c=='/' )
			 {
				 answer.setText(answer.getText()+"0.");
			 }
			  else if(c == '.')
				  answer.setText(answer.getText());
			  
			 else
				 answer.setText(answer.getText()+"."); 
		}
		
		 // for add button
		else if(bobj == add)
		{
			String s = answer.getText();
			 char c = s.charAt(s.length()-1) ;
			 
			  if(c == '.')
				 answer.setText(answer.getText());
			  
			  else if( c != '+')
					answer.setText(answer.getText()+"+");
		}
		 
		 //for sub button
		else if(bobj == sub)
		{
			String s = answer.getText();
			 char c = s.charAt(s.length()-1) ;
			 
			  if(c == '.')
				 answer.setText(answer.getText());
			  
			  else if( c != '-')
					answer.setText(answer.getText()+"-");
		}
		 
		 //for mul button
			else if(bobj == mul)
			{
				String s = answer.getText();
				 char c = s.charAt(s.length()-1) ;
				 
				  if(c == '.')
					 answer.setText(answer.getText());
				  
				  else if( c != 'x')
						answer.setText(answer.getText()+"x");
			}
		 
		 //for div button
			else if(bobj == div)
			{
				String s = answer.getText();
				 char c = s.charAt(s.length()-1) ;
				 
				  if(c == '.')
					 answer.setText(answer.getText());
				  
				  else if( c != '/')
						answer.setText(answer.getText()+"/");
			}
		
		 
		 //for reset button
		else if(bobj == reset)
			answer.setText("");
		
		 //for equal button
		else if(bobj == equal)
		{
			String s = answer.getText();
			
			for(int i=0;i<s.length();i++)
			{
//	------------------------working for addition---------------------------
				if(s.charAt(i) == '+')
				{
					String s1 = s.substring(0,i);  //before + sign
					String s2 = s.substring(i+1,s.length()); // after + sign
					
					int a1 = check(s1);  //check this string before + contain a dot or not
					int a2 =  check(s2); //check this string after + contain a dot or not
					
					if(a1 == 0  &&  a2==0)
					{
						int a = Integer.parseInt(s1);
					     int  b = Integer.parseInt(s2);
					     int res =  a+b;
							answer.setText(String.valueOf(res));
					}
					else
					{
						double a = Double.parseDouble(s1);
					     double  b = Double.parseDouble(s2);
					     double res =  a+b;
							answer.setText(String.valueOf(res));
					}
					
				  }
//------------------------working for substraction---------------------------
				else if(s.charAt(i) == '-')
				{
					String s1 = s.substring(0,i);  //before + sign
					String s2 = s.substring(i+1,s.length()); // after + sign
					
					int a1 = check(s1);  //check this string before + contain a dot or not
					int a2 =  check(s2); //check this string after + contain a dot or not
					
					if(a1 == 0  &&  a2==0)
					{
						int a = Integer.parseInt(s1);
					     int  b = Integer.parseInt(s2);
					     int res =  a-b;
							answer.setText(String.valueOf(res));
					}
					else
					{
						double a = Double.parseDouble(s1);
					     double  b = Double.parseDouble(s2);
					     double res =  a-b;
							answer.setText(String.valueOf(res));
					}
					
				  }
				
//	------------------------working for multiply---------------------------
				
				else if(s.charAt(i) == 'x')
				{
					String s1 = s.substring(0,i);  //before + sign
					String s2 = s.substring(i+1,s.length()); // after + sign
					
					int a1 = check(s1);  //check this string before + contain a dot or not
					int a2 =  check(s2); //check this string after + contain a dot or not
					
					if(a1 == 0  &&  a2==0)
					{
						int a = Integer.parseInt(s1);
					     int  b = Integer.parseInt(s2);
					     int res =  a*b;
							answer.setText(String.valueOf(res));
					}
					else
					{
						double a = Double.parseDouble(s1);
					     double  b = Double.parseDouble(s2);
					     double res =  a*b;
							answer.setText(String.valueOf(res));
					}
					
				  }
				
//	------------------------working for divide---------------------------
				
				else if(s.charAt(i) == '/')
				{
					String s1 = s.substring(0,i);  //before + sign
					String s2 = s.substring(i+1,s.length()); // after + sign
					
					int a1 = check(s1);  //check this string before + contain a dot or not
					int a2 = check(s2); //check this string after + contain a dot or not
					
					if(a1 == 0  &&  a2==0)
					{
						int a = Integer.parseInt(s1);
					     int  b = Integer.parseInt(s2);
					     int res =  a/b;
							answer.setText(String.valueOf(res));
					}
					else
					{
						double a = Double.parseDouble(s1);
					     double  b = Double.parseDouble(s2);
					     double res =  a/b;
							answer.setText(String.valueOf(res));
					}
					
				  }
				
				
				
			  }//end of for loop for equal button
		  }
					
					

		 //for correction button
		else if(bobj == correction)
		{
			String s = answer.getText();
			String temp = s.substring(0,s.length()-1);
			answer.setText(temp);
		}
		 
		 
		 
		 
		 
		 
		
	}//end of action performed method

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		Frame f = (Frame)e.getSource();
		f.dispose();
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[])
	{ 
		Calculator obj = new Calculator();
	}
	
	
}// end of class MyFrame

