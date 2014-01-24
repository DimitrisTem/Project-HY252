package MMC;
public class AlgorithmicComposition extends Composition {
	
	private int num;
	private int size=1000;
	public AlgorithmicComposition(String compName, String composer,int num) {
		super(compName, composer);
		this.num=num;
	}

	public AlgorithmicComposition(String compName, String composer,String instrument,int num) {
		super(compName, composer, instrument);
		this.num=num;;
	}

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	void randomMusic(){
		for(int i=0;i<size;++i){
			if(i==0)
				setNotes(getInstrument()+"["+(System.nanoTime()/(i+num))%128+"] ");			
			else
				setNotes(getNotes()+"["+(System.nanoTime()/(i+num))%128+"] ");
		}
		
	}
	
	
	
	@Override
	public String compose() {
		randomMusic();
		return getNotes();
	}

	@Override
	public void addNotes(String note) {
		setNum(Integer.parseInt(note));
	}

}
