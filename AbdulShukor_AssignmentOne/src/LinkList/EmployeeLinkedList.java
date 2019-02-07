package LinkList;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    
    // this method is adding node to the front of list
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }
    
    // this method is removing node from the front of list.

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    // this method is getting the size of nodes in the list
    public int getSize() {
        return size;
    }

    // this method is checking if the node list is empty or not
    public boolean isEmpty() {
        return head == null;
    }
// this method is printing the nodes in the list
    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
