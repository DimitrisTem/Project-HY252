package interfaces;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public interface Playable {
	
	void Play(Sequencer sequencer,String file) throws InvalidMidiDataException, IOException, MidiUnavailableException;
	void Play() throws InvalidMidiDataException, IOException, MidiUnavailableException;
	void Stop(Sequencer sequencer) throws InvalidMidiDataException, IOException, MidiUnavailableException;
}
