package Anonymous;

public class ClientEvent {
	
	private Client client;
	public ClientEvent(Client client) {
		this.client = client;
	}
	public String getName() {
		return client.name;
	}
	
	public String getIP() {
		return client.ip;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
