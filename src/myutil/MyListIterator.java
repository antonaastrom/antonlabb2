package myutil;

import java.util.Iterator;

public class MyListIterator<E> implements Iterator<E> {

	private Node<E> currentNode;
	
	private Node<E> prevNode;
	
	private int size;

	public MyListIterator(MyList<E> list) {

		currentNode = list.getFirst();
		prevNode = null;
		size = list.size();
		// Node<E>(node.getData(),node.getNext());

	}

	public boolean hasNext() {

		if (currentNode != null) {

			return true;

		} else {

			return false;
		}

	}

	public E next() {

		E tmpdata = currentNode.getData();

		if (hasNext()) {

			prevNode = currentNode;
			currentNode = currentNode.getNext();
			

			return tmpdata;

		} else {

			return tmpdata;

		}
	}

	public void remove() {
		



	}

}
