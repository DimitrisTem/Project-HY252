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
		
		setJMenuBar(menubar);
	
		/******************
		 **Grid for notes**
		 ******************/
		GridLayout grid = new GridLayout(1,12);
		
		setLayout(grid);
		/***********
		 **JAPANEL**
		 **********/
		
		/********************
		 **JPanel for notes**
		 ********************/
		JPanel noteC = new JPanel();
		JPanel noteCC = new JPanel();
		JPanel noteD = new JPanel();
		JPanel noteDD = new JPanel();
		JPanel noteE = new JPanel();
		JPanel noteF = new JPanel();
		JPanel noteFF = new JPanel();
		JPanel noteG = new JPanel();
		JPanel noteGG = new JPanel();
		JPanel noteA = new JPanel();
		JPanel noteAA = new JPanel();
		JPanel noteB = new JPanel();
		//panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		/*********************************
		 **set background color to white** 
		 *********************************/
		
		
		noteC.setLayout(new BorderLayout());
		noteC.setBackground(Color.white);
		
		noteCC.setLayout(new BorderLayout());
		noteCC.setBackground(Color.white);
		
		noteD.setLayout(new BorderLayout());
		noteD.setBackground(Color.white);
		
		noteDD.setLayout(new BorderLayout());
		noteDD.setBackground(Color.white);
		
		noteE.setLayout(new BorderLayout());
		noteE.setBackground(Color.white);
		
		noteF.setLayout(new BorderLayout());
		noteF.setBackground(Color.white);
		
		noteFF.setLayout(new BorderLayout());
		noteFF.setBackground(Color.white);
		
		noteG.setLayout(new BorderLayout());
		noteG.setBackground(Color.white);
		
		noteGG.setLayout(new BorderLayout());
		noteGG.setBackground(Color.white);
		
		noteAA.setLayout(new BorderLayout());
		noteAA.setBackground(Color.white);
		
		noteA.setLayout(new BorderLayout());
		noteA.setBackground(Color.white);
		
		noteB.setLayout(new BorderLayout());
		noteB.setBackground(Color.white);
		
		
		/*************************
		 **Image icons for notes**
		 *************************/
		ImageIcon iconc = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteC.jpg");
		JLabel labelNotec = new JLabel(iconc);
		
		ImageIcon iconcc = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteC#.jpg");
		JLabel labelNotecc = new JLabel(iconcc);
		
		ImageIcon icond = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteD.jpg");
		JLabel labelNoted = new JLabel(icond);
		
		ImageIcon icondd = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteD#.jpg");
		JLabel labelNotedd = new JLabel(icondd);
		
		ImageIcon icone = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteE.jpg");
		JLabel labelNotee = new JLabel(icone);
		
		ImageIcon iconf = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteF.jpg");
		JLabel labelNotef = new JLabel(iconf);
		
		ImageIcon iconff = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteF#.jpg");
		JLabel labelNoteff = new JLabel(iconff);
		
		ImageIcon icong = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteG.jpg");
		JLabel labelNoteg = new JLabel(icong);
		
		ImageIcon icongg = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteG#.jpg");
		JLabel labelNotegg = new JLabel(icongg);
		
		ImageIcon icona = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteA.jpg");
		JLabel labelNotea = new JLabel(icona);
		
		ImageIcon iconaa = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteA#.jpg");
		JLabel labelNoteaa = new JLabel(iconaa);
		
		ImageIcon iconb = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteB.jpg");
		JLabel labelNoteb = new JLabel(iconb);
		
		
		
		
		
		/******************************
		 **insert icon label to notes**
		 ******************************/
		
		noteC.add(labelNotec);
	    noteCC.add(labelNotecc);
		noteD.add(labelNoted);
		noteDD.add(labelNotedd);
		noteE.add(labelNotee);
		noteF.add(labelNotef);
		noteFF.add(labelNoteff);
		noteG.add(labelNoteg);
		noteGG.add(labelNotegg);
		noteA.add(labelNotea);
		noteAA.add(labelNoteaa);
		noteB.add(labelNoteb);
		
		
		/*********************************
		 **insert notes at correct order**
		 *********************************/
		
		
		this.add(noteC);
		this.add(noteCC);
		this.add(noteD);
		this.add(noteDD);
		this.add(noteE);
		this.add(noteF);
		this.add(noteFF);
		this.add(noteG);
		this.add(noteGG);
		this.add(noteA);
		this.add(noteAA);
		this.add(noteB);
		
		
		setVisible(true);    
		
		
		/*********
		 **icons**
		 *********/
		
		ImageIcon Play = new ImageIcon("Resources/playbut.jpg");
		ImageIcon Stop = new ImageIcon("Resources/stopbut.jpg");
		
		
		/**************************
		 **Play/stop icon buttons**
		 **************************/
		
		/*JButton play = new JButton("",Play);
		JButton stop = new JButton("",Stop);
		play.setLocation(40, 400);
		play.setLocation(5,5);
		panel.add(play,BorderLayout.EAST);
		//panel.add(stop);
		add(panel);
		pack();
		*/
		
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
		comp.setBounds(100,50,800,600);
	}
	
}
