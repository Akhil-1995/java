package highArray;

public class HighArray {
	
	private long[] a;
	private int nElems;
	
	public HighArray(int max) {
		a = new long[100];
		nElems = 0;
		
	}
	
	//----------------------------------------------
	
	public boolean find(long searchKey) {      // find
		int j;
		for(j=0; j<nElems; j++)
			if(a[j]==searchKey)
				break;
		if(j==nElems)
			return false;
		else 
			return true;
	}
	
	//-----------------------------------------------
	
	public void insert(long value) {          // insert
		a[nElems] = value;
		nElems++;
	}
	
	//------------------------------------------------
	
	public boolean delete(long value) {		 // delete
		int j;
		for(j=0; j<nElems; j++)
			if(a[j]==value)
				break;
		if(j==nElems)
			return false;
		else
			for(int k=j; k<nElems-1; k++)
				a[k]=a[k+1];
			nElems--;
			return true;		
	}
	
	//-----------------------------------------------
	
	public void display() {					// display
		for(int j=0; j<nElems; j++)
			System.out.println(a[j]);
		System.out.println("");
	}

}
