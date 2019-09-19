package homework.lesson8.day2.prob1;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addSort(String item) {
		if (isFirstNode(item))
			return;
		addNewNode(item);
	}

	private boolean isFirstNode(String item) {
		if (header == null) {
			header = new Node(null, item, null);
			return true;
		}
		return false;
	}

	private void addNewNode(String item) {
		Node temp = header;
		while (temp != null) {
			if (equalLevel(temp, item))
				break;
			if (higherLevel(temp, item))
				break;
			if (lowerLevel(temp, item))
				break;
			temp = temp.next;
		}
	}

	private boolean equalLevel(Node node, String item) {
		return node.value.compareTo(item) == 0 ? addAfter(node, item) : higherLevel(node, item);
	}

	private boolean higherLevel(Node node, String item) {
		return node.value.compareTo(item) < 0 ? nodeNext(node, item) : addBefore(node, item);
	}

	private boolean nodeNext(Node node, String item) {
		return node.next != null ? nodeNextLevel(node, item) : addAfter(node, item);
	}

	private boolean nodeNextLevel(Node node, String item) {
		if (node.next.value.compareTo(item) < 0)
			return false;
		else
			return addAfter(node, item);
	}

	private boolean lowerLevel(Node node, String item) {
		return node.value.compareTo(item) > 0 ? addBefore(node, item) : false;
	}

	private boolean addBefore(Node node, String item) {
		Node newNode = new Node(node.previous, item, node);
		if (node.previous != null) {
			node.previous.next = newNode;
		} else {
			header = newNode;
		}
		node.previous = newNode;
		return true;
	}

	private boolean addAfter(Node node, String item) {
		Node newNode = new Node(node, item, node.next);
		if (node.next != null) {
			node.next.previous = newNode;
		}
		node.next = newNode;
		return true;
	}

	public int size() {
		int count = 0;
		Node temp = header;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public boolean isEmpty() {
		if (header == null)
			return true;
		else
			return false;
	}

	public Node getFirst() {
		return header;
	}

	public Node getLast() {
		Node temp = header;
		Node lastNode = header;
		while (temp != null) {
			lastNode = temp;
			temp = temp.next;
		}
		return lastNode;
	}

	public boolean contains(String item) {
		Node temp = header;
		while (temp != null) {
			if (temp.value.equals(item)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void removeFirst() {
		Node temp = header.next;
		if (header != null) {
			if (header.next != null) { 
				header = null;
				header = temp;
				header.previous = null;
			} else {
				header = null;
			}
		}
	}

	void removeLast() {
		Node lastNode = getLast();
		Node temp = lastNode.previous;
		if (lastNode != null) {
			lastNode = null;
			lastNode = temp;
			lastNode.next = null;
		}
	}

	public void print() {
		print(header);
	}

	void print(Node n) {
		if (n == null)
			return;
		System.out.print(n + " ");
		print(n.next);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node next = header.next;
		while (next != null) {
			sb.append(next.value + ", ");
			next = next.next;
		}
		String ret = sb.toString();
		ret = ret.substring(0, ret.length() - 2);
		return (ret + "]");
	}
	

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		@Override
		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		mySL.addSort("Jullio");
		mySL.addSort("Prisky");
		mySL.addSort("Kolvocky");
		mySL.addSort("Andre");
		mySL.addSort("Hermangild");
		mySL.addSort("Lukzob");
		mySL.addSort("Guthrie");
		mySL.addSort("Manzi");
		mySL.print();
		
		System.out.println();
		System.out.println("\nGet first: " + mySL.getFirst());
		System.out.println("Get last: " + mySL.getLast());
		
		System.out.println("Size: " + mySL.size());
		System.out.println("Contain 'Hermangild': " + mySL.contains("Hermangild"));
		System.out.println("Contain 'James': " + mySL.contains("James"));
		System.out.print("Remove first will yield: ");
		mySL.removeFirst();
		mySL.print();
		System.out.print("\nRemove last will yield: ");
		mySL.removeLast();
		mySL.print();
		
		System.out.println("\n" + mySL);
	}
}

/* OUTPUT
 * 
 * Andre Guthrie Hermangild Jullio Kolvocky Lukzob Manzi Prisky 
 * Get first: Andre
 * Get last: Prisky
 * Size: 8
 * Contain 'Hermangild': true
 * Contain 'James': false
 * Remove first will yield: Guthrie Hermangild Jullio Kolvocky Lukzob Manzi Prisky 
 * Remove last will yield: Guthrie Hermangild Jullio Kolvocky Lukzob Manzi 
 * [Hermangild, Jullio, Kolvocky, Lukzob, Manzi]
 * 
 */
