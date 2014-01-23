package interfaces;

import java.io.IOException;
import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.FloatControl;

import musicCollection.Song;

public interface Playback {
	void Randome();
	void Repeat(ArrayList<String> songs) throws InvalidMidiDataException, IOException, MidiUnavailableException, InterruptedException;
	void Normal();
	void Volume(FloatControl volCtrl);

}
