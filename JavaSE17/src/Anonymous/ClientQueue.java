package Anonymous;

import java.util.ArrayList;

public class ClientQueue {
	public ArrayList clients = new ArrayList();
	public ArrayList listeners = new ArrayList();

	public void addClientListener(ClientListener listener) {
		listeners.add(listener);
	}

	public void add(Client client) {
		clients.add(client);//這邊把client加入clients <這代表一個事件發生了
		var event = new ClientEvent(client);// <剛剛發生的事件 （上面的用戶連線）
		for(var i = 0; i < listeners.size(); i++) {
			ClientListener listener =  (ClientListener) listeners.get(i);//List.get 會得到Object 要把他強制轉成ClientListener 才能用clientAdded
			listener.clientAdded(event);//< Add剛剛的事件 （負責聽）
		}
	}

	public void remove(Client client) {
		clients.remove(client);
		var event = new ClientEvent(client);
		for(var i = 0; i < listeners.size(); i++) {
			var listener = (ClientListener) listeners.get(i);
			listener.clientRemoved(event);
		}
	}
	
}
