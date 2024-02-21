package Chapter8;

import java.io.FileNotFoundException;

public class MainClass {

	public static void main(String[] args) {
		String fileName = "/Users/teresa/eclipse-workspace/JavaSE17/src/Chapter8/name";  // 替換成你想要讀取的檔案名稱

        try {
            String fileContent = FileUtil2.readFile(fileName);
            System.out.println("File Content:\n" + fileContent);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
            e.printStackTrace();
        }

	}

}
