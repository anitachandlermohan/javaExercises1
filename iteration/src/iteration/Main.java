package iteration;

public class Main {
	
	public static void main(String arg[]) {
	helloWorld();
	for(int number1 =0; number1 < 10; number1++) {
		add(number1,10,false);
		}

	}
	public static void helloWorld() {
		System.out.println("Hello World!");
	}
	public static int add(int number1,int number2,boolean isAnitaHungry){		
	
	if( number1 == 0 ) {
		
		return number2;

		}
		else if (number2 == 0) {
		
			return number1;
		}
	
	else {
		
		if(isAnitaHungry == true) {
			int number3 = number1 + number2;
			return number3;
			}
		else {
				int number3 = number1 * number2;
				return number3;
			} 
		}
	

	
	}

}
