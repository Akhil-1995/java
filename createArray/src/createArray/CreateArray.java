package createArray;

public class CreateArray {
	
	static int[] intArray;
	int[] intArray1 = new int[100];
	int intArray2[] = new int[100];
	
	static int temp;
	
	public static void main(String[] args) {
	
		// Creating an Array		
		intArray = new int[100];		
		int arrayLength = intArray.length;
		System.out.println(intArray.toString());
		
		// Accessing Array Elements		
		intArray[7] = 66;
		temp = intArray[7];
		System.out.println(temp);

	}

}
