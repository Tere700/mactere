package Chapter9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LIstString {

	public static void main(String[] args) {
		//List<String> words = new LinkedList<String>();
		//var words = new LinkedList<String>(); //如果沒有給型態String會自動推論為Object;
		List<String> words = new LinkedList<>(); //String
		words.add("one");
		String word = words.get(0);
		
		List words1 = new LinkedList();
		words.add("three");
		//Integer number =(String)words.get(0); //沒有給型態會自動歸論為Object,
		
		//Integer number = words.get(0); //類別錯誤是String, 不是Integer;
		//Integer number = (String)words.get(0); //類別不相符合;
		var names = Arrays.asList(1, 2, 3);
		var name = names.get(0);
		System.out.println(name);
		
		LinkedList linkedlist = new LinkedList();
		linkedlist.add("two");
		String s = (String) linkedlist.get(0);
		
		
	}

}
