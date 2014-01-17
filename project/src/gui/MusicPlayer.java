package gui;

import java.awt.*;

import javax.swing.*;

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
		
		
		/*************************
		 **Grid layout configure**
		 *************************/
		Container contentPane = getContentPane();
		GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        contentPane.setLayout(gridbag);
        c.fill = GridBagConstraints.HORIZONTAL; 
		/**********
		 **JPanel**
		 **********/
        
        
		
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
	
	public static void main(String[] args){
		MusicPlayer player = new MusicPlayer();
		player.setBounds(100,50,800,300);
	}
	
	

}
