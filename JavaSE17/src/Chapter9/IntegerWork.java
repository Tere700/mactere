package Chapter9;

public class IntegerWork {

	public static void main(String[] args) {
//		var doubleFunction = new IntegerFunction() {
//			
//			@Override
//			public Integer apply(Integer i) {
//				return i * 2;
//			}
//		};
//		IntegerFunction doublefunction = (Integer i) -> i * 2;
//		IntegerFunction doublefunction = (i) -> i *2; 省略參數型態
//		IntegerFunction doublefunction = i -> i *2; 省略括號

		IntegerFunction doublefunction = i -> {
			return i * 2;
		}; // 一定要return值

//		Comparator<String> byLength = new Comparator<String>() {
//		var byLength = new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.length()-s2.length();
//			}
//		};

		Comparator<String> byLength = (s1, s2) -> s1.length() - s2.length();

	}

}
