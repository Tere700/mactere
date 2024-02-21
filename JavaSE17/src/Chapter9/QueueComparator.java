package Chapter9;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparatorr implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
	
}

public class QueueComparator {

	public static void main(String[] args) {
		 PriorityQueue<String> PQ = new PriorityQueue<String>();
		 PQ.add("MMM");
		 PQ.add("TTT");
		 PQ.add("NNN");
		 PQ.add("FFF");
		 PQ.add("AAA");
		 System.out.println(PQ);
		 System.out.println("--------");
		 
		 PriorityQueue<String> PQ1 = new PriorityQueue<String>(new MyComparatorr());
		 PQ1.add("MMM");
		 PQ1.add("TTT");
		 PQ1.add("NNN");
		 PQ1.add("FFF");
		 PQ1.add("AAA");
		 System.out.println(PQ1);
		 System.out.println("--------");
		 
		 PriorityQueue<String> PQ2 = new PriorityQueue<String>((o1, o2) -> -o1.compareTo(o2));
		 PQ2.add("HHH");
		 PQ2.add("OOO");
		 PQ2.add("CCC");
		 PQ2.add("RRR");
		 PQ2.add("UUU");
		 while(!PQ2.isEmpty()) {
		 System.out.println(PQ2.poll());
		 }
	}

}