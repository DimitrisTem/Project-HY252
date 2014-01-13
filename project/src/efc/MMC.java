package efc;

public abstract class MMC{
	private String notes;
	private String instruments;
	
	MMC(){}
	
	MMC(String notes){
		this.notes=notes;
	}
	MMC(String notes,String instrument){
		this.notes=notes;
		this.instruments=instrument;
	}
	public @Override
	abstract String toString();
	abstract void InsertNotes();
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getInstruments() {
		return instruments;
	}
	public void setInstruments(String instruments) {
		this.instruments = instruments;
	}

}
