package homework.lesson9.prob2;

public class LinkedListStack implements StackInterface {
	private Node link;
	private int limitedSize;

	public LinkedListStack(int n) {
		limitedSize = n;
	}

	@Override
	public void push(Object item) {
		if (limitedSize == size()) {
			System.out.println("Stack is full");
			return;
		}

		if (link == null) {
			link = new Node(null, item, null);
		} else {
			Node temp = new Node(null, item, link);
			link.prev = temp;
			link = temp;
		}
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		Node temp = link;
		if (temp.next != null) {
			link = temp.next;
		} else {
			link = null;
		}

		return temp;
	}

	@Override
	public Object peek() {
		if (isEmpty())
			return null;
		return link;
	}

	@Override
	public boolean isEmpty() {
		return (link == null);
	}

	@Override
	public int size() {
		int count = 0;
		Node temp = link;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public class Node {
		Object data;
		Node prev;
		Node next;

		public Node(Node prev, Object data, Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}
}
