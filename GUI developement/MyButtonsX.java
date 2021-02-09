//Push Buttons
import java.awt.*;
import java.awt.event.*;

class MyButtonsX extends Frame implements ActionListener
{
	Button b1,b2,b3;//vars

	MyButtonsX()
	{	
		/*when we use some layout manager like this, there
		 is no need of using setBound() method to specify the
		 location of push button*/
		setLayout(new FlowLayout());
		/*if we didn't use 'this'
		 since we did not use any object to call method
		 it is by default called present class object or
		 frame object
		*/

		//Button object creation[create 3 push buttons]
		b1 = new Button("Red");
		b2 = new Button("Yellow");
		b3 = new Button("Green");

		//set the location of buttons in the frame
		/*b1.setBounds(100,100,70,40);
		b2.setBounds(100,160,70,40);
		b3.setBounds(100,220,70,40);*/

		//add buttons to frame
		add(b1);
		add(b2);
		add(b3);

		//add action listener to buttons
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		addWindowListener( new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			}
		);
	}//end of constructor

	//this method is called when button is clicked
	public void actionPerformed(ActionEvent ae)
	{
		//know the label of button clicked by user
		//String str = ae.getActionCommand();

		/*
		change the frame's background color depending on
		button clicked
		Here we are using getSource() instead of
		geActionCommand()
		*/
		if(ae.getSource() == b1)
			setBackground(Color.red);
		else if(ae.getSource() == b2)
			setBackground(Color.yellow);
		else if(ae.getSource() == b3)
			setBackground(Color.green);
	}

	public static void main( String arg[])
	{
		//Frame Creation
		MyButtonsX f = new MyButtonsX();
		f.setTitle("AWT Buttons");
		f.setSize(500,500);
		f.setVisible(true);
	}
}