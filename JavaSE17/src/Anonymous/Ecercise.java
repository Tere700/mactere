package Anonymous;

import java.util.ArrayList;
import java.util.List;
 class Frame implements Playable {

	private String image;

	Frame(String image) {
		this.image = image;
	}

	public void play() {
		System.out.println("播放" + image);
	}
}

class Playlist implements Playable {
	private List playList = new ArrayList();

	public Playlist add(Playable playable) {
		playList.add(playable);
		return this;
	}

	public void play() {
		for (var playable : playList) {
			((Playable) playable).play();
		}
	}
}
	public class Ecercise {
		public static void main(String[] args) {
			Frame logo = new Frame("LOGO畫面");
	        var playlist1 = new Playlist();
	        playlist1.add(new Frame("Duke 左揮手"))
	                 .add(new Frame("Duke 右揮手"));
	        
	        var playlist2 = new Playlist();
	        playlist2.add(new Frame("Duke 走左腳"))
	                 .add(new Frame("Duke 走右腳"));
	        
	        var all = new Playlist();
	        all.add(logo)
	           .add(playlist1)
	           .add(playlist2)
	           .play();			
		
		}
	}
