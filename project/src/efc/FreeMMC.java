package efc;

import interfaces.MemoryControl;
import MMC.FreeComposition;



public class FreeMMC extends MMC implements MemoryControl{
	private FreeComposition free;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public FreeComposition getFree() {
		return free;
	}

	public void setFree(FreeComposition free) {
		this.free = free;
	}

	@Override
	void InsertNotes() {
		// TODO Auto-generated method stub
		
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
	
}
