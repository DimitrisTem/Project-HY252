package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ComposerController{
	private ComposerMode mode;
	private ComposerView view;
	private String compMode=null;
	private int num=0;
	String Symmetr="";
	ComposerController(ComposerMode mode,ComposerView view){
		this.mode=mode;
		this.view=view;
		this.view.addmouseListeners(new mouseListener());
		this.view.addmenuListeners(new actionListener());
	}
	class mouseListener implements MouseListener,Runnable{
		
		Thread th;			
		void startThread(){
			ComposerView.play.setVisible(false);
			ComposerView.stop.setVisible(true);
	    	th=new Thread(this);
	    	th.start();
	   	 }
		
		public void run() {
					mode.Play();
					ComposerView.play.setVisible(true);
					ComposerView.stop.setVisible(false);
		}
  
		public void stopThread() throws Throwable{
			th.stop();
			th=null;
    }
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			if(e.getComponent().equals(ComposerView.noteC)){
				if(compMode.equals("Free"))
					mode.InsertNotes("C ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("C ");
					ComposerView.noteC.setVisible(false);
					num++;
				}
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.noteCC)){
				if(compMode.equals("Free"))
					mode.InsertNotes("C# ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("C# ");
					ComposerView.noteCC.setVisible(false);
					num++;
				}	
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.noteD)){
				if(compMode.equals("Free"))
					mode.InsertNotes("D ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("D ");
					ComposerView.noteD.setVisible(false);
					num++;
				}
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.noteDD)){
				if(compMode.equals("Free"))
					mode.InsertNotes("D# ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("D# ");
					ComposerView.noteDD.setVisible(false);
					num++;
				}
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.noteE)){
				if(compMode.equals("Free"))
					mode.InsertNotes("E ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("E ");
					ComposerView.noteE.setVisible(false);
					num++;
				}
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.noteF)){
				if(compMode.equals("Free"))
					mode.InsertNotes("F ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("F ");
					ComposerView.noteF.setVisible(false);
					num++;
				}
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.noteFF)){
				if(compMode.equals("Free"))
					mode.InsertNotes("F# ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("F# ");
					ComposerView.noteFF.setVisible(false);
					num++;
				}
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.noteG)){
				if(compMode.equals("Free"))
					mode.InsertNotes("G ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("G ");
					ComposerView.noteG.setVisible(false);
					num++;
				}
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.noteGG)){
				if(compMode.equals("Free"))
					mode.InsertNotes("G# ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("G# ");
					ComposerView.noteGG.setVisible(false);
					num++;
				}
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.noteA)){
				if(compMode.equals("Free"))
					mode.InsertNotes("A ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("A ");
					ComposerView.noteA.setVisible(false);
					num++;
				}
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.noteAA)){
				if(compMode.equals("Free"))
					mode.InsertNotes("A# ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("A# ");
					ComposerView.noteAA.setVisible(false);
					num++;
				}
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.noteB)){
				if(compMode.equals("Free"))
					mode.InsertNotes("B ");
				else if(compMode.equals("Atonal")){
					mode.InsertNotes("B ");
					ComposerView.noteB.setVisible(false);
					num++;
				}
				ComposerView.addtxt(mode.toString());
			}else if(e.getComponent().equals(ComposerView.play)){
				
				startThread();				
			}else if(e.getComponent().equals(ComposerView.stop)){
				mode.Composer.player.stop();
				mode.Composer.player.close();
				ComposerView.stop.setVisible(false);
				ComposerView.play.setVisible(true);				
			}else if(e.getComponent().equals(ComposerView.trans)){
				System.out.println("aaaaa");
				mode.InsertNotes("transpose 1");
				Symmetr+="transpose("+"1"+")    "; 
				ComposerView.addtxt(mode.Composer.toString()+Symmetr);
			}else if(e.getComponent().equals(ComposerView.retro)){
				System.out.println("aaa22aa");
				mode.InsertNotes("retrograde");
				Symmetr+="retrograde    "; 
				ComposerView.addtxt(mode.Composer.toString()+Symmetr);
			}else if(e.getComponent().equals(ComposerView.dono)){				
				System.out.println("aaa333aa");mode.InsertNotes("doNothing");
				Symmetr+="doNothing"+"    "; 
				ComposerView.addtxt(mode.Composer.toString()+Symmetr);
			}else if(e.getComponent().equals(ComposerView.refle)){
				System.out.println("aa44aaa");
				mode.InsertNotes("reflection 8");
				Symmetr+="reflection("+"8"+")    "; 
				ComposerView.addtxt(mode.Composer.toString()+Symmetr);
			}else if (e.getComponent().equals(ComposerView.reset)){
				enableNotes();
				mode.Clear();
				num=0;
				Symmetr="";
			}
			
			if(num>10){
				ComposerView.trans.setVisible(true);
				ComposerView.retro.setVisible(true);
				ComposerView.refle.setVisible(true);
				ComposerView.dono.setVisible(true);				
			}else{
				ComposerView.trans.setVisible(false);
				ComposerView.retro.setVisible(false);
				ComposerView.refle.setVisible(false);
				ComposerView.dono.setVisible(false);
			}
				
			
			
			
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			
			
		}
		
	}
		
	class actionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Open")){
				try {
					mode.open("C:/Users/emil/Desktop/"
							+ "test.txt");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}else if(e.getActionCommand().equals("Save")){
				try {
					mode.save();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}else if(e.getActionCommand().equals("Save As")){
				try {
					mode.saveAs("C:/Users/emil/Desktop/");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}else if(e.getActionCommand().equals("Free")){
				
				mode.setCompName("O malakas");
				mode.setComposer("O mhtsos");
				mode.setMMCmode("free");				
				compMode="Free";
				enableNotes();
			}else if(e.getActionCommand().equals("Atonal")){
				mode.setCompName("O malakas");
				mode.setComposer("O mhtsos");
				mode.setMMCmode("Atonal");
				compMode="Atonal";
				enableNotes();
			}else if(e.getActionCommand().equals("Algorithmic")){
				mode.setCompName("O malakas");
				mode.setComposer("O mhtsos");
				mode.setNum(12);
				mode.setMMCmode("Algorithmic");
				compMode="Algorithmic";
				enableNotes();
			}else if(e.getActionCommand().equals("Open")){				
				try {
					mode.open("C:/Users/emil/Desktop/test.txt");
				} catch (IOException e1) {					
					e1.printStackTrace();
				}	
			}else if(e.getActionCommand().equals("Export")){				
				try {
					mode.export("C:/Users/emil/Desktop");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}else if(e.getActionCommand().equals("Clear")){
				mode.Clear();
				num=0;
				Symmetr="";
				ComposerView.trans.setVisible(false);
				ComposerView.retro.setVisible(false);
				ComposerView.refle.setVisible(false);
				ComposerView.dono.setVisible(false);
				enableNotes();
			}else if(e.getActionCommand().equals("Quit")){
				quit();
			}else if(e.getActionCommand().equals("Piano")){
				mode.selectInstrument("I[Piano]");
			}else if(e.getActionCommand().equals("Guitar")){
				mode.selectInstrument("I[Guitar]");	
			}else if(e.getActionCommand().equals("Flute")){
				mode.selectInstrument("I[Flute]");
			}
			
			
			
			
			
			
			
			
			
			
			
		
			
			
		}
		
	}
	
	
	
	public void info(){
		String name ;
		String composer;
		name = JOptionPane.showInputDialog(null,"Enter Composition name");
		while(name.equals("")){
			name = JOptionPane.showInputDialog(null,"Enter Composition name");
		}
		composer = JOptionPane.showInputDialog(null,"Enter Composer name");
		while(composer.equals("")){
			composer = JOptionPane.showInputDialog(null,"Enter Composition name");
		}		
		mode.setCompName(name);
		mode.setComposer(composer);
	}
	
	public void quit(){
		int exit = JOptionPane.showConfirmDialog(null, "Exit Composer?","Quit",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
		if(exit==0)
			System.exit(0);
	}
	
	
	public void enableNotes(){
		ComposerView.noteC.setVisible(true);
		ComposerView.noteCC.setVisible(true);
		ComposerView.noteD.setVisible(true);
		ComposerView.noteDD.setVisible(true);
		ComposerView.noteE.setVisible(true);
		ComposerView.noteF.setVisible(true);
		ComposerView.noteFF.setVisible(true);
		ComposerView.noteG.setVisible(true);
		ComposerView.noteGG.setVisible(true);
		ComposerView.noteA.setVisible(true);
		ComposerView.noteAA.setVisible(true);
		ComposerView.noteB.setVisible(true);
		ComposerView.addtxt(mode.toString());
	
	}
	
	
	public static void main(String arg[]){
		ComposerMode t=new ComposerMode();
		ComposerView a=new ComposerView();
		ComposerController h=new ComposerController(t,a);
			
		}
	}