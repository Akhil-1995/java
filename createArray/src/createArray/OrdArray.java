package createArray;

public class OrdArray {
	
	public static void main(String[] args) {
	
	int j=0;
	for(j=0;j<10;j++) {
		if(j==2) {
			System.out.println("in= "+ j);
			break;
			
		}
		System.out.println("callout= "+j);
	}
	System.out.println("out= "+j);
	}
}
