package efc;

import interfaces.MemoryControl;
import MMC.AlgorithmicComposition;

public class AlgorithmicMMC extends MMC implements MemoryControl{
	private int num;
	private AlgorithmicComposition algor;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void InsertNotes() {
		// TODO Auto-generated method stub
		
	}

	public AlgorithmicComposition getAlgor() {
		return algor;
	}

	public void setAlgor(AlgorithmicComposition algor) {
		this.algor = algor;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
