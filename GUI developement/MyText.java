import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyText extends JFrame implements ActionListener
{
	//Vars
	TextField name , pass;

	MyText()
	{
		//this.setLayout(null);
		//getContentPane().setBackground(Color.DARK_GRAY);

		//create textfield for name and password
		name = new TextField(20);
		pass = new TextField(20);
		//hide the password by *
		pass.setEchoChar('*');

		//create two labels
		Label n = new Label("Name :",Label.LEFT);
		Label p = new Label("Password :",Label.LEFT);
		Button b = new Button("Login");

			Panel _top = new Panel();
			//_top.setBackground(Color.LIGHT_GRAY);
			_top.setBackground(Color.CYAN);
			_top.setVisible(true);
			_top.setBounds(0, 0, 782, 197);
			this.add(_top);


		//use background,foreground colors and font for 
		//name textfield
		name.setBackground(Color.yellow);
		name.setForeground(Color.red);
		Font f = new Font("Arial",Font.PLAIN,25);
		name.setFont(f);

		//add Labels and textfields on frame
		this.add(n);
		this.add(name);
		this.add(p);
		this.add(pass);
		this.add(b);

		//add action listener to text fields
		name.addActionListener(this);
		pass.addActionListener(this);
		b.addActionListener(this);


		//close frame
		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

	}//end of constructor

	//this method is executed when enter is clicked
	//display the text entered into the text fields
	public void actionPerformed(ActionEvent ae)
	{	
		Graphics g = this.getGraphics();
		if(name.getText().equals("Rushikesh") && pass.getText().equals("Rushikesh"))
		{
			g.drawString("Login Successful",10,200);
		}
		else
		{
			g.drawString("Incorrect Credentials",50,200);
		}
		/*//create Graphics class object
		Graphics g = this.getGraphics();

		g.drawString("Name: "+name.getText(),10,200);
		g.drawString("Password: "+pass.getText(),10,240);
		*/

	}

	public static void main( String arg[])
	{
		MyText mobj = new MyText();
		mobj.setTitle("My Text Field");
		mobj.setSize(800,400);
		mobj.setVisible(true);
		mobj.setBackground(Color.red);
	} 
}