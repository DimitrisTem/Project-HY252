package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Composer extends JFrame{
	public static Color col =new Color(255,255,255);
	public static String tmp;
	public static void addComponentsToPane(Container pane){
		pane.setLayout(null);
		
		pane.setBackground(col);
		
		/***************		 
		 **Make panels**
		 ***************/
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
	
		JPanel play = new JPanel();
		
		
		JPanel dono = new JPanel();
		JPanel retro = new JPanel();
		JPanel trans = new JPanel();
		JPanel refle = new JPanel();
		
		/***********
		 **JButton**
		 ***********/
		
		JPanel reset = new JPanel();
		reset.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/reset.jpg")));
		
		/**************************
         **Adding icons to panels**
         **************************/
		
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
		
		
		ImageIcon playblack = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/playblack.jpg");
		JLabel labelplay = new JLabel(playblack);
		
		ImageIcon don = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/Donothing.jpg");
		JLabel labeldon = new JLabel(don);
		
		ImageIcon Rt = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/ret.jpg");
		JLabel labelret = new JLabel(Rt);
		
		ImageIcon tran = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/trans.jpg");
		JLabel labeltran = new JLabel(tran);
		
		ImageIcon ref = new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/ref.jpg");
		JLabel labelref = new JLabel(ref);
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
		
		play.add(labelplay);
		
		dono.add(labeldon);
		retro.add(labelret);
		trans.add(labeltran);
		refle.add(labelref);
		/************************
		 **Adding jPanel/button to pane**
		 ************************/
		
		pane.add(noteC);
		pane.add(noteCC);
		pane.add(noteD);
		pane.add(noteDD);
		pane.add(noteE);
		pane.add(noteF);
		pane.add(noteFF);
		pane.add(noteG);
		pane.add(noteGG);
		pane.add(noteA);
		pane.add(noteAA);
		pane.add(noteB);
		
		pane.add(play);
		
		pane.add(dono);
		pane.add(retro);
		pane.add(trans);
		pane.add(refle);
		
		pane.add(reset);
		/***********************************
        **Place panel at correct position**
        ***********************************/
       
		Insets insets = pane.getInsets();
		
		
		Dimension size = noteC.getPreferredSize();
		noteC.setBounds(100, 45,size.width, size.height);
		
		
		size = noteCC.getPreferredSize();
		noteCC.setBounds(179,50,size.width,size.height);
		
		
		size = noteD.getPreferredSize();
		noteD.setBounds(255,55,size.width,size.height);
		
		size = noteDD.getPreferredSize();
		noteDD.setBounds(324,60,size.width,size.height);
		
		size = noteE.getPreferredSize();
		noteE.setBounds(393,65,size.width,size.height);
		
		size = noteF.getPreferredSize();
		noteF.setBounds(458,70,size.width,size.height);
		
		size = noteFF.getPreferredSize();
		noteFF.setBounds(520,75,size.width,size.height);
		
		size = noteG.getPreferredSize();
		noteG.setBounds(578,82,size.width,size.height);
		
		size = noteGG.getPreferredSize();
		noteGG.setBounds(632,85,size.width,size.height);
		
		size = noteA.getPreferredSize();
		noteA.setBounds(682,89,size.width,size.height);
		
		size = noteAA.getPreferredSize();
		noteAA.setBounds(728,92,size.width,size.height);
////////////////////////////////////////////////////////////////////////////
		size = play.getPreferredSize();
		play.setBounds(820, 0, size.width, size.height);
////////////////////////////////////////////////////////////////////////////		
		size = dono.getPreferredSize();
		dono.setBounds(110, 320, size.width, size.height);
		
		size = retro.getPreferredSize();
		retro.setBounds(280, 320, size.width, size.height);
		
		size = trans.getPreferredSize();
		trans.setBounds(480, 320, size.width, size.height);
		
		size = refle.getPreferredSize();
		refle.setBounds(680, 320, size.width, size.height);
////////////////////////////////////////////////////////////////////////////		
		size = reset.getPreferredSize();
		reset.setBounds(0, 0, size.width, size.height);
		/*************************
		 **Set background colors**
		 *************************/
		noteC.setBackground(col);
		noteCC.setBackground(col);
		noteD.setBackground(col);
		noteDD.setBackground(col);
		noteE.setBackground(col);
		noteF.setBackground(col);
		noteFF.setBackground(col);
		noteG.setBackground(col);
		noteGG.setBackground(col);
		noteA.setBackground(col);
		noteAA.setBackground(col);
		noteB.setBackground(col);
////////////////////////////////////////////////////////////////////////////		
		play.setBackground(col);
////////////////////////////////////////////////////////////////////////////		
		dono.setBackground(col);
		retro.setBackground(col);
		trans.setBackground(col);
		refle.setBackground(col);
////////////////////////////////////////////////////////////////////////////		
		reset.setBackground(col);
		/*********
		 **JText**
		 *********/
		
		JTextArea text = new JTextArea(tmp);
		
		text.setLayout(null);
		pane.add(text);
		
		size = text.getPreferredSize();
		text.setEditable(false);
		text.setBounds(0, 360, 900, 145);
		text.setBackground(Color.orange);
		
		
	}
	
	private static void createAndShowGUI(){
		 JFrame frame = new JFrame("Composer");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 
		 /******************
		 	**MENU OPTIONS**
		 *******************/
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
		
		frame.setJMenuBar(menubar);
		 addComponentsToPane(frame.getContentPane());
	        frame.pack();
	        //Size and display the window.
	        Insets insets = frame.getInsets();
	        frame.setBounds(100,80,900 + insets.left + insets.right,530 + insets.top + insets.bottom);
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
	
	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
	
}
