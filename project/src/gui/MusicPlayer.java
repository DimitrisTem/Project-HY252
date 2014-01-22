package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class MusicPlayer extends JFrame {
	public static Color col = new Color(39,93,153);
	static JPanel Play;
	static JPanel Pause;
	static JPanel Stop;
	static JPanel Forward;
	static JPanel Backward;
	
	static JMenuItem j1;
	static JMenuItem j2;
	static JMenuItem j3;
	static JMenuItem j4;
	static JMenuItem j5;
	static JMenuItem j6;
	static JMenuItem j7;
	static JMenuItem j8;
	static JMenuItem j9;

	public static void addComponentsToPane(Container pane){
		pane.setLayout(null);
		pane.setBackground(col);
		
		/***************		 
		 **Make panels**
		 ***************/
		 Play = new JPanel();
		 Play.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/play.jpg")));
		 
		 Pause = new JPanel();
		 Pause.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/pause.jpg")));
        
		 Stop = new JPanel();
		 Stop.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/stop.jpg")));
         
		 Forward = new JPanel();
		 Forward.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/front.jpg")));
         
		 Backward = new JPanel();
		 Backward.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/backa.jpg")));
        
       
       
        /****************************
         **Setting background color**
         ****************************/
        Play.setBackground(col);
        Stop.setBackground(col);
        Pause.setBackground(col);
        Forward.setBackground(col);
        Backward.setBackground(col);
        /**************************
         **Adding JPanels to pane**
         **************************/
        pane.add(Play);
        pane.add(Pause);
        pane.add(Stop);
        pane.add(Backward);
        pane.add(Forward);
        
        /***********************************
         **Place panel at correct position**
         ***********************************/
        Insets insets = pane.getInsets();
        
        
        
        Dimension size = Stop.getPreferredSize();
        Stop.setBounds(0, 0,size.width, size.height);
        
        size = Play.getPreferredSize();
        Play.setBounds(29, 0,size.width, size.height);
       
        size = Pause.getPreferredSize();        
        Pause.setBounds(60 , 0,size.width, size.height);
        
        size = Backward.getPreferredSize();        
        Backward.setBounds(90 + insets.left, 0,size.width, size.height);
	
        size = Forward.getPreferredSize();        
        Forward.setBounds(120 + insets.left, 0,size.width, size.height);
        
        /***************
         **ProgressBar**
         ***************/
        JProgressBar bar = new JProgressBar(0,100);
        bar.setValue(50);
        bar.setStringPainted(true);
        pane.add(bar);
        
        size = bar.getPreferredSize();
        bar.setBounds(150, 10,500,15);
        bar.setBackground(Color.white);
        
        
        
        /*********************
         **Volume controller**
         ********************/
        JSlider vol = new JSlider(JSlider.HORIZONTAL,0,100,50);
        vol.setMajorTickSpacing(20);
        vol.setMinorTickSpacing(5);
      
        vol.setPaintTicks(true);
        pane.add(vol);
        
        size = bar.getPreferredSize();
        vol.setBounds(650,10,size.width-5,15);
        vol.setBackground(col);
        
        /***************
         **JText field**
         ***************/
        JTextArea text = new JTextArea();
        JPanel Default = new JPanel();
        Default.setLayout(null);
        Default.setBackground(Color.white);
        
        JPanel statusbar = new JPanel();
        statusbar.setLayout(null);
        statusbar.setBackground(Color.lightGray);
        /********************
         **JLabel for JText**
         ********************/
        JLabel playing = new JLabel("Playing");
        JLabel artist = new JLabel("Artist/Album");
        JLabel trackno = new JLabel("Track No");
        JLabel title = new JLabel("Title");
        JLabel duration = new JLabel("Duration");
       
        
        /********
         **JTab**
         ********/
        
        JTabbedPane tab = new JTabbedPane();
        tab.add("Default",Default);
        pane.add(tab);
        size = tab.getPreferredSize();
        tab.setBounds(0, 38, 800, 125);
        
        size = playing.getPreferredSize();
        playing.setBounds(0, 0, size.width, size.height);
        Default.add(playing);
        
        size = artist.getPreferredSize();
        artist.setBounds(50, 0, size.width, size.height);
        Default.add(artist);
        
        size = trackno.getPreferredSize();
        trackno.setBounds(150, 0, size.width, size.height);
        Default.add(trackno);
        
        
        size = title.getPreferredSize();
        title.setBounds(250, 0, size.width, size.height);
        Default.add(title);
        
        size = duration.getPreferredSize();
        duration.setBounds(350, 0, size.width, size.height);
        Default.add(duration);       
        
       
        
	}

       
	private static void createAndShowGUI(){
		 JFrame frame = new JFrame("Music Collection Player");
		 	
		  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	        //Display the window.
	        
	        /**********************************
	         **Add and fill a menu bar[JMenu]**
	         **********************************/
	        
	        JMenuBar menubar = new JMenuBar();
			j1 = new JMenuItem("New");
			j2 = new JMenuItem("Add File");
			j3 = new JMenuItem("Add Folder");
			j4 = new JMenuItem("Open");
		    j5 = new JMenuItem("Save");
			
			j6 = new JMenuItem("Normal");
			j7 = new JMenuItem("Random");
			j8 = new JMenuItem("Repeat");
			
			j9 = new JMenuItem("About");
			
			
			JMenu menu = new JMenu("Collection");
			menu.add(j1);
			menu.add(j2);
			menu.add(j3);
			menu.add(j4);
			menu.add(j5);
			menubar.add(menu);
			
			JMenu menu2 = new JMenu("Instrument");
			menu2.add(j6);
			menu2.add(j7);
			menu2.add(j8);
			menubar.add(menu2);
			
			JMenu menu3 = new JMenu("Help");
			menu3.add(j9);
			menubar.add(menu3);
			
			frame.setJMenuBar(menubar);
	        //Set up the content pane.
		 
	        addComponentsToPane(frame.getContentPane());
	        frame.pack();
	        //Size and display the window.
	        Insets insets = frame.getInsets();
	        frame.setSize(800 + insets.left + insets.right,203 + insets.top + insets.bottom);
	        frame.setVisible(true);
	       
	    }
	
	
	private void setLookAndFeel(){
		try{
		UIManager.setLookAndFeel(
				"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
				);
				SwingUtilities.updateComponentTreeUI(this);
		}catch(Exception e){
			System.err.println("Couldn't use the system" + "look and feel: " + e);
		}
	}
	
	public static void main(String[] a) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	  }
	
	

}
