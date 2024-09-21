package dsa.queue;
public class PriorityQueue<T> {
	private Node<T> head;
	private int size;
	public PriorityQueue() {
		head = null;
		size = 0;

	}
	private static class Node<T> {
		Node<T> nextNode;
		int priority;
		T element;
		public Node(T element, int priority) {
			nextNode = null;
			this.priority = priority;
			this.element = element;
		}
	}

	public void enquee(T element, int priority) {
		Node<T> newNode = new Node<T>(element, priority);
		if (head == null || priority > head.priority) {
			newNode.nextNode = head;
			head = newNode;
		} else {
			Node<T> currentNode = head;
			while (currentNode.nextNode != null && priority < currentNode.nextNode.priority) {
				currentNode = currentNode.nextNode;
			}
			newNode.nextNode = currentNode.nextNode;
			currentNode.nextNode = newNode;
		}
		size++;
	}

//	public void dequee() {
//		if(head)
//	}
}
