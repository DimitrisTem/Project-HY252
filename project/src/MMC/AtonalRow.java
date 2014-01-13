package MMC;

public class AtonalRow {
	
	String notes;
	AtonalRow(String notes){
		this.notes=notes;
	}
	
	String doNothing(){
		return notes;
		
	}
	
	String retrograde(){
		String tmp=null;
		for(int i=0;i<notes.length();i++)
			tmp+=notes.charAt(notes.length());		
		return tmp;
	}
	
	String transpose(int x){
		String tmp=null;
		for(int i=x;i<notes.length();i++){
			tmp+=notes.charAt(i);
		}
		for(int i=0;i<x;i++){
			tmp+=notes.charAt(i);
		}
			
		return tmp;	
	}
	
	String reflection(int x){
		String tmp=null;		
		for(int i=0;i<notes.length();i++){
			tmp+=transpose(x).charAt(notes.length()-i);
		}
		return tmp;
	}
	
	

}
