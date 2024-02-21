package Anonymous;

public class MultiChat {

	public static void main(String[] args) {
		var c1 = new Client ("127.0.0.1", "Caterpillar");
		var c2 = new Client ("192.168.0.2", "Justin");
		var queue = new ClientQueue();
		
		queue.addClientListener(new ClientListener() {
			
			@Override
			public void clientRemoved(ClientEvent event) {
				System.out.printf("%s 從 %s 離線%n",
						event.getName(), event.getIP());	
			}
			
			@Override
			public void clientAdded(ClientEvent event) {
				System.out.printf("%s 從 %s 連線%n",
						event.getName(), event.getIP());
			}
		});//建立事件監聽器
		System.out.println(queue.clients.size());
		queue.add(c1);
		System.out.println(queue.clients.size());
		queue.add(c2);
		System.out.println(queue.clients.size());
		queue.remove(c1);
		System.out.println(queue.clients.size());
		queue.remove(c2);
		System.out.println(queue.clients.size());

	}

}
