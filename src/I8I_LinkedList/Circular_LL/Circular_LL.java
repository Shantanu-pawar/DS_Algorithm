package I8I_LinkedList.Circular_LL;

public class Circular_LL {
    public static void main(String[] args) {
        LL list = new LL();
//        list.insertAtHead(232);
//        list.insertAtHead(2);
//        list.insertAtHead(1);
//        list.display();

        list.insertEnd(2);
        list.insertEnd(22);
        list.insertEnd(23);
        list.insertEnd(24);
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

    Node head, tail;

    void insertEnd(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            head.next = tail; return;
        }
        tail.next = node;
        tail = node;
    }


// complete this function.
    void insertAtHead(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = head;
            tail.next = head; return;
        }
        head.next = node;
        head = node;
        tail.next = head;
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