import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{	
	//characteristics
	Frame mainFrame;
	Label header;
	Label status;
	Panel controlPanel;

	//Constructor
	public MarvellousFrame()
	{
		mainFrame = new Frame("Marvellous Info");
		mainFrame.setSize(500,500);
		mainFrame.setVisible(true);
		mainFrame.setLayout(new GridLayout(3,1));
		mainFrame.addWindowListener(new WindowAdapter()
		{	
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		header = new Label();
		header.setAlignment(Label.CENTER);

		status = new Label();
		status.setAlignment(Label.CENTER);
		status.setSize(350,100);

		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());

		//add component in container
		mainFrame.add(header);
		mainFrame.add(controlPanel);
		mainFrame.add(status);
	}//end of constructor

	public static void main( String arg[])
	{
		MarvellousFrame obj = new MarvellousFrame();
		obj.Display();
	}//end of main

	private void Display()
	{
		header.setText("Please Select Batch.");

		Button PPA = new Button("PPA");
		Button LB = new Button("LB");
		Button Angular = new Button("Angular");

		PPA.setActionCommand("PPA");
		LB.setActionCommand("LB");
		Angular.setActionCommand("Angular");

		PPA.addActionListener(new Hello());
		LB.addActionListener(new Hello());
		Angular.addActionListener(new Hello());
		
		controlPanel.add(PPA);
		controlPanel.add(LB);
		controlPanel.add(Angular);

		mainFrame.setVisible(true);
	}//end of Display

	//Nested class
	private class Hello implements ActionListener
	{
		public void actionPerformed( ActionEvent e)
		{
			String command = e.getActionCommand();

			if( command.equals("PPA"))
			{
				status.setText("Pre-Placement Activity batch is selected.");
			}
			else if(command.equals("LB"))
			{
				status.setText("LB batch is selected.");
			}
			else if(command.equals("Angular"))
			{
				status.setText("Angular batch is selected.");
			} 
		}//end of action performed
	}//end of class Hello
}//end of class MarvellousFrame