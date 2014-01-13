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
	void compose() {
		//play to Music String se notes
	}

}
