package Chapter5;

public class Mouse {
	private int startI, startJ, endI, endJ;
	private boolean success = false;

	public static void main(String[] args) {
		int maze[][] = { { 2, 2, 2, 2, 2, 2, 2 }, { 0, 0, 0, 0, 0, 0, 2 }, { 2, 0, 2, 0, 2, 0, 2 },
				{ 2, 0, 0, 2, 0, 2, 2 }, { 2, 2, 0, 2, 0, 2, 2 }, { 2, 0, 0, 0, 0, 0, 2 }, { 2, 2, 2, 2, 2, 0, 2 } };
		Mouse mouse = new Mouse();
		mouse.setStart(1, 1);
		mouse.setEnd(5, 5);
		if (!mouse.go(maze)) {
			System.out.println("\n沒有找到出口！");
		} else {
			System.out.println("\n找到出口！");
			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze[0].length; j++) {
					if (maze[i][j] == 2) {
						System.out.print("█");
					} else if (maze[i][j] == 1) {
						System.out.print("◇");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}

	public void setStart(int i, int j) {
		this.startI = i;
		this.startJ = j;
	}

	public void setEnd(int i, int j) {
		this.endI = i;
		this.endJ = j;
	}

	public boolean go(int[][] maze) {
		return visit(maze, startI, startJ);
	}

	private boolean visit(int[][] maze, int i, int j) {
		maze[i][j] = 1;

		if (i == endI && j == endJ) {
			success = true; //當前座標 (i, j) 等於終點座標 (endI, endJ)，則表示找到了通往終點的路徑
		}
		if (!success && maze[i][j + 1] == 0) {
			visit(maze, i, j + 1);
		}

		if (!success && maze[i + 1][j] == 0) {
			visit(maze, i + 1, j);
		}
		if (!success && maze[i - 1][j] == 0)
			visit(maze, i - 1, j);
		if (!success) {
			maze[i][j] = 0;
		}
		return success;
	}
}