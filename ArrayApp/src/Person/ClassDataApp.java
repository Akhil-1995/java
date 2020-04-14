package Person;

public class ClassDataApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxSize = 100;
		ClassDataArray arr;
		arr = new ClassDataArray(maxSize);
		
		arr.insert("Evans", "Patty", 24);
		arr.insert("Smith", "Lorraine", 37);
		arr.insert("Yee", "Tom", 43);
		
		arr.displayA();
		
		String searchKey = "Smith";
		Person found;
		found = arr.find(searchKey);
		if(found != null) {
			System.out.println("Found ");
			found.displayPerson();
		}
		
		else
			System.out.println("Can't find "+ searchKey);
		
		System.out.println("Deleting Yee");
		
		arr.delete("Yee");
		
		arr.displayA();

	}

}
