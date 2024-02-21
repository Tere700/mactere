package Chapter9;

import java.util.TreeSet;



class MyComparator implements java.util.Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }

}

public class TreeSetComparator {

    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>(new MyComparator());
//      TreeSet<String> treeSet1 = new TreeSet<>((o1,o2)-> -o1.compareTo(o2)); Lambda表示法
        treeSet1.add("Tere");
        treeSet1.add("Mini");
        treeSet1.add("Wesrt");
        System.out.println(treeSet1);
    }
}
