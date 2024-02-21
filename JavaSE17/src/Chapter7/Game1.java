package Chapter7;

public class Game1 {

	public static void main(String[] args) {
		play(1);
		play(2);

	}
	public static void play(int action) {
		System.out.println(
				switch(action) {
				case 0 ->"播放停止動畫";
				case 1 ->"播放向右動畫";
				case 2 ->"播放向左動畫";
				case 3 ->"播放向上動畫";
				case 4 ->"播放向下動畫";
				default ->"不支援此動作";
				});
	}

}
