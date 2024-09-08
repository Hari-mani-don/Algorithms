package dsa.linkedList;

public class SinglyLinkedList<T> {
	private Node<T> head;
	private int size;

	public SinglyLinkedList() {
		head = null;
		size = 0;
	}

	private static class Node<T> {
		Node<T> next;
		T value;

		public Node(T value) {
			this.value = value;
			this.next = null;
		}

	}

	public void add(T value) {
		Node<T> newNode = new Node<>(value);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;

		}
		size++;
	}

	public void set(int index, T value) {

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		currentNode.value = value;
	}

	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> currentNode = head;
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.next;
			}
			currentNode.next = currentNode.next.next;
		}
		size--;
	}

	public int size() {
		return size;
	}

	public void prints() {
		Node<T> currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.value + " ");
			currentNode = currentNode.next;

		}

		System.out.println();
	}

	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		return currentNode.value;

	}

	public static void main(String[] args) {

		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
		singlyLinkedList.add(10);
		singlyLinkedList.add(20);
		singlyLinkedList.set(1, 30);
		singlyLinkedList.remove(1);

		singlyLinkedList.prints();
		System.out.println(singlyLinkedList.get(0));
		System.out.println(singlyLinkedList.size());

	}
}
