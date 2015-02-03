package defaultpackage; 

import myutil.MyQueue;

public class MyQueueTest {
	
	
	private static void testStrings() {
		MyQueue<String> stringQueue = new MyQueue<String>();

		// inserts a few test values
		stringQueue.enqueue("Anna");
		stringQueue.enqueue("Harry");
		stringQueue.enqueue("Ivar");

		// dequeues a few values and ensures they are correct
		for (int i = 0; i < 3; ++i) {
			String value = stringQueue.dequeue();

			// string comparison is a little special..
			if (i == 0 && value.contentEquals("Anna")) {
				// do nothing
			} else if (i == 1 && value.contentEquals("Harry")) {
				// do nothing
			} else if (i == 2 && value.contentEquals("Ivar")) {
				// do nothing
			} else {
				System.err.println("testStrings: dequeued unexpected " + value
						+ " when dequeuing value #" + i);
				return;
			}
		}

		// test successful
		System.out.println("testStrings: ok");
	}
	
	private static void testNumbers() {
		MyQueue<Integer> numberQueue = new MyQueue<Integer>();

		// inserts a few test values
		for (int i = 0; i < 5; ++i) {
			numberQueue.enqueue(i);
		}

		// dequeues a few values and ensures they are correct
		for (int i = 0; i < 5; ++i) {
			int value = numberQueue.dequeue();
			if (value != i) {
				System.err.println("testNumbers: dequeued " + value
						+ ", expected " + i);
				return;
			}
		}

		// test successful
		System.out.println("testNumbers: ok");
	}
	
	private static void testExceptions() {
		MyQueue<Integer> numberQueue = new MyQueue<Integer>();

		// makes sure there's an exception when the stack is empty
		try {
			int value = numberQueue.dequeue();
			System.err.println("testExceptions: dequeued " + value
					+ ", expected an exception");
			return;
		} catch (RuntimeException e) {
			//do nothing System.out.println("hej");
		}

		// insert and remove one value
		numberQueue.enqueue(7);
		numberQueue.dequeue();
		//numberQueue.enqueue(10);

		// makes sure there's an exception when popping after removing all
		// values
		try {
			int value = numberQueue.dequeue();
			System.err.println("testExceptions: dequeued " + value
					+ ", expected an exception");
			return;
		} catch (RuntimeException e) {
			// do nothing
		}

		// test successful
		System.out.println("testExceptions: ok");
	}
	
	private static void testIsEmpty() {
		MyQueue<Integer> numberQueue = new MyQueue<Integer>();

		if (numberQueue.isEmpty() == true) {
			// do nothing

		} else {
			System.err
					.println("testIsEmpty: got false when the queue was empty");
			return;
		}

		// insert value
		numberQueue.enqueue(7);

		// Test when value is inserted
		if (numberQueue.isEmpty() == false) {
			// do nothing
		} else {
			System.err
					.println("testIsEmpty: got true when the queue wasn't empty");
			return;
		}
		// test successful
		System.out.println("testIsEmpty: ok");
	}
	
	private static void testSize() {

		MyQueue<String> stringQueue = new MyQueue<String>();

		// inserts a few test values
		stringQueue.enqueue("Anna");
		stringQueue.enqueue("Harry");
		stringQueue.enqueue("Ivar");

		// Checks so that the size is 3

		if (stringQueue.size() != 3) {
			
			System.err.println("testSize expected the size 3 but got the size "
					+ stringQueue.size());
			
			return;
		}

		// test successful
		System.out.println("testSize: ok");
	}
	
	
	
	

	public static void main(String[] args) {
		System.out
		.println("Performs a number of tests.  Errors are printed in red if you're using Eclipse.");
		
		testStrings(); 
		testNumbers();
		testExceptions();
		testIsEmpty();
		testSize();
  

	}

}
