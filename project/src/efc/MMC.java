package efc;

import org.jfugue.Player;

import interfaces.MemoryControl;
import MMC.Composition;

public abstract class MMC implements MemoryControl{
	public Player player;
	protected Composition comp;
	MMC(){}
	
	MMC(String notes){
	}
	MMC(String notes,String instrument){
	}
	public abstract void Play();
	public abstract String toString();
	public abstract void InsertNotes(String note);
	
	public String getNotes() {
		return comp.getNotes();
	}
	public void setNotes(String notes) {
		
		comp.setNotes(notes);
	}
	public String getInstruments() {		
		return comp.getInstrument();
		
	}
	public void setInstruments(String instrument) {
		comp.setInstrument(instrument);
		
	}
	
	public void InsertAtonalMode(String mode,int modeValue){
		
	}

}
