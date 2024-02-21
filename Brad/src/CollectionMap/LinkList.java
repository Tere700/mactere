package CollectionMap;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
        // 創建 LinkedList
        LinkedList linkedList = new LinkedList<>();

        // 插入元素到列表的末尾
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("原始 LinkedList: " + linkedList);

        // 在指定位置插入元素
        linkedList.remove(1);

        System.out.println("插入後的 LinkedList: " + linkedList);
    }
}
