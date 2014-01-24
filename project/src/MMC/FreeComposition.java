package MMC;

public class FreeComposition extends Composition {

	public FreeComposition(String compName, String composer) {
		super(compName, composer);
	}

	
	
	public FreeComposition(String compName, String composer, String instrument) {
		super(compName, composer, instrument);
		}

	
	
	public FreeComposition(String compName, String composer, String instrument,
			String notes) {
		super(compName, composer, instrument, notes);
	}
	@Override
	public void addNotes(String note){
		if(getNotes()==null){
			setNotes(getInstrument()+note);
		}
		else
			setNotes(getNotes()+" "+note);
	}
	
	@Override public String compose() {
		return getNotes();
	}




}
