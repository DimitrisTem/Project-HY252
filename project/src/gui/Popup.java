package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Popup extends JFrame{
	
	
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
	}
	
	public void save(){
		String tmp;
		tmp = JOptionPane.showInputDialog("Where do you want to Save the file?");
		while(tmp.equals("")){
			tmp = JOptionPane.showInputDialog("Where do you want to Save the file?");
		}
	}
	
	public void open(){
		String tmp;
		tmp = JOptionPane.showInputDialog("Add the filepath of the composition you want to open");
		while(tmp.equals("")){
			tmp = JOptionPane.showInputDialog("Add the filepath of the composition you want to open");
		}
	}
	
	public void quit(){
		int exit = JOptionPane.showConfirmDialog(null, "Exit Composer?","Quit",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void notes(){
		String note;
		note = JOptionPane.showInputDialog("Give a number for random composition:");
		while(true){
			if(note.equals(note.replaceAll("^[0-9]", "0"))) note = JOptionPane.showInputDialog("Give A POSITIVE NUMBER for random composition:");
			else  break;
			
		}
	}
	
	public void symmetry(){
		String sym;
		sym = JOptionPane.showInputDialog("Give a number between zero and eleven :");
		while(true){
			if(sym.equals(sym.replaceAll("^[0-9]", "."))) sym = JOptionPane.showInputDialog("Give a number between zero and eleven :");
			else if((Integer.parseInt(sym)<-1 || Integer.parseInt(sym)>12) ) sym = JOptionPane.showInputDialog("Give a number between zero and eleven :");
			else  break;
			
		}
	}
	
public static void main(String[] args){
	Popup one = new Popup();
	
	one.symmetry();
}
}
