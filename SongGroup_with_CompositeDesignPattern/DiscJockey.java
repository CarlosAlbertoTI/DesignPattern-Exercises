package SongGroup_with_CompositeDesignPattern;

public class DiscJockey {

	SongComponent songList;
	
	public DiscJockey(SongComponent newSongList) {
		// TODO Auto-generated constructor stub
		songList = newSongList;
	}
	
	public void getSongList() {
		songList.displaySongInfo();
	}
}
