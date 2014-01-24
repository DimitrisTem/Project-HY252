package interfaces;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public interface Playable {
	
	void Play(String file) throws InvalidMidiDataException, IOException, MidiUnavailableException, InterruptedException;
	void Stop() throws InvalidMidiDataException, IOException, MidiUnavailableException;
}
