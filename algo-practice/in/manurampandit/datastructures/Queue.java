/**
 * 
 */
package in.manurampandit.datastructures;

import java.util.Iterator;

/**
 * @author manurampandit 
 */
public class Queue<T> implements Iterable<T> {
	private Node first, last;
	private int size;

	/*
	 * Inner class containing Node
	 * 
	 * @param <T>
	 */
	private class Node {
		T item;
		Node next;

		public Node(T item) {
			this.item = item;
			this.next = null;
		}
	}

	/**
	 * If queue is empty, it returns true else false
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Enqueue an item in the queue.
	 * 
	 * @param item
	 */
	public void enqueue(T item) {
		Node oldLast = last;
		last = new Node(item);
		/*
		 * assign first to last if queue is empty else assign reference of last
		 * node to oldNode
		 */
		if (isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}
		this.size++;
	}

	/**
	 * Dequeue the first item
	 * 
	 * @return the first item as well
	 */
	public T dequeue() {
		if (first == null)
			return null;
		T firstTemp = first.item;
		first = first.next;
		if (isEmpty())
			last = null;
		this.size--;
		return firstTemp;
	}

	/**
	 * print the current queue
	 */
	public void printQueue() {
		Node firstCopy = first;
		System.out.print("Queue Elements:");
		while (firstCopy != null) {
			System.out.print(firstCopy.item + ",");
			firstCopy = firstCopy.next;
		}
		System.out.println();
	}

	/**
	 * @param args
	 *            Test client for enqueue and dequeue operation on queue ds
	 */
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		// enqueue some item
		queue.enqueue(4);
		queue.printQueue();
		queue.enqueue(5);
		queue.printQueue();
		queue.enqueue(6);
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
		queue.dequeue();
		queue.enqueue(33);
		queue.enqueue(22);
		System.out.println("Dequeue element:" + queue.dequeue());
		System.out
				.println("*********printing stack element using Iterator***************");
		for (Integer qElement : queue) {
			System.out.print(qElement + "\t");
		}

	}

	@Override
	/**
	 * return queue iterator in FIFO order  
	 */
	public Iterator<T> iterator() {
		return new QueueIterator();
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/*
	 * CUSTOM queue iterator
	 */
	private class QueueIterator implements Iterator<T> {

		Node firstCopy = first;

		@Override
		/**
		 * checks if queue has next element
		 */
		public boolean hasNext() {
			return firstCopy != null;
		}

		@Override
		/**
		 * return the next element
		 */
		public T next() {
			T item = firstCopy.item;
			firstCopy = firstCopy.next;
			return item;
		}

		@Override
		/**
		 * method not implemented
		 */
		public void remove() {
			// NOt implemented
		}

	}
}
