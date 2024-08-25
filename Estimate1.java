

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

class Calculator extends JFrame implements ActionListener
{
	static JFrame frame;
	static JTextField textField;
	String s0,s1,s2;
	Calculator()
	{
		s0=s1=s2="";
}


	public static void main(String[] args) 
	{
		frame = new JFrame("Operator");
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
			
		}
		Calculator e1=new Calculator();
		textField= new JTextField(16);
		textField.setEditable(false);
		
		JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,be,beq1,ba,bs,bm,bd;
		b0= new JButton("0");
		b1= new JButton("1");
		b2= new JButton("2");
		b3= new JButton("3");
		b4= new JButton("4");
		b5= new JButton("5");
		b6= new JButton("6");
		b7= new JButton("7");
		b8= new JButton("8");
		b9= new JButton("9");
		beq1= new JButton("=");
		ba= new JButton("+");
		bs= new JButton("-");
		bm= new JButton("*");
		bd= new JButton("/");
		be= new JButton(".");
		
		JPanel p1= new JPanel();
	
				b0.addActionListener(e1);
				b1.addActionListener(e1);
				b2.addActionListener(e1);
				b3.addActionListener(e1);
				b4.addActionListener(e1);
				b5.addActionListener(e1);
				b6.addActionListener(e1);
				b7.addActionListener(e1);
				b8.addActionListener(e1);
				b9.addActionListener(e1);
				be.addActionListener(e1);
				beq1.addActionListener(e1);
				ba.addActionListener(e1);
				bs.addActionListener(e1);
				bm.addActionListener(e1);
				bd.addActionListener(e1);
				
				p1.add(textField);
				p1.add(ba);
				p1.add(b9);
				p1.add(b8);
				p1.add(b7);
				p1.add(b6);
				p1.add(b5);
				p1.add(b4);
				p1.add(b3);
				p1.add(b2);
				p1.add(b1);
				p1.add(b0);
				p1.add(be);
				p1.add(beq1);
				p1.add(bs);
				p1.add(bm);
				p1.add(bd);
				
				p1.setBackground(Color.CYAN);
				p1.setSize(200,220);
				p1.setVisible(true);
	}
	
				
	public void ActionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.charAt(0) >= '0' && s.charAt(0) <= '9' || s.charAt(0) =='.')
				{
					if(!s1.equals(""))
						s2=s2+s;
					else
						s0=s0+s;
					textField.setText(s0+s1+s2);
					
				}
				else if(s.charAt(0) =='C')
				{
					s0 =s1 =s2 ="";
				textField.setText(s0+s1+s2);
	}
	
				else if(s.charAt(0) =='=')
				{
					double result;
					if(s1.equals("+"))
						result=(Double.parseDouble(s0)+ Double.parseDouble(s2));
				
				else if(s1.equals("-"))
					result=(Double.parseDouble(s0)- Double.parseDouble(s2));
				else if(s1.equals("/"))
						result=(Double.parseDouble(s0) / Double.parseDouble(s2));
				else
				result=(Double.parseDouble(s0) * Double.parseDouble(s2));
					
					s0=Double.toString(result);
					s1=s;
					s2="";
					
					
				}
				textField.setText(s0+s1+s2);
	}
		}
			
				
		
		
	
