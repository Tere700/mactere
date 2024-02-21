package Chapter10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serveSockett {
	public static void main(String[] args) {
		// 設定伺服器監聽的埠口
		int port = 8080;
		ServerSocket server = null;
		Socket client = null;

		try {
			// 創建 ServerSocket 實例，監聽指定的埠口
			server = new ServerSocket(port);

			// 使用無窮迴圈等待客戶端連接
			while (true) {
				// 等待客戶端連接，當有客戶端連接時，accept 方法會返回一個新的 Socket 實例
				client = server.accept();

				// 獲取客戶端的輸入流和輸出流
				var input = client.getInputStream();
				var output = client.getOutputStream();

				// 在這裡可以進行你需要的處理，例如讀取客戶端傳來的數據、向客戶端發送數據等

				// 最後，關閉連接
				client.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
