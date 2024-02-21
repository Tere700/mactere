package Chapter3;

public class cont {

	public static void main(String[] args) {
//			var level = '\0';
//			if (score>=90) {
//				level = 'A';
//		    }else if (score>=80 && score<90) {
//		    	level = 'B';
//		    }else if (score>=70 && score<80) {
//		    	level = 'C';
//		    }else if (score>=60 && score<70) {
//		    	level = 'D';
//		    }else {
//		    	level = 'E';
//		    }
//			System.out.printf("得分級數：%c%n", level);
			var score = 88; 
			var quotient = score/10;
			var level = '\0';
			switch(quotient) {
			case 10:
			case 9 :
				level ='A';
				
			case 8:
				level = 'B';
				
			case 7:
				level = 'C';
				break;
			case 6:
				level = 'D';
				break;
			default:
				level = 'E';
			}
			System.out.printf("得分等級:%c%n",level);
			
	}		
}

