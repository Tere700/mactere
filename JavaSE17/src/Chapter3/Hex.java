package Chapter3;

public class Hex {

	public static void main(String[] args) {
		String hexString = "1A";
		int decimalNumber = Integer.parseInt(hexString,16);
		System.out.println("十六進位：" + hexString + "轉化成整數" + decimalNumber);
		String octal = "014";
		int octalNumber = Integer.parseInt(octal,8);
		System.out.println("八進位：" + octal + "轉化成整數" + octalNumber);
	}

}
