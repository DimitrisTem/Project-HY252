package musicCollection;


import interfaces.Playable;
import interfaces.Playback;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.Port;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MusicCollectionPlayer implements Playback,Playable {
	private ArrayList<Collection> collection;
	Sequencer sequencer; 
	
	MusicCollectionPlayer(String file) throws InvalidMidiDataException, IOException, MidiUnavailableException{
		this.collection= new ArrayList<Collection>();
		sequencer=MidiSystem.getSequencer();
		this.sequencer=sequencer;
	 }
	@Override
	public void Play(Sequencer sequencer,String file) throws InvalidMidiDataException, IOException, MidiUnavailableException, InterruptedException {
	
		
	    // Create a sequencer for the sequence
	    sequencer = MidiSystem.getSequencer();
	    sequencer.open();
	    Sequence sequence = MidiSystem.getSequence(new File(file));
	    sequencer.setSequence(sequence);

	    // Start playing
	    sequencer.start();
	    while(true) {
            if(sequencer.isRunning()) {
            	sequencer.start();
            	Thread.sleep(1000);
            }
            else{ 
            	
            	sequencer.stop();
            	sequencer.close();
	            break;
            }
            
       }
	
	}
	
	@Override
	public void Stop(Sequencer sequencer) {
			sequencer.stop();
			sequencer.close();
	}
	
	public void Repeat(ArrayList<String> songs) throws InvalidMidiDataException, IOException, MidiUnavailableException, InterruptedException {
		while(true){
			int i=0;
			if(i==songs.size()-1) i=0;
			else Play( sequencer, songs.get(i));
		}
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void Normal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Volume(FloatControl volCtrl) {
		Port lineIn;
		try {
		  Mixer mixer = AudioSystem.getMixer(null);
		  lineIn = (Port)mixer.getLine(Port.Info.LINE_IN);
		  lineIn.open();
		  volCtrl = (FloatControl) lineIn.getControl(

		      FloatControl.Type.VOLUME);

		  // Assuming getControl call succeeds, 
		  // we now have our LINE_IN VOLUME control.
		} catch (Exception e) {
		  System.out.println("Failed trying to find LINE_IN"
		    + " VOLUME control: exception = " + e);
		}
		
	}

	public ArrayList<Collection> getCollection() {
		return collection;
	}
	public void setCollection(ArrayList<Collection> collection) {
		this.collection = collection;
	}
	@Override
	public void Randome() {
		// TODO Auto-generated method stub
		
	}

		
	
}

	
	