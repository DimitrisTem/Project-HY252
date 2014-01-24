package efc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.jfugue.Pattern;
import org.jfugue.Player;

import MMC.AtonalComposition;


public class AtonalMMC extends MMC{
	String notes="";
	String mode="";
	String filePath;
	int notesNum=0;
	ArrayList<String> Symetr=new ArrayList<String>();
	ArrayList<Integer> SymetrVal=new ArrayList<Integer>();
	
	
	public AtonalMMC(String compName,String composer){
		comp=new AtonalComposition(compName,composer);
		Symetr=new ArrayList<String>();
		SymetrVal=new ArrayList<Integer>();
	}
	public AtonalMMC(String compName,String composer,String instrument){
		comp=new AtonalComposition(compName,composer,instrument);
	}
	public AtonalMMC(String compName,String composer,String instrument,String notes){
		comp=new AtonalComposition(compName,composer,instrument,notes);
	}

	@Override
	public void InsertNotes(String note){		
			comp.addNotes(note);	
		
	}
	public void InsertAtonalMode(String mode,int modeValue){
		Symetr.add(mode);
		SymetrVal.add(modeValue);				
	}
	public void atonalMode(){		
		int i=0;
		while(i<Symetr.size()){
			System.out.println(Symetr.get(i));
			comp.Compose(Symetr.get(i),SymetrVal.get(i+1));
			i+=2;
		}
		Symetr.clear();
		SymetrVal.clear();
	}	
	@Override
	public void save() throws IOException {
		
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath+comp.getCompName()+".txt")));
		
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
	public void export(String fileName){		
		Player player = new Player();
		Pattern pattern = new Pattern(comp.compose());		
	    try {
			player.saveMidi(pattern, new File(fileName+".mid"));
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}

	@Override
	public void Play(){
		atonalMode();
		Player player = new Player();
		player.play(comp.compose());
		
	}
	
	public String toString() {
		return "Composition: "+comp.getCompName()+"\n"+"Composer: "+comp.getComposer()+"\n"+"Mode: Atonal "+"\n"+"Instrument: "+comp.getInstrument()+"\n\n"+"Symmetry Actions:  ";		
		
	}
	

}
