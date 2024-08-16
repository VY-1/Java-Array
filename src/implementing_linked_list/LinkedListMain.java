package implementing_linked_list;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(10);

        myLinkedList.append(5);
        myLinkedList.append(16);
        myLinkedList.prepend(1);
        System.out.println(myLinkedList.insert(2,15));
        System.out.println(myLinkedList.insert(5,25));
        System.out.println(myLinkedList.insert(-1,25));

        myLinkedList.printList();
    }
}
