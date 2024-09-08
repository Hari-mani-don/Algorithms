package dsa.linkedList;

public class DoublyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	int size;

	public DoublyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	private static class Node<T> {
		T value;
		Node<T> prev;
		Node<T> next;

		public Node(T value) {
			this.value = value;
			this.prev = null;
			this.next = null;
		}
	}

	public void addLast(T value) {
		Node<T> newNode = new Node<>(value);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}

	public void set(int index, T value) {
		if (index < 0 && index >= size) {
			throw new IndexOutOfBoundsException();
		} else {
			Node<T> currentNode = head;
			for (int i = 0; i < index; i++) {
				currentNode = currentNode.next;
			}
			currentNode.value = value;
		}
	}

	public void addFirst(T value) {
		Node<T> newNode = new Node<>(value);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	public void removeFist() {
		head = head.next;
		if (head != null) {
			head.prev = null;
		} else {
			tail = null;
		}
	}

	public void removeLast() {
		tail = tail.prev;
		if (tail != null) {
			tail.prev = null;
		} else {
			tail = null;
		}
	}
}
