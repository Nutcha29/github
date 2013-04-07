import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class PanelExample2 extends JFrame{ 
	ImagePanel panel ;
	public JTextField userField; 
    public JPasswordField passField; 
    public JButton blogin;
	 public void actionPerformed(ActionEvent ae) { 
         String puname = userField.getText(); 
         String ppaswd = new String(passField.getPassword()); 
         if(puname.equals("test") && ppaswd.equals("12345")) { 
              newframe regFace =new newframe(); 
             regFace.setVisible(true); 
             dispose();
             
         } else { 

             JOptionPane.showMessageDialog(null,"Wrong Password / Username"); 
             userField.setText(""); 
             passField.setText(""); 
             userField.requestFocus(); 
         } 
     } 
	
	
    public void createAndDisplayGUI() { 
        JFrame frame = new JFrame("Panel Example"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        JPanel contentPane = new JPanel(); 
        contentPane.setOpaque(true); 
        contentPane.setBorder( 
                BorderFactory.createMatteBorder( 
                        5, 5, 5, 5, Color.WHITE)); 
        contentPane.setBackground(Color.WHITE); 
        contentPane.setLayout(new BorderLayout(10, 10)); 
        //ImagePanel imagePanel = new ImagePanel(); 
        //imagePanel.createGUI(); 
        // BlankPanel blankPanel = new BlankPanel(); 
        // contentPane.add(blankPanel, BorderLayout.LINE_START); 
        contentPane.add(new ImagePanel(), BorderLayout.CENTER); 
        frame.setContentPane(contentPane); 
        frame.pack(); 
        frame.setLocationByPlatform(true); 
        frame.setVisible(true); 
    } 
    public static void main(String[]args) 
    {
  
        SwingUtilities.invokeLater(new Runnable() 
        { 
            public void run() 
            { 
                new PanelExample2().createAndDisplayGUI(); 
            } 
        }); 
    } 
} 
class ImagePanel extends JPanel {
	 newframe regFace;
	 
    /** 
     *  
     */
    private static final long serialVersionUID = 1L; 
  
    private BufferedImage image; 
      
    public JTextField userField; 
    public JPasswordField passField; 
    public JButton blogin;
    
    
      
    public ImagePanel() 
    { 
        setOpaque(true); 
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 5)); 
        try
        { 
            image = ImageIO.read(new URL("http://www.wallpaperpimper.com/wallpaper/Art_&_3D/Space/Sky-Splash-1-A1IDO4UVVJ-1600x1200.jpg")); 
        } 
        catch(Exception e) 
        { 
            e.printStackTrace(); 
        } 
        createGUI(); 
    } 
    public void createGUI() 
    { 
    	
  
        setLayout(new GridBagLayout()); 
        JPanel loginPanel = new JPanel(); 
        loginPanel.setOpaque(false); 
        loginPanel.setLayout(new GridLayout(2, 2, 2, 2)); 
        JLabel userLabel = new JLabel("USERNAME : "); 
        userLabel.setForeground(Color.WHITE); 
        userField = new JTextField(10); 
        JLabel passLabel = new JLabel("PASSWORD : "); 
        passLabel.setForeground(Color.WHITE); 
  
  
        blogin = new JButton("Login"); 
        JCheckBox alien = new JCheckBox("alien"); 
        JCheckBox Inhabitants = new JCheckBox("Inhabitants"); 
  
  
  
        passField = new JPasswordField(10); 
        loginPanel.add(userLabel); 
        loginPanel.add(userField); 
        loginPanel.add(passLabel); 
        loginPanel.add(passField); 
        loginPanel.add(blogin); 
        loginPanel.add(alien); 
        loginPanel.add(Inhabitants); 
        add(loginPanel); 
        System.out.println("I am finished"); 
    } 
     
                
    public Dimension getPreferredSize() 
    { 
        return (new Dimension(1600, 1200)); 
    } 
    public void paintComponent(Graphics g) 
    { 
        super.paintComponent(g); 
        g.drawImage(image, 0, 0, this); 
    } 
} 

          
