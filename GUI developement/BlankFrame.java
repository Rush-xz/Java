import java.awt.*;
import java.awt.event.*;

class BlankFrame
{
	public static void main( String arg[] )
	{
		Frame fobj = new Frame("Marvellous");

		fobj.setSize(2000,1000);

		fobj.setVisible(true);

		fobj.addWindowListener(new Hello());
	}
}

class Hello implements WindowListener
{	

	/*Invoked when the user attempts to close the window 
	from the window's system menu.*/
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	/*Parameters:
		e - the event to be processed
	*/

	//Invoked when the Window is set to be the active Window.
	public void windowActivated(WindowEvent e)
	{}

	/*Invoked when a window has been closed as the result
	 of calling dispose on the window.*/
	public void windowClosed(WindowEvent e)
	{}	

	//Invoked when a Window is no longer the active Window.
	public void windowDeactivated(WindowEvent e)
	{}

	/*Invoked when a window is changed from a normal to 
	a minimized state.*/
	public void windowIconified(WindowEvent e)
	{}

	/*Invoked when a window is changed from a minimized 
	to a normal state.*/
	public void windowDeiconified(WindowEvent e)
	{}

	//Invoked the first time a window is made visible.
	public void windowOpened(WindowEvent e)
	{}
}