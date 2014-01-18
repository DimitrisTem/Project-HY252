package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MusicPlayer extends JFrame {
	
	
	MusicPlayer(){
		/*Windows conf*/
		super("Music Collection Player");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setVisible(true);
		
		/****************
		 **Menu Options**
		 ****************/
		JMenuBar menubar = new JMenuBar();
		JMenuItem j1 = new JMenuItem("New");
		JMenuItem j2 = new JMenuItem("Add File");
		JMenuItem j3 = new JMenuItem("Add Folder");
		JMenuItem j4 = new JMenuItem("Open");
		JMenuItem j5 = new JMenuItem("Save");
		
		JMenuItem j6 = new JMenuItem("Normal");
		JMenuItem j7 = new JMenuItem("Random");
		JMenuItem j8 = new JMenuItem("Repeat");
		
		JMenuItem j9 = new JMenuItem("About");
		
		
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
		
		setJMenuBar(menubar);
		
		

        /**********
		 **JPanel**
		 **********/
        JPanel Play = new JPanel();
        JPanel Pause = new JPanel();
        JPanel Stop = new JPanel();
        JPanel Forward = new JPanel();
        JPanel Backward = new JPanel();
        
        /****************
         **Icons/Labels**
         ****************/
        ImageIcon play = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/play.jpg");
        JLabel PLAY = new JLabel(play);
        Play.add(PLAY);
        
        ImageIcon pause = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/pause.jpg");
        JLabel PAUSE = new JLabel(pause);
        Pause.add(PAUSE);
        
        ImageIcon stop = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/stop.jpg");
        JLabel STOP = new JLabel(stop);
        Stop.add(STOP);
        
        ImageIcon forward = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/front.jpg");
        JLabel FORWARD = new JLabel(forward);
        Forward.add(FORWARD);
        
        ImageIcon backward = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/back.jpg");
        JLabel BACKWARD = new JLabel(backward);
        Backward.add(BACKWARD);
        
        
        
		/*************************
		 **Grid layout configure**
		 *************************/
	
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
	    
		MusicPlayer mp = new MusicPlayer();
		mp.setBounds(50,100,800,200);
	    
	  }
	
	

}
