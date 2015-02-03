package myutil;

import java.util.Iterator;
import java.util.Random;

public class MyList<E> implements Iterable<E> {

	private Node<E> first;
	private int size;
	private int rnd;
	Random randomNumber = new Random();

	public MyList() {

		first = null;
		size = 0;

	}

	public void add(E data) {

		Node<E> newNode = new Node<E>(data, first);
		first = newNode;

		size++;

	}

	public E getRandomElement() {

		if (isEmpty()) {

			throw new RuntimeException("Listan är tom");

		} else {

			rnd = randomNumber.nextInt(size);
			Node<E> tempNode = new Node<E>(null, null);
			tempNode = first;

			for (int i = 0; i < rnd; i++) {

				tempNode = tempNode.getNext();

			}
			
			return tempNode.getData();

		}

	}
	
	public Iterator<E> iterator(){
		
		MyListIterator<E> iterator = new MyListIterator<E>(this);
		return iterator;
		
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

	public Node<E> getFirst() {
		
		return first;
	}

}
