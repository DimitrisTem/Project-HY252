package MMC;

public class AtonalComposition extends Composition {

	
	public AtonalComposition(String compName, String composer) {
		super(compName, composer);
	}

	public AtonalComposition(String compName, String composer, String instrument) {
		super(compName, composer, instrument);
	}

	public AtonalComposition(String compName, String composer,
			String instrument, String notes) {
		super(compName, composer, instrument, notes);
	}

	String doNothing(){
		return getNotes();
		
	}
	
	String retrograde(){
		String tmp="";
		for(int i=0;i<getNotes().length();i++)
			tmp+=getNotes().charAt(getNotes().length());		
		return tmp;
	}
	
	String transpose(int x){
		String tmp="";
		for(int i=x;i<getNotes().length();i++){
			tmp+=getNotes().charAt(i);
		}
		for(int i=0;i<x;i++){
			tmp+=getNotes().charAt(i);
		}
			
		return tmp;	
	}
	
	String reflection(int x){
		String tmp="";		
		for(int i=0;i<getNotes().length();i++){
			tmp+=transpose(x).charAt(getNotes().length()-i);
		}
		return tmp;
	}
	
	
	@Override
	void compose() {

	}

}
