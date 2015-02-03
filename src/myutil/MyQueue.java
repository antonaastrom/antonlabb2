package myutil;

public class MyQueue<E> {

	private Node<E> first;
	private Node<E> last;
	private int size;

	public MyQueue() {

		first = null;
		size = 0;
		last = null;

	}

	public void enqueue(E data) {

		Node<E> newNode = new Node<E>(data, null);

		if (last == null) {

			last = newNode;

		} else {

			last.setNext(newNode);
			last=newNode;

		}

		if (first == null) {
			first = newNode;
		}

		size++;

	}

	// private Node<E> getPrevLast() {
	//
	// Node<E> tempNode = new Node<E>(null, null);
	// tempNode = first;
	//
	// for (int i = 0; i < size - 2; i++) {
	//
	// tempNode = tempNode.getNext();
	//
	// }
	// return tempNode;
	//
	// }

	public E dequeue() {

		if (isEmpty()) {

			throw new RuntimeException("Det finns inget att avköa!");

		} else {

			E temporary_data = first.getData();

			if (size() == 1) {

				first = null;
				last = null;

			} else {

				first = first.getNext();

				size--;

			}

			return temporary_data;
		}

	}

	public boolean isEmpty() {

		if (first != null) {

			return false;

		} else {

			return true;

		}

	}

	public int size() {

		return size;

	}

}
