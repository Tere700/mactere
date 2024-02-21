package CollectionMap;

import java.util.LinkedList;
import java.util.Queue;

interface Request {
	void execute();
}

public class RequestQueue {

	public static void main(String[] args) {
		var requests = new LinkedList();
		offerRequestTo(requests);
		process(requests);
	}

	static void offerRequestTo(Queue requests) {
		for (int i = 0; i < 6; i++) {
			var request = new Request() {
				public void execute() {
					System.out.printf("資料處理 %f%n", Math.random());
				}
			};
			requests.offer(request);
		}
	}

	static void process(Queue requests) {
		while (requests.peek() != null) {
			var request = (Request)requests.poll();
			request.execute();
		}
	}
}
