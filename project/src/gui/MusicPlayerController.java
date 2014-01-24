package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.JFileChooser;

import musicCollection.MusicCollectionPlayer;
 

public class MusicPlayerController {
	

	private MusicPlayerView view;
	private MusicCollectionPlayer mode;
	private JFileChooser fc;
	MusicPlayerController(MusicPlayerView view,MusicCollectionPlayer mode) {
		this.view=view;
		this.mode=mode;
		this.view.addmouseListeners(new mouseListener());
		this.view.addmenuListeners(new actionListener());
	}
	
	
	class mouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getComponent().equals(view.Play)){
				try {
					mode.Play("C:/Users/Dimitris/Downloads/testHY252.mid");
				} catch (InvalidMidiDataException | IOException
						| MidiUnavailableException | InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(e.getComponent().equals(view.Stop)){
				mode.Stop();
			}else if(e.getComponent().equals(view.Pause)){
				try {
					mode.pause();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(e.getComponent().equals(view.Forward)){
				
			}else if(e.getComponent().equals(view.Backward)){
				
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	class actionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("New")){
				
				
			}else if(e.getActionCommand().equals("Add File")){
				
			}else if(e.getActionCommand().equals("Add Folder")){
				
			}else if(e.getActionCommand().equals("Open")){
				
				
				
			}else if(e.getActionCommand().equals("Save")){
				
			}
			
		}
		
	}
	
	
	public static void main(String[] a) throws InvalidMidiDataException, IOException, MidiUnavailableException {
		MusicPlayerView view = new MusicPlayerView();
		MusicCollectionPlayer mode = new MusicCollectionPlayer("Resources/testHY252.mid");
		MusicPlayerController control = new MusicPlayerController(view,mode);
	}
}
