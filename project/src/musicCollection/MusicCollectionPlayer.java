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

import java.io.File;
import java.util.ArrayList;

public class MusicCollectionPlayer implements Playback,Playable {
	private ArrayList<Collection> collection;
	Sequencer sequencer; 
	
	MusicCollectionPlayer(String file) throws InvalidMidiDataException, IOException, MidiUnavailableException{
		this.collection= new ArrayList<Collection>();
		sequencer=MidiSystem.getSequencer();
		this.sequencer=sequencer;
	 }
	@Override
	public void Play(Sequencer sequencer,String file) throws InvalidMidiDataException, IOException, MidiUnavailableException {
	
		
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
	@Override
	public void Play() {
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Randome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Repeat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Normal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Volume() {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Collection> getCollection() {
		return collection;
	}
	public void setCollection(ArrayList<Collection> collection) {
		this.collection = collection;
	}
}

	
	