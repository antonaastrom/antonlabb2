package defaultpackage;

import java.util.Iterator;

import myutil.MyList;

public class MyListTest {

	private static void testRandomElement() {

		MyList<Integer> numberList = new MyList<Integer>();

		for (int i = 0; i < 5; i++) {
			numberList.add(i);

		}

		int tmpInt = numberList.getRandomElement();

		//System.out.println("Ett random nummer från 0 till 4 från listan: "
				//+ tmpInt);

		if (0 <= tmpInt && 4 >= tmpInt) {

			System.out.println("testRandomElement: ok");
		}
	}

private static void testMyListIterator() {
	
	int counter = 0;
	MyList<Integer> numberList = new MyList<Integer>();

	for (int i = 0; i < 5; i++) {
		numberList.add(i);

	}
	Iterator<Integer> it = numberList.iterator();
	
//	for (Integer numbers: numberList){
//		
//		System.out.println(numbers);
//		
//	}
	
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
	while(it.hasNext()){
		int tmp = it.next();
		if(tmp==3){
			it.remove();
		}
	}
	
	for (Integer numbers: numberList){
		
		System.out.println(numbers);
		
	}
	
	
//	for(Iterator<Integer> it = numberList.iterator(); it.hasNext(); counter=it.next()) {
//		
//		System.out.println(counter);
//		
//	}
	
}

	public static void main(String[] args) {
		System.out
		.println("Performs a number of tests.  Errors are printed in red if you're using Eclipse.");
		

		testRandomElement();
		testMyListIterator();

	}

}
