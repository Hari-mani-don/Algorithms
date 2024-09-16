package dsa.linkedList;


public class DoublyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

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

	public void add(T value) {
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
		if (index < 0 || index >= size) {
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
		size--;
	}

	public void removeLast() {
		tail = tail.prev;
		if (tail != null) {
			tail.next = null;
		} else {
			head = null;
		}
		size--;
	}

	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}

		if (index == 0) {
			head = head.next;
			if (head != null) {
				head.prev = null;
			} else {
				tail = null;
			}
		} else if (index == size - 1) {
			tail = tail.prev;
			if (tail != null) {
				tail.next = null;
			} else {
				head = null;
			}
		} else {
			Node<T> currentNode = head;
			for (int i = 0; i < index; i++) {
				currentNode = currentNode.next;
			}
			currentNode.prev.next = currentNode.next;
			currentNode.next.prev = currentNode.prev;

		}
		size--;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void prints() {
		Node<T> currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.value + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {

		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
		doublyLinkedList.add(2);
		doublyLinkedList.addFirst(3);
		doublyLinkedList.addLast(3);
		doublyLinkedList.addFirst(1);
		doublyLinkedList.remove(0);
		doublyLinkedList.removeFist();
		doublyLinkedList.removeLast();
		doublyLinkedList.prints();
		System.out.println(doublyLinkedList.size());


	}
}
