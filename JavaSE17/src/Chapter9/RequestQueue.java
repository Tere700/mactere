package Chapter9;

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
		for (var i = 1; i < 6; i++) {
			Request request = () -> System.out.printf("處理資料 %f%n", Math.random()); //Lsmbda表示式
//			var request1 = new Request() {
//				@Override
//				public void execute() {
//					System.out.printf("處理資料 %f%n", Math.random());
//				}
//			};
			
			requests.offer(request);
			
		}
	}
	static void process (Queue requests) {
		
			Request request1 = (Request) requests.poll();
			Request request2 = (Request) requests.poll();
			Request request3 = (Request) requests.poll();
			Request request4 = (Request) requests.poll();
			Request request5= (Request) requests.poll();
			Request request6 = (Request) requests.poll();//拿不到東西了 ＝＝null
			request1.execute();
			request1.execute();
			request1.execute();
			request1.execute();
			request1.execute();
			request1.execute();
		
	}
}
