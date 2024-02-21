package Anonymous;

import Chapter7.Action;

public class Gamee {

	public static void main(String[] args) {
		play(Acction.RIGHT);
		play(Acction.DOWN);
	}
	public static void play(Acction acction) {
		System.out.println(
				switch(acction) {
				case STOP ->"播放停止動畫";
				case RIGHT ->"播放向右動畫";
				case LEFT ->"播放向左動畫";
				case UP ->"播放向上動畫";
				case DOWN ->"播放向下動畫";
				});
	}

}
