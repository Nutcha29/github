import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

  
public class log2 extends JFrame { 
private static final long serialVersionUID = 1L; 
protected JMenuBar menuBar; 
protected JMenu file,about; 
protected JMenuItem exitItem,helpItem,aboutItem,customizationItem; 

public void paintComponent(Graphics g){
	BufferedImage image = null;
	try {
		image =ImageIO.read(new URL("http://www.wallpaperpimper.com/wallpaper/Art_&_3D/Space/Sky-Splash-1-A1IDO4UVVJ-1600x1200.jpg"));
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	paintComponent(g);
	g.drawImage(image, 0, 0, this);
	
	
}
  
    public static void main(String[] args) { 
        
    	log2 frameTabel = new log2(); 
      
        	
        //createAndShowGUI(); 
        /* 
        log2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        log2.pack(); 
        log2.setVisible(true); 
         */
    }
    
    /* 
    private static void createAndShowGUI() { 
        log2 frameTabel = new log2(); 
        frameTabel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frameTabel.pack(); 
        frameTabel.setVisible(true); 
    } 
    */
    JButton blogin = new JButton("Login"); 
    JPanel panel = new JPanel(); 
    JLabel username = new JLabel("Username"); 
    JTextField txuser = new JTextField(15); 
    JLabel password = new JLabel("Password"); 
    JPasswordField pass = new JPasswordField(15); 
    public log2(){ 
        super("Login Autentification HUHU"); 
        setSize(800,800); 
        setLocation(500,280); 
        panel.setLayout (null);  
      
        username.setBounds(70,10,150,20); 
        txuser.setBounds(70,30,150,20); 
        password.setBounds(70,45,150,20); 
        pass.setBounds(70,65,150,20); 
        blogin.setBounds(110,100,80,20); 
  
        panel.add(blogin); 
        panel.add(username); 
        panel.add(txuser); 
        panel.add(password); 
        panel.add(pass); 
  
        getContentPane().add(panel); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        pack(); 
        setVisible(true); 
        actionlogin(); 
    } 
    protected JMenuBar setBarGUI() 
    { 
        menuBar = new JMenuBar(); 
        file = new JMenu("File"); 
        about = new JMenu("Help"); 
  
        exitItem = new JMenuItem("Exit"); 
        helpItem = new JMenuItem("View Help"); 
        aboutItem = new JMenuItem("About"); 
        customizationItem = new JMenuItem("IceTizen Customization"); 
  
        file.add(exitItem); 
        about.add(helpItem); 
        about.add(aboutItem); 
  
        menuBar.add(file); 
        menuBar.add(about); 
        about.add(customizationItem); 
  
        return menuBar; 
    } 
    public void actionlogin(){ 
        blogin.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent ae) { 
                String puname = txuser.getText(); 
                String ppaswd = new String(pass.getPassword()); 
                if(puname.equals("test") && ppaswd.equals("12345")) { 
                    newframe regFace =new newframe(); 
                    regFace.setVisible(true); 
                    dispose(); 
                } else { 
                    JOptionPane.showMessageDialog(null,"Wrong Password / Username"); 
                    txuser.setText(""); 
                    pass.setText(""); 
                    txuser.requestFocus(); 
                } 
  
            } 
        }); 
    }
	
	}
