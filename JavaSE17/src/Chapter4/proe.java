package Chapter4;

public class proe {

	public static void main(String[] args) {
		int[] pocker = new int[52];
		for(int i =0 ; i<pocker.length; i++) {
			int temp = (int)(Math.random()*52);
			boolean isRepeat = false;
			for(int j = 0 ; j<i; j++) {
				if(pocker[j]==temp) {
					isRepeat = true;
					break;
				}
			}if(!isRepeat) {
				pocker[i]= temp;
				System.out.println(pocker[i]+ " ");
			}else {
				i--;
			}
		}

	}

}
