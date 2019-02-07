package DoublyLinkListTwo;

public class StudentDoublyLinkedList {
	private StudentNode head;
	private StudentNode tail;
	private int size;

	// this method adding node to the front of list
	public void addToFront(Student student) {
		StudentNode node = new StudentNode(student);
		if (head == null) {
			tail = node;

		} else {
			head.setPrevious(node);
			node.setNext(head);
		}

		head = node;
		size++;

	}
	// this method adding node to the end of list

	public void addToEnd(Student student) {
		StudentNode node = new StudentNode(student);

		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}

		tail = node;
		size++;
	}
// this method is getting the size of the list
	public int GetSize() {
		return size;
	}
// this method is checking if the list is empty or not
	public boolean isEmpty() {
		return head == null;

	}

	
	// this method is removing node from the front of list
	public StudentNode removeFromFront() {
		if (isEmpty()) {
			return null;

		}

		StudentNode removeNode = head;
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}

		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
	}

	// this method is removing node from the end of list 
	public StudentNode removeFromEnd() {
		if (isEmpty()) {
			return null;

		}

		StudentNode removeNode = tail;
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setPrevious(null);
		}

		tail = tail.getPrevious();
		size--;
		removeNode.setPrevious(null);
		return removeNode;

	}
	
	// this method is printing the node in the list

	public void printList() {
		StudentNode current = head;
		System.out.print("HEAD->");
		while (current != null) {
			System.out.print(current);
			System.out.print("<=>");
			current = current.getNext();
		}
		System.out.println("null");

	}

}
