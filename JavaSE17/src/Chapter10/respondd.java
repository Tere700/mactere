package Chapter10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class respondd extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 設定回應的 Content Type 為 PDF
        response.setContentType("application/pdf");

        // 獲取 PDF 檔案的輸入流
        InputStream in = getServletContext().getResourceAsStream("/WEB-INF/jdbc.pdf");

        // 獲取回應的輸出流
        OutputStream out = response.getOutputStream();

        // 設定緩衝區大小
        byte[] data = new byte[1024];
        int length;

        // 讀取 PDF 檔案的內容，並寫入回應的輸出流
        while ((length = in.read(data)) != -1) {
            out.write(data, 0, length);
        }

        // 關閉輸入流和輸出流
        in.close();
        out.close();
    }
}
