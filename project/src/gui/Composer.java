package gui;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Composer extends JFrame{
	public static Color col =new Color(255,255,255);
	public static Color colo =new Color(153,217,234);
	public static String tmp ;
	static JFrame frame;

	
	public static void addtxt(String toString){
		
		JTextArea text = new JTextArea(toString);
		
		text.setLayout(null);
		frame.getContentPane().add(text);
		
		
		text.setEditable(false);
		text.setBounds(0, 360, 900, 145);
		text.setBackground(colo);
		
	}
	
	/***************		 
	 **Make panels**
	 ***************/
	 static JPanel noteC;
	 static JPanel noteCC;
	 static JPanel noteD;
	 static JPanel noteDD;
	 static JPanel noteE;
	 static JPanel noteF;
	 static JPanel noteFF;
	 static JPanel noteG;
	 static JPanel noteGG;
	 static JPanel noteA;
	 static JPanel noteAA;
	 static JPanel noteB;

	 
	 static JPanel noteCg;
	 static JPanel noteCCg;
	 static JPanel noteDg;
	 static JPanel noteDDg;
	 static JPanel noteEg;
	 static JPanel noteFg;
	 static JPanel noteFFg;
	 static JPanel noteGg;
	 static JPanel noteGGg;
	 static JPanel noteAg;
	 static JPanel noteAAg;
	 static JPanel noteBg;
	 
	 
	 static JPanel play;
	 static JPanel stop;
	
	 static JPanel dono;
	 static JPanel retro;
	 static JPanel trans;
	 static JPanel refle;
	
	 static JPanel reset;
	
	 
	 /**************
	  **JMenu item**
	  **************/
	 static JMenuItem j1;
	 static JMenu j2; 
	 static JMenuItem j3;
	 static JMenuItem j4;
	 static JMenuItem j5;
	 static JMenuItem j6;
	 static JMenuItem j7;
	 static JMenuItem j8;
	 static JMenuItem j9;
	 static JMenuItem j10;
	 static JMenuItem j11; 
	 static JMenuItem j12;
	 static JMenuItem j13;
	 static JMenuItem j14;
	 static JMenuItem j15;
	 
	 /*******************
	  **ActionListeners**
	  *******************/
	 public void addmenuListeners(ActionListener actionListener){
			j1.addActionListener(actionListener);		
			j3.addActionListener(actionListener);
			j4.addActionListener(actionListener);
			j5.addActionListener(actionListener);
			j6.addActionListener(actionListener);
			j7.addActionListener(actionListener);
			j8.addActionListener(actionListener);
			j9.addActionListener(actionListener);
			j10.addActionListener(actionListener);
			j11.addActionListener(actionListener);
			j12.addActionListener(actionListener);
			j13.addActionListener(actionListener);
			j14.addActionListener(actionListener);
			j15.addActionListener(actionListener);
			
		}

		/******************
		 **MouseListeners**
		 ******************/
		
		public void addmouseListeners(MouseListener mouseListener){
			noteC.addMouseListener(mouseListener);
			noteCC.addMouseListener(mouseListener);
			noteD.addMouseListener(mouseListener);
			noteDD.addMouseListener(mouseListener);
			noteE.addMouseListener(mouseListener);
			noteF.addMouseListener(mouseListener);
			noteFF.addMouseListener(mouseListener);
			noteG.addMouseListener(mouseListener);
			noteGG.addMouseListener(mouseListener);
			noteA.addMouseListener(mouseListener);
			noteAA.addMouseListener(mouseListener);
			noteB.addMouseListener(mouseListener);		
			play.addMouseListener(mouseListener);
			stop.addMouseListener(mouseListener);
			
		}
	 
	 
	public static void addComponentsToPane(Container pane){
		pane.setLayout(null);
		
		pane.setBackground(col);
		
		/*************
		 **new Panel**
		 *************/
		noteC = new JPanel();
		noteC.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteC.jpg")));
		
		noteCC = new JPanel();
		noteCC.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteC#.jpg")));
		
		noteD = new JPanel();
		noteD.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteD.jpg")));
		
		noteDD = new JPanel();
		noteDD.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteD#.jpg")));
		
		noteE = new JPanel();
		noteE.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteE.jpg")));
		
		noteF = new JPanel();
		noteF.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteF.jpg")));
		
		noteFF = new JPanel();
		noteFF.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteF#.jpg")));
		
		noteG = new JPanel();
		noteG.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteG.jpg")));
		
		noteGG = new JPanel();
		noteGG.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteG#.jpg")));
		
		noteA = new JPanel();
		noteA.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteA.jpg")));
		
		noteAA = new JPanel();
		noteAA.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteA#.jpg"))); 	
		
		noteB = new JPanel();
		noteB.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteB.jpg")));
		
		noteCg = new JPanel();
		noteCg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteCg.jpg")));
		
		noteCCg = new JPanel();
		noteCCg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteC#g.jpg")));
		
		noteDg = new JPanel();
		noteDg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteDg.jpg")));
		
		noteDDg = new JPanel();
		noteDDg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteD#g.jpg")));
		
		noteEg = new JPanel();
		noteEg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteEg.jpg")));
		
		noteFg = new JPanel();
		noteFg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteFg.jpg")));
		
		noteFFg = new JPanel();
		noteFFg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteF#g.jpg")));
		
		noteGg = new JPanel();
		noteGg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteGg.jpg")));
		
		noteGGg = new JPanel();
		noteGGg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteG#g.jpg")));
		
		noteAg = new JPanel();
		noteAg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteAg.jpg")));
		
		noteAAg = new JPanel();
		noteAAg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteA#g.jpg"))); 	
		
		noteBg = new JPanel();
		noteBg.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/noteBg.jpg")));
		
		
		play = new JPanel();
		play.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/playblack.jpg")));
		
		stop = new JPanel();
		stop.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/stopblack.jpg")));
		
		dono = new JPanel();
		dono.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/Donothing.jpg")));
		
		retro = new JPanel();
		retro.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/ret.jpg")));
		
		trans = new JPanel();
		trans.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/trans.jpg")));
		
		refle = new JPanel();
		refle.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/ref.jpg")));
		
		reset = new JPanel();
		reset.add(new JLabel(new ImageIcon("C:/Users/Dimitris/Documents/GitHub/Project-HY252/project/Resources/reset.jpg")));
		
		
		/*************************
		 **Adding JPanel to pane**
		 *************************/
		
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
		
		pane.add(noteCg);
		pane.add(noteCCg);
		pane.add(noteDg);
		pane.add(noteDDg);
		pane.add(noteEg);
		pane.add(noteFg);
		pane.add(noteFFg);
		pane.add(noteGg);
		pane.add(noteGGg);
		pane.add(noteAg);
		pane.add(noteAAg);
		pane.add(noteBg);
		
		pane.add(play);
		pane.add(stop);
		pane.add(dono);
		pane.add(retro);
		pane.add(trans);
		pane.add(refle);
		
		pane.add(reset);
		/***********************************
        **Place panel at correct position**
        ***********************************/
       
	
		
		
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
		
		size = noteCg.getPreferredSize();
		noteCg.setBounds(100, 45,size.width, size.height);
		
		
		size = noteCCg.getPreferredSize();
		noteCCg.setBounds(179,50,size.width,size.height);
		
		
		size = noteDg.getPreferredSize();
		noteDg.setBounds(255,55,size.width,size.height);
		
		size = noteDDg.getPreferredSize();
		noteDDg.setBounds(324,60,size.width,size.height);
		
		size = noteEg.getPreferredSize();
		noteEg.setBounds(393,65,size.width,size.height);
		
		size = noteFg.getPreferredSize();
		noteFg.setBounds(458,70,size.width,size.height);
		
		size = noteFFg.getPreferredSize();
		noteFFg.setBounds(520,75,size.width,size.height);
		
		size = noteGg.getPreferredSize();
		noteGg.setBounds(578,82,size.width,size.height);
		
		size = noteGGg.getPreferredSize();
		noteGGg.setBounds(632,85,size.width,size.height);
		
		size = noteAg.getPreferredSize();
		noteAg.setBounds(682,89,size.width,size.height);
		
		size = noteAAg.getPreferredSize();
		noteAAg.setBounds(728,92,size.width,size.height);
////////////////////////////////////////////////////////////////////////////
		size = play.getPreferredSize();
		play.setBounds(820, 0, size.width, size.height);
		
		size = stop.getPreferredSize();
		stop.setBounds(820, 0, size.width, size.height);
		
		
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
		stop.setBackground(col);
////////////////////////////////////////////////////////////////////////////		
		dono.setBackground(col);
		retro.setBackground(col);
		trans.setBackground(col);
		refle.setBackground(col);
////////////////////////////////////////////////////////////////////////////		
		reset.setBackground(col);
		
		
	}
	
	private static void createAndShowGUI(){
		 frame = new JFrame("Composer");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 
		 /******************
		 	**MENU OPTIONS**
		 *******************/
		j1 = new JMenuItem("Open");
		
		j3 = new JMenuItem("Save");
		j4 = new JMenuItem("Save As");
		j5 = new JMenuItem("Export");
		j6 = new JMenuItem("Quit");
		j7 = new JMenuItem("Piano");
		j8 = new JMenuItem("Guitar");
		j9 = new JMenuItem("Flute");
		j10 = new JMenuItem("Other");
		j11 = new JMenuItem("About");
		j12 = new JMenuItem("Clear");
		j13 = new JMenuItem("Free");
		j14 = new JMenuItem("Atonal");
		j15 = new JMenuItem("Algorithmic");
		
		JMenuBar menubar = new JMenuBar();
		
		
		j2 = new JMenu("New");
		j2.add(j13);
		j2.add(j14);
		j2.add(j15);
		JMenu menu = new JMenu("Composition");
		menu.add(j1);
		menu.add(j2);
		menu.add(j12);
		menu.addSeparator();
		menu.add(j3);
		menu.add(j4);
		menu.add(j5);
		menu.addSeparator();
		menu.add(j6);
		menubar.add(menu);
		
		JMenu menu2 = new JMenu("Instrument");
		menu2.add(j7);
		menu2.add(j8);
		menu2.add(j9);
		menu2.addSeparator();
		menu2.add(j10);
		menubar.add(menu2);
		
		JMenu menu3 = new JMenu("Help");
		menu3.add(j11);
		menubar.add(menu3);
		
		frame.setJMenuBar(menubar);
		 addComponentsToPane(frame.getContentPane());
	        //frame.pack();
	        //Size and display the window.
	        Insets insets = frame.getInsets();
	        frame.setBounds(100,80,900 + insets.left + insets.right,530 + insets.top + insets.bottom);
	        frame.setVisible(true);
	       frame.setResizable(false);
	}
	
	
	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
	
}
