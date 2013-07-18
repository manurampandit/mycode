/**
 * 
 */
package in.manurampandit.datastructures;

import java.util.Iterator;

/**
 * @author manurampandit
 * TODO: return exception if stack is already null
 */
public class Stack<Item> implements Iterable<Item>{

	private Node top;

	private class Node {
		Item item;
		Node next;

		public Node(Item item) {
			this.item = item;
		}
	}

	/**
	 * This pushes an item in stack
	 * 
	 * @param item
	 */
	public void push(Item item) {
		Node oldTop = top;
		top = new Node(item);
		top.next = oldTop;
	}

	/**
	 * This pop an item from stack
	 * 
	 * @return item if item exist else return nul
	 */
	public Item pop() {
		if (top == null) {
			System.out.println("No item present.");
			return null;
		}
		Item item = top.item;
		top = top.next;
		return item;
	}
	
	public void printStack(){
	/*
	 * old algo to traverse in linear fashion
	 */
		Node oldTop=top;
		while(oldTop!=null){
			System.out.print(oldTop.item + ",");
			oldTop=oldTop.next;
		}
		System.out.println();
	//TODO: write iterable method
		
	
	}

	/**
	 * Test client for stack
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> myStack= new Stack<>();
		myStack.push(4);
		myStack.printStack();
		myStack.push(5);
		myStack.printStack();
		myStack.push(6);
		myStack.printStack();
		/*
		Integer item= myStack.pop();
		System.out.println("popped item:" + item);
		myStack.printStack();
		item= myStack.pop();
		System.out.println("popped item:" + item);
		myStack.printStack();
		item= myStack.pop();
		System.out.println("popped item:" + item);
		myStack.printStack();
		*/
		for (Iterator iterator = myStack.iterator(); iterator.hasNext();) {
			int currNo = (int) iterator.next();
			System.out.println(currNo);
			
		}
	}

	@Override
	public Iterator<Item> iterator() {
		
		return new StackIterator();
	}

	private class StackIterator implements Iterator<Item>{
		private Node current=top;
		@Override
		public boolean hasNext() {
			return top==null;
		}

		@Override
		/**
		 * Returns 
		 */
		public Item next() {
			Item item=current.item;
			current=current.next;
			return item;
		}

		@Override
		/**
		 * Method not implemented
		 */
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
