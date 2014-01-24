package MMC;
import interfaces.Symmetry;

import java.util.*;





public class AtonalComposition extends Composition implements Symmetry {

	private LinkedList<AtonalRow> atonalRows;
	
	public AtonalComposition(String compName, String composer) {
		super(compName, composer);
		this.atonalRows=new LinkedList<AtonalRow>();
	}

	public AtonalComposition(String compName, String composer, String instrument) {
		super(compName, composer, instrument);
		this.atonalRows=new LinkedList<AtonalRow>();
	}

	public AtonalComposition(String compName, String composer,
			String instrument, String notes) {
		super(compName, composer, instrument, notes);
		this.atonalRows=new LinkedList<AtonalRow>();
		this.atonalRows.add(new AtonalRow(notes));
	}
	
	
	public String doNothing(){
		int num=atonalRows.size();
		for(int i=0;i<num;i++){
			this.atonalRows.add(new AtonalRow(atonalRows.get(i).doNothing()));
		}
		return "doNothing ";
		
	}
	
	public String retrograde(){
		
		int num=atonalRows.size();
		for(int i=num-1;0<=i;i--){		
			this.atonalRows.add(new AtonalRow(atonalRows.get(i).retrograde()));
		}
		return "retrograde ";
	}
	
	public String transpose(int x){
		int num=atonalRows.size();
		for(int i=0;i<num;i++){
			this.atonalRows.add(new AtonalRow(atonalRows.get(i).transpose(x)));
		}				
		return "transpose("+Integer.toString(x)+") ";	
	}
	
	public String reflection(int x){
		int num=atonalRows.size();
		for(int i=0;i<num;i++){
			this.atonalRows.add(new AtonalRow(atonalRows.get(i).reflection(x)));
		}
		return "reflection("+Integer.toString(x)+") ";
	}
	

	void setAtonalRow(String notes){
		atonalRows=new LinkedList<AtonalRow>();
		atonalRows.add(new AtonalRow(notes));
	
	}


	LinkedList<AtonalRow> getAtonalRow(){
		return atonalRows;
	}
	
	void AddAtonalRow(String notes){
		AtonalRow tmp=new AtonalRow(notes);
		this.atonalRows.add(tmp);

	}

	
	
	@Override
	public String compose(){
		String tmp=getInstrument();
		for(int i=0;i<atonalRows.size();i++){
			tmp+=atonalRows.get(i).getNotes();
		}
		return tmp;
	}
	
	
	
	public String Compose(String sym,int x) {
		String tmp;
		switch(sym){
		case "retrograde":
			tmp=retrograde();
			break;
		case "transpose":			
			tmp=transpose(x);
			break;
		case "reflection":
			tmp=reflection(x);
			break;
		case "doNothing":
			tmp=doNothing();
			break;
		default:
			tmp="InvalidSymmerty";
		}
		
		return tmp;
	}

	@Override
	public void addNotes(String notes) {
		setAtonalRow(notes);
	}

	@Override
	public String Retrograde() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Transpose(int x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Reflection(int x) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
