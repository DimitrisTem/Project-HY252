package gui;



import java.io.IOException;

import org.jfugue.Player;

import efc.*;

public class ComposerMode {
	private String compName=null;
	private String composer=null;
	
	private int num;
	public MMC Composer;
	
	public ComposerMode() {		
	}
	public void setMMCmode(String mode){
		if(mode.equals("free"))
			Composer=new FreeMMC(compName,composer);
		else if(mode.equals("Atonal"))
			Composer=new AtonalMMC(compName,composer);
		else if(mode.equals("Algorithmic"))
			Composer=new AlgorithmicMMC(compName,composer,num);			
	}
	public void saveAs(String name) throws IOException{
		Composer.saveAs(name);
		
	}
	public void save() throws IOException{
		Composer.save();
	}
	public void open(String filePath) throws IOException{
		Composer.open(filePath);
	}
	public void export(String filePath) throws IOException{
		Composer.export(filePath);
	}
	public void selectInstrument(String instrument){
		Composer.setInstruments(instrument);
	}
	public String toString() {
	
		return Composer.toString();
	}
	public void InsertNotes(String note){
		Player player=new Player();		
		if(Composer instanceof AtonalMMC&&num <11){
			Composer.InsertNotes(note);
			String pl=Composer.getInstruments()+" "+note;
			player.play(pl);
			num++;
		}else if(num==11){
			Composer.InsertNotes(note);
		}else{
			Composer.InsertNotes(note);
			String pl=Composer.getInstruments()+" "+note;
			player.play(pl);
		}
	}
	public void Clear(){
		num=0;
		if(Composer instanceof FreeMMC)
			Composer.setNotes(null);
		else if(Composer instanceof AtonalMMC)
			Composer =new AtonalMMC(compName,composer);
		else if((Composer instanceof AlgorithmicMMC))
			((AlgorithmicMMC) Composer).setNum(num);
			
	}
	public void Play(){
		Composer.Play();
	}
	
				/*******************
				 **Setters/getters**
				 *******************/
	
	
	public void setCompName(String compName){
		this.compName=compName;
	}
	public void setComposer(String composer){
		this.composer=composer;
	}
	public String getCompName(){
		return compName;
	}
	public String getComposer(){
		return composer;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}




