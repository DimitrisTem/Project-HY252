package musicCollection;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class test {
	public static void main(String[] args) throws InvalidMidiDataException, IOException, MidiUnavailableException{
		MusicCollectionPlayer pla = new MusicCollectionPlayer("C:/Users/Dimitris/Downloads/testHY252.mid");
		
		pla.Play(pla.sequencer,"C:/Users/Dimitris/Downloads/testHY252.mid");
		pla.Stop(pla.sequencer);
		
	}
}
