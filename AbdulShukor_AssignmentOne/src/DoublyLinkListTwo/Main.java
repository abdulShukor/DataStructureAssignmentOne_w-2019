package DoublyLinkListTwo;

public class Main {

	public static void main(String[] args) {
		Student abdulshukor = new Student("Abdul", "Shukor", 10);
		Student muhammadY = new Student("muhammad", "yousufzai", 20);
		Student zeenatK = new Student("zeenat", "khan", 30);
		Student sobahnY = new Student("sobhan", "yousufzai", 40);

		StudentDoublyLinkedList list = new StudentDoublyLinkedList();

		list.addToFront(abdulshukor);
		list.addToFront(muhammadY);
		list.addToFront(zeenatK);
		list.addToFront(sobahnY);

		list.printList();
		System.out.println(list.GetSize());

		Student omedEnd = new Student("Omed", "End", 50);
		list.addToEnd(omedEnd);
		list.printList();
		System.out.println(list.GetSize());
		list.removeFromFront();
		list.printList();
		System.out.println(list.GetSize());
		list.removeFromEnd();
		list.printList();
		System.out.println(list.GetSize());

	}
}
