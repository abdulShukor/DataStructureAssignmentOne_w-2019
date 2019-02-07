package LinkList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee empOne= new Employee("Abdul", "Shukor", 100);
		Employee empTwo= new Employee("Muhammad", "Khan", 110);
		Employee empThird= new Employee("Zeenat", "Yousufzai", 120);
		empOne.toString();
		
		EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(empOne);
        list.addToFront(empTwo);
        list.addToFront(empThird);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

             
	}

}
