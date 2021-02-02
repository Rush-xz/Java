import java.awt.*;
import java.awt.event.*;

class BlankFrameUsingAdapterClass
{
	public static void main( String arg[] )
	{
		Frame fobj = new Frame("Marvellous");

		fobj.setSize(1500,1000);

		fobj.setVisible(true);

		//Register the windowlistener
		fobj.addWindowListener(new Hello());
	}
}

class Hello extends WindowAdapter
{	

	/*Invoked when the user attempts to close the window 
	from the window's system menu.*/
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

}