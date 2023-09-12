package I8I_LinkedList.Singly_LL;

/*
 i've used only head pointer in singly linkedList Here.
 */

public class singly_LL_withoutTail {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtHead(12);
        list.insertAtHead(22);
        list.insertAtHead(32); // this one is head in this case.
        list.display();

        list.insertAtLast(100);
        list.insertAtLast(101);
        list.insertAtLast(102);
        list.display();


        list.insertAtSpecificPos(7, 10000);
        list.display();

        list.deleteHead();
        list.display();

        list.deleteAtPosition(9);
        list.display();

    }
}


class LinkedList{
    private static class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private Node head;

    void insertAtHead(int val){
        Node node = new Node(val);

        if(head == null){
            head = node; return;
        }

        // Insert the newly created Node before head each time here.
        node.next = head;
        head = node;
    }

    void insertAtLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node; return;
        }

        // step : here traversing till empty node and insert it.
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void insertAtSpecificPos(int pos, int val){
        if(pos <= 0) {
            System.out.println("invalid Position."); return;
        }

        Node node = new Node(val);
        // this will handle empty head and insert at head condition.
        if(pos == 1){
            node.next = head;
            head = node; return;
        }

        Node temp = head;
        int currPos = 1;

        while (temp != null && currPos < pos-1){ // traversing till proper pos
            temp = temp.next;
            currPos++;
        }

        //case : null pointer check here - cause what if the position is not exist in out linkedList
        if(temp == null){
            System.out.println("Position exceeds the length of the list.");
            return;
        }
        node.next = temp.next;
        temp.next = node;
    }

    void deleteHead(){
        if(head == null) {
            System.out.println("LinkedList is already null");
        }
        head = head.next;
    }

    void deleteAtPosition(int pos){
        if(pos <= 0) {
            System.out.println("List is already empty or wrong size entered."); return;
        }

        int curr = 1;
        Node temp = head;
        if(pos == 1){
            head = head.next;
        }
        while(temp != null && curr < pos-1){
            curr++;
            temp = temp.next;
        }

        if(temp == null || temp.next == null) { // case : for null pointer exception
            System.out.println("\n you entered invalid point for deletion"); return;
        }

        temp.next = temp.next.next;
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