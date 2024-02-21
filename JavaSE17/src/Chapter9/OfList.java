package Chapter9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfList {

	public static void main(String[] args) {
		//of方法都是建立不可變物件;
		var nameLS = List.of("Justin","Mobica");
		var nameST = Set.of("Amy", "Teresa");
		var nameMP = Map.of("Dorris", 96, "Merry", 100); //Map採(key,value, key, value)方式;
		//nameLS.add("Irene");
		//nameST.add("Irene");
		//nameMP.put("Irene",100);
		System.out.println(nameLS);
		System.out.println(nameST);
		System.out.println(nameMP);
	}

}