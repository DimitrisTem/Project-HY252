package gui;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.plaf.metal.*;

public class Composer extends JFrame{
	public Composer(){
		/*Windows conf*/
		super("Composer");
		JPanel panel=new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setVisible(true);
		/****************
		 **MENU OPTIONS**
		 ****************/
		JMenuItem j1 = new JMenuItem("Open");
		JMenuItem j2 = new JMenuItem("New");
		JMenuItem j3 = new JMenuItem("Save");
		JMenuItem j4 = new JMenuItem("Save As");
		JMenuItem j5 = new JMenuItem("Export");
		JMenuItem j6 = new JMenuItem("Quit");
		JMenuItem j7 = new JMenuItem("Piano");
		JMenuItem j8 = new JMenuItem("Guitar");
		JMenuItem j9 = new JMenuItem("Flute");
		JMenuItem j10 = new JMenuItem("Other");
		JMenuItem j11 = new JMenuItem("About");
		JMenuBar menubar = new JMenuBar();
		
		JMenu menu = new JMenu("Composition");
		menu.add(j1);
		menu.add(j2);
		menu.add(j3);
		menu.add(j4);
		menu.add(j5);
		menu.add(j6);
		menubar.add(menu);
		
		JMenu menu2 = new JMenu("Instrument");
		menu2.add(j7);
		menu2.add(j8);
		menu2.add(j9);
		menu2.add(j10);
		menubar.add(menu2);
		
		JMenu menu3 = new JMenu("Help");
		menu3.add(j11);
		menubar.add(menu3);
		
		JScrollPane scroll = new JScrollPane();
		BorderLayout bord = new BorderLayout();
		setLayout(bord);
		
	//	add("Center",scroll);
		setJMenuBar(menubar);
		
		/***********
		 **JAPANEL**
		 **********/
		
	/*	JPanel jPanel = new JPanel();
		jPanel.setLayout(null);
		ImageIcon icon = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteA.jpg");
		JLabel label = new JLabel(icon);
		jPanel.add(label);
		super.add(jPanel);
		GridLayout grid = new GridLayout(3,1);
		add(jPanel);
		setVisible(true);    
		*/
		
		/*********
		 **icons**
		 *********/
		
		ImageIcon Play = new ImageIcon("Resources/playbut.jpg");
		ImageIcon Stop = new ImageIcon("Resources/stopbut.jpg");
		
		
		/**************************
		 **Play/stop icon buttons**
		 **************************/
		
		JButton play = new JButton("",Play);
		JButton stop = new JButton("",Stop);
		play.setLocation(40, 400);
		play.setLocation(5,5);
		panel.add(play,BorderLayout.EAST);
		//panel.add(stop);
		add(panel);
		pack();
		
		
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
		Composer comp = new Composer();
		comp.setBounds(50,50,800,500);
	}
	
}
