package CollectionMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("請輸入英文：");
		var words= tokenSet(console.nextLine());
		System.out.printf("不重複的單字有%d個：%s%n",words.size(),words);
	}

	static Set tokenSet(String line) {
		var tokens = line.split(" ");
		return new HashSet(Arrays.asList(tokens));
	}
}
