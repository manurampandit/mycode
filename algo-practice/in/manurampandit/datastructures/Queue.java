/**
 * 
 */
package in.manurampandit.datastructures;


/**
 * @author manurampandit
 * TODO: handle overflow and underflow scenario 
 */
public class Queue<T> {
	private Node<T> first, last;

	/**
	 * @author manurampandit
	 * Inner class containing Node
	 * @param <T>
	 */
	private class Node<T> {
		T item;
		Node<T> next;

		public Node(T item) {
			this.item = item;
			this.next = null;
		}
	}
	
	/**
	 *  if queue is empty, it returns true else false
	 * @return
	 */
	public boolean isEmpty() {
		return first == null;
	}
	
	/**
	 * Enqueue an item in the queue.
	 * @param item
	 */
	public void enqueue(T item) {
		Node<T> oldLast=last;
		last= new Node<T>(item);
		/*
		 * assign first to last if queue is empty
		 *  else assign reference of last node to oldNode
		 */
		if(isEmpty()){
			first=last;
		}
		else{
			oldLast.next=last;
		}
	}
	/**
	 * 
	 * @return
	 */
	public T dequeue() {
		T firstTemp = first.item;
		first = first.next;
		if(isEmpty())
			last=null;
		return firstTemp;
	}
	/**
	 * print the current queue
	 */
	public void printQueue(){
		Node<T> firstCopy=first;
		System.out.print("Queue Elements:");
		while(firstCopy!=null){
			System.out.print(firstCopy.item + ",");
			firstCopy=firstCopy.next;
		}
		System.out.println();
	}
	
	/**
	 * @param args
	 * Test client for enqueue and dequeue operation on queue ds
	 */
	public static void main(String[] args) {
		Queue<Integer> queue= new Queue<>();
		//enqueue some item
		queue.enqueue(4);
		queue.printQueue();
		queue.enqueue(5);
		queue.printQueue();
		queue.enqueue(6);
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
		
	}

}
