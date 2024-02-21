package Chapter9;

import java.util.LinkedList;
import java.util.Queue;

interface Request2 {
	void execute();
}

public class RequestQueue2 {
	public static void main(String[] args) {
		var requests = new LinkedList<Request2>();
		offerRequestTo(requests);
		process(requests);
	}

	static void offerRequestTo(Queue<Request2> requests) {
		for (var i = 1; i < 6; i++) {
//			Request2 request = () -> {
//				System.out.printf("處理資料 %f%n", Math.random());
//			};
			requests.offer(() -> System.out.printf("處理資料 %f%n", Math.random()));

		}
	}

	static void process(Queue<Request2> requests) {
		while (requests.peek() != null) {
			var request = requests.poll();
			request.execute();
		}
	}
}
