package I8I_LinkedList.Singly_LL;

/*
using tail and head  - deletion, insertion to any position.
*/

public class singly_LL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtEnd(23);
        list.insertAtEnd(24);
        list.insertAtEnd(25);
        list.insertAtEnd(12121);
        list.display();

        list.insertPos(4, 9000);
        list.display();

        list.insertFirst(1);
        list.display();

        list.deletePos(4);
        list.display();
    }
}

class LL{
    private Node head, tail;
    void deletePos(int pos){
        if(pos < 0 || head == null){
            System.out.println("Nothing to be deleted."); return;
        }
        if(pos == 1){
            head = head.next; return;
        }
        Node prev = head;
        for(int i= 1; i < pos-1; i++){ // here 1 is for we don't consider zero based indexing here.
            prev = prev.next;
        }

        prev.next = (prev.next).next;
    }

    void insertPos(int pos, int val){
        Node node = new Node(val);
        int curr = 1;
        if(tail == null){ // case 1: check if tail is null
            head = node;
            tail = node;
        }

        if(pos == 1){ // case 2: insert at head pos
            node.next = head;
            head = node; return;
        }

        Node temp = head; // 3 : insert any pos in LL
        while(temp.next != null && curr < pos-1) {
            temp = temp.next;
            curr++;
        }

        if(temp == null || temp.next == null) {
            System.out.println("you Entered wrong position."); return;
        }

        temp.next = node;
        node.next = temp.next;
    }


    void insertAtEnd(int val){ // insert at constant O(1) time.
        Node node = new Node(val);
        if(tail == null){
            head = node;
            tail = node; return;
        }
        tail.next = node;
        tail = node;
    }

    void insertFirst(int val){
        Node node = new Node(val);

        if(head == null){
            head = node; return;
        }
        node.next = head;
        head = node;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    private static class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
}
