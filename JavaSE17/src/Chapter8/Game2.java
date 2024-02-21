package Chapter8;

import Chapter7.Action;

public class Game2 {
	public static void play(int action) {
		switch (action) {
		case Action.STOP:
			System.out.println("播放停止動畫");
		case Action.RIGHT:
			System.out.println("播放向右動畫");
		case Action.LEFT:
			System.out.println("播放向左動畫");
		case Action.UP:
			System.out.println("播放向上動畫");
		case Action.DOWN:
			System.out.println("播放向下動畫");
		default:
			assert false : "非定義的常數";
		};
	}
}
