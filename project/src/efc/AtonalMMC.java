package efc;

import MMC.AtonalComposition;
import interfaces.MemoryControl;

public class AtonalMMC extends MMC implements MemoryControl{
	private AtonalComposition Atonal;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void InsertNotes() {
		// TODO Auto-generated method stub
		
	}
	void AtonalMode(String mode){
		
	}
	@Override
	public void save(String filePath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAs(String filePath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open(String filePath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void export(String filePath) {
		// TODO Auto-generated method stub
		
	}

	public AtonalComposition getAtonal() {
		return Atonal;
	}

	public void setAtonal(AtonalComposition atonal) {
		Atonal = atonal;
	}

}
