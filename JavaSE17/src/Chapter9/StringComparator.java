package Chapter9;

public class StringComparator implements Comparator{
	
	public static <T> T elemOf(T[]objs, int index) {
		return objs[index];
	}
	
//	public static Object elemOf(Object[]objs, int index) {
//		return objs[index];
//	}

	@Override
	public int compare(Object o1, Object o2) {
//		String s1 = (String) o1;
//		String s2 = (String) o2;
//		return -s1.compareTo(s2);
		if(o1 instanceof String && o2 instanceof String) {
			return -((String)o1).compareTo((String)o2);
		}else {
			throw new IllegalArgumentException("Objects are not of type String");
		}
	}
	
//	public class StringComparator implements Comparator<String>{
//
//
//		@Override
//		public int compare(String s1, String s2) {
//			return -s1.compareTo(s2);
//		}

	public static void main(String[] args) {
		String[] args1 = {"apple", "banana", "cat", "dog","elephant", "fish"};
		for(int i = 0; i < args1.length; i++) {
		var arg = (String)elemOf(args1, i); 
		//如果方法是帶入泛型的話就不用強制轉型編譯器會自己推斷出泛型的型態
		System.out.println(arg);
		}
		
//		Object[] args1 = {"apple", "banana", "cat", "dog","elephant", "fish"};
//		for(int i = 0; i < args1.length; i++) {
//		var arg = (String) elemOf(args1, i); //因為原本是Object[]類別要強制轉型為String
//		System.out.println(arg);
//		}
		
//		String a,b ;
//		a = "apple";
//		b = "banana";
//		int result = a.compareTo(b);
//		System.out.println(result);
	}

}

