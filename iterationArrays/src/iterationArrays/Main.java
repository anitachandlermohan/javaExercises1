package iterationArrays;

public class Main {

	public static void main(String[] args) {
		int[] arrayOfInts = new int [10];
		for (int i = 0; i < arrayOfInts.length; i++) {
			arrayOfInts[i] = i+1 ;
			System.out.println(i);
		}
		for(int j = 0; j < arrayOfInts.length; j++){
		 arrayOfInts[j] = arrayOfInts[j] * 10;
		 System.out.println(arrayOfInts[j]);
		}

	}

}
