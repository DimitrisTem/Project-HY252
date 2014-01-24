package MMC;
import interfaces.Symmetry;

public class AtonalRow implements Symmetry{
	
	String notes;
	AtonalRow(String notes){
		this.notes=notes;
	}
	
	public String doNothing(){
		return notes;
		
	}
	
	public String retrograde(){
		String A[]=new String[12];
		String tmp="";
		A=notes.split(" ");
		for(int i=0;i<12;i++){
			tmp+=A[11-i]+" ";
		}
		return tmp;
	}
	
	public String transpose(int x){
		String A[]=new String[12];
		String tmp="";
		A=notes.split(" ");
		for(int i=x;i<12;i++){
			tmp+=A[i]+" ";
		}
		for(int i=0;i<x;i++){
			tmp+=A[i]+" ";
		}
			
		return tmp;	
	}
	
	public String reflection(int x){
		String A[]=new String[12];
		A=notes.split(" ");
		String tmp;
		x+=12;
		for(int i=1;i<6;i++){
				tmp=A[(x-i)%12];
				A[(x-i)%12]=A[(x+i)%12];
				A[(x+i)%12]=tmp;
		}
		tmp="";
		for(int i=0;i<12;i++){	
			tmp+=A[i]+" ";
		}
		return tmp;
	}
	
	
	String getNotes(){
		return notes;
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
