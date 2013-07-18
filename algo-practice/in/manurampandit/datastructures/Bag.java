/**
 * 
 */
package in.manurampandit.datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author manurampandit
 * 
 */
public class Bag<Item> implements Iterable<Item> {
	private int N; // no of element
	private Node first;

	/*
	 * Node class
	 */
	private class Node {
		private Item element;
		private Node next;
	}

	/*
	 * Default constructor
	 */
	public Bag() {
		N = 0;
		first = null;
	}

	/*
	 * TO add an item
	 */
	void add(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.element = item;
		first.next = oldFirst;
		N++;
	}

	/**
	 * 
	 * @return whether current data structure is empty
	 */
	boolean isEmpty() {
		return first == null;
	}

	/**
	 * 
	 * @return number of items in current data structure
	 */
	int size() {
		return N;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}

	private class ListIterator implements Iterator<Item> {
		private Node currentNode = first;

		@Override
		public boolean hasNext() {
			return currentNode != null;
		}

		@Override
		public Item next() {
			if (hasNext()) {
				Item item = currentNode.element;
				currentNode = currentNode.next;
				return item;
			} else {
				throw new NoSuchElementException();
			}
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

}
