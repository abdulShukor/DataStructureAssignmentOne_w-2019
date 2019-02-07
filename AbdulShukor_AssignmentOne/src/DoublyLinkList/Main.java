package DoublyLinkList;

import java.util.Iterator;
import java.util.LinkedList;

import LinkList.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

        Employee abdulshukor = new Employee("Abdul", "Shukor", 100);
        Employee muhmammadY = new Employee("Muhammad", "Yousufzai", 200);
        Employee zeenatY = new Employee("Zeenat", "Yousufzai", 300);
        Employee amzaS = new Employee("Amza", "Said", 400);
        Employee alikhan = new Employee("Ali", "Khan", 500);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(abdulshukor);
        list.addFirst(muhmammadY);
        list.addFirst(amzaS);
        list.addFirst(alikhan);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.addLast(alikhan);
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeFirst();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

//        for (Employee employee: list) {
//            System.out.println(employee);
//        }
    }
}
