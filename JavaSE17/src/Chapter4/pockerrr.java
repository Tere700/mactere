package Chapter4;

public class pockerrr {

	public static void main(String[] args) {
		int[] pocker = new int[52];
		boolean isRepeat;
		int temp;
		for (int i = 0; i < pocker.length; i++) {
			do {
				temp = (int) (Math.random() * 52);
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (pocker[j] == temp) {
						isRepeat = true;
						break;
					}
				}
			} while (isRepeat);
			pocker[i] = temp;
			System.out.println(pocker[i]);

		}
	}
}
