package efc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;








import org.jfugue.Pattern;
import org.jfugue.Player;



import MMC.FreeComposition;

public class FreeMMC extends MMC{
	private String filePath;
	
	public FreeMMC(String compName,String composer) {
		comp=new FreeComposition(compName,composer);
	}

	public FreeMMC(String compName,String composer,String notes) {
		super(notes);
		comp=new FreeComposition(compName,composer,notes);
	}

	public FreeMMC(String compName,String composer,String notes, String instrument) {
		super(notes, instrument);
		comp=new FreeComposition(compName,composer,notes,instrument);
	}

	@Override
	public String toString() {
		String tmp;
		tmp="Composition: "+comp.getCompName()+"\n"+"Composer: "+comp.getComposer()+"\n"+"Mode: Free "+"\n"+"Instrument: "+comp.getInstrument()+"\n\n"+"Music String: "+comp.getNotes();		
		return tmp;
	}

	@Override
	public void InsertNotes(String note) {
		comp.addNotes(note);
	}

	@Override
	public void save() throws IOException{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath+comp.getCompName()+".txt")));		
		out.append("Free").append("\n").append(comp.getCompName()).append("\n").append(comp.getComposer());
		out.append("\n").append(comp.getInstrument()).append("\n");
		out.append(comp.getNotes());
		out.close();
	}

	@Override
	public void saveAs(String filePath) throws IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath+comp.getCompName()+".txt")));		
		out.append("Free").append("\n").append(comp.getCompName()).append("\n").append(comp.getComposer());
		out.append("\n").append(comp.getInstrument()).append("\n");out.append(comp.getNotes());
		out.close();
	}

	@Override
	public void open(String filePath) throws IOException {
		BufferedReader in = new BufferedReader(
                new InputStreamReader(
                new FileInputStream(filePath)));
		in.readLine();
		comp.setCompName(in.readLine());
		comp.setComposer(in.readLine());
		comp.setInstrument(in.readLine());
		comp.setNotes(in.readLine());
		in.close();			
		this.filePath=filePath;
	}

	@Override
	public void export(String filePath){		
		Player player = new Player();
		Pattern pattern = new Pattern(comp.compose());		
	    try {
			player.saveMidi(pattern, new File(filePath+comp.getCompName()+".mid"));
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}
	
	@Override
	public void Play(){
		player = new Player();
		player.play(comp.compose());
	}

}
