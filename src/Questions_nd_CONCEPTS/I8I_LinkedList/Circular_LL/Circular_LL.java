package Questions_nd_CONCEPTS.I8I_LinkedList.Circular_LL;


/*
* i've observed that in linkedList we first created the references
* then allocate the values to it like [temp = head]
* */
public class Circular_LL {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertAtHead(4);
        list.insertAtHead(3);
        list.insertAtHead(2);
        list.insertAtHead(1);
//        list.display();

        list.insertEnd(22);
        list.insertEnd(23);
//        list.display();
//
        list.insertAtPos(2,10000);
        list.display();

        list.deleteAtPosition(1);
        list.display();
    }
}

class LL{
    private static class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private Node head, tail;
    private int size;
    void deleteAtPosition(int pos){
        if(tail == null) {
            System.out.println("Error : {data not available} check your pos to delete again"); return;
        }

        if(pos == 1){
            head=head.next;
            tail.next=head;
        }

        Node temp = head;
        while (pos-1 > 1){
            temp = temp.next;
            pos--;
        }
        temp.next = temp.next.next;
        size--;
    }

    void insertAtPos(int pos, int val){
        Node node = new Node(val);
        size++;

        if(pos < 0 || pos > size) {
            System.out.println("Invalid position"); return;
        }
        if(pos == 1) {
            node.next = head;
            head = node;
            tail.next = head;
        }
        if(tail == null) {
            head = node;
            tail = node;
            tail.next = head; return;
        }

        Node temp = head; // traversing till position
        while(pos-1 > 1){  // here pos-1 means we are inserting at current pos
            temp = temp.next; pos--;
        }

        node.next = temp.next; // connecting new node here
        temp.next = node;
    }

    void insertEnd(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            head.next = tail; size++; return;
        }
        tail.next = node;
        tail = node;
        tail.next = head;
        size++;
    }

    void insertAtHead(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            node.next = head; size++;
        }
        node.next = head;
        head = node;
        tail.next = head;

        size++;
    }

    void display(){
        Node temp = head;
        for(int i=0; i<10; i++){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL" + "" + " & size is :" + size);
    }
}