package Chapter5;

public class MathTool {

	public static int sum (int... numbers) {
		var sum =0;
		for(var number: numbers) {
			sum+=number;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(MathTool.sum(1,2));
		System.out.println(MathTool.sum(1,2,3));
		System.out.println(MathTool.sum(1,2,3,4));
	}

}
