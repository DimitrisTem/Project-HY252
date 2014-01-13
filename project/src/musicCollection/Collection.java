package musicCollection;

import java.util.ArrayList;

public class Collection {
	private String name;
	private ArrayList<Song> songs;
	
	Collection(String name){
		this.name=name;
		this.songs=new ArrayList<Song>();
	}
	
	void addSong(Song song){
		this.songs.add(song);
	}
	
	void RemoveSong(Song song){
		for(int i=0;i<this.songs.size();i++){
			if(songs.get(i).getCompName().equals(song)) this.songs.remove(i);
		}
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
}
