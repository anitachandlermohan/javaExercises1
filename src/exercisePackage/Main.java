package exercisePackage;

public class Main {
	
		public static void main(String arg[]) {
		helloWorld();
		System.out.println(add(0,8,false));

		}
		public static void helloWorld() {
			System.out.println("Hello World!");
		}
		public static int add(int number1,int number2, boolean isAnitaHungry){
			if (number1 == 0) {
				return number2;
			}
			else if(number2 == 0) {
				return number1;
			}
			
			if (isAnitaHungry == true) {
			
				int number3 = number1 + number2;
				return number3;
				
			}
			else {
				int number3 = number1 * number2;
				return number3;
			
			}
			
		}
		

}
