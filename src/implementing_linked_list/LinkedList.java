package implementing_linked_list;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void append(int value){
        Node appendedNode = new Node(value);
        if(this.tail.getNext() == null){
            this.tail.setNext(appendedNode);
            this.tail = appendedNode;
            this.length++;
        }
    }
    public void prepend(int value){
        Node prependedNode = new Node(value);
        prependedNode.setNext(this.head);
        this.head = prependedNode;
        this.length++;
    }

    public boolean insert(int index, int value){
        if(index > this.length|| index < 0){
            return false;
        }
        if(index == 0 ){
            this.prepend(value);
            return true;
        }
        if(index == this.length){
            this.append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node beforeNewNode = this.getNode(index-1);
        newNode.setNext(beforeNewNode.getNext());
        beforeNewNode.setNext(newNode);
        this.length++;
        return true;

    }

    public void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    public Node getNode(int index){
        if(index > this.length-1){
            return null;
        }
        Node currentNode = this.head;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}
