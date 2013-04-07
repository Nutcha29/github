

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;


	public class newframe extends JFrame {

		public static void main(String[] args) {
			newframe frameTabel = new newframe();
		}

		JLabel welcome = new JLabel("ICE PORT");
		JPanel panel = new JPanel();

		newframe(){
			super("Splash screen ICE Port");
			setSize(800,800);
			//setLocation(500,280);
			panel.setLayout (null); 
			

			welcome.setBounds(70,50,150,60);

			panel.add(welcome);

			getContentPane().add(panel);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
	}



