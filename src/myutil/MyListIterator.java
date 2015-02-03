package myutil;

import java.util.Iterator;

public class MyListIterator<E> implements Iterator<E> {

	private Node<E> currentNode;

	public MyListIterator(Node<E> node) {

		currentNode = node; // Node<E>(node.getData(),node.getNext());

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

			currentNode = currentNode.getNext();

			return tmpdata;

		} else {

			return tmpdata;

		}
	}

	public void remove() {
		



	}

}
