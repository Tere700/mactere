package Chapter3;

public class RotationExample {

	public static void main(String[] args) {
		int count = 0 ;
		for (int i=0; i<500; i++);
		System.out.println("Current Angle :" + count);
		count = (count + 1) % 360;
		try {
			Thread.sleep(50);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
