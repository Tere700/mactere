package Chapter8;

public class Assert {

	    public static void main(String[] args) {
	        int input = -5;

	        // 使用斷言確保參數為非負數
	        assert isNonNegative(input) : "Input should be non-negative";

	        // 斷言通過，執行相應的操作
	        processInput(input);
	    }

	    // 方法要求參數為非負數
	    private static boolean isNonNegative(int value) {
	        return value >= 0;
	    }

	    // 處理參數的方法
	    private static void processInput(int input) {
	        // 執行相應的操作
	        System.out.println("Processing input: " + input);
	    }
	}

