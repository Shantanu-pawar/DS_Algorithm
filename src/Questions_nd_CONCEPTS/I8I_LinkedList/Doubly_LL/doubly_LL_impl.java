package Questions_nd_CONCEPTS.I8I_LinkedList.Doubly_LL;

public class doubly_LL_impl {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertAtEnd(12);
        list.insertAtEnd(13);
        list.insertAtEnd(14);
        list.insertAtEnd(15);
        list.display();

        list.insertAtHead(676);
        list.insertAtHead(700);
        list.display();
    }
}

class LL{
    private static class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
    }

    private Node head, tail;
    static int size;

    void insertAtHead(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node; return;
        }
        head.prev = node; // we establish the connection between new nodes
        node.next = head; // we establish the connection between new nodes

        head = node; // then shift the head node
    }
    void insertAtEnd(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node; return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node; // update the tail
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}