package MMC;

public abstract class Composition {
	private String compName;
	private String composer;
	private String instrument;
	private String notes;
	
	Composition(String compName,String composer){
		this.setCompName(compName);
		this.setComposer(composer);
		this.setInstrument("default");
	}
	Composition(String compName,String composer,String instrument){
		this.setCompName(compName);
		this.setComposer(composer);
		this.setInstrument(instrument);
	}
	Composition(String compName,String composer,String instrument,String notes){
		this.setCompName(compName);
		this.setComposer(composer);
		this.setInstrument(instrument);
		this.setNotes(notes);
	}
	
	
	abstract void compose();
	
	
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	

	

}
