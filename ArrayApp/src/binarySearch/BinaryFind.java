package binarySearch;

public class BinaryFind {
	
	static int nElems = 0;
	static int searchKey = 55;
	static int[] a = new int[100];

	public static int main(String[] args) {
		int lowerBound = 0;
		int upperBound = nElems-1;
		
		int curIn;
		
		while(true) {
			curIn = (lowerBound+upperBound)/2;
			if(a[curIn]==searchKey)           
				return curIn;                 // found it
			else if (lowerBound>upperBound)
				return nElems;                // cant find it
			else {							  // divide range
				if(a[curIn]<searchKey)
					lowerBound = curIn + 1;   //its in upper half
				else
					upperBound = curIn-1;     // its in lower half
					
			}
		} 
	}

}
