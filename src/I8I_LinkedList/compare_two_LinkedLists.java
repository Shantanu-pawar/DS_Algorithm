package I8I_LinkedList;

import java.util.Scanner;

//https://course.acciojob.com/idle?question=148e79c2-27e2-4693-a07a-085cd378c302
public class compare_two_LinkedLists {
    public static void main(String[] args) {
        List l1 = new List();
        List l2 = new List();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) l1.add(in.nextInt());
        for (int i = 0; i < m; i++) l2.add(in.nextInt());

        boolean ok = check(l1.head, l2.head);
        if (ok == true) {
            System.out.println(1);
        } else System.out.println(0);
    }

    static boolean check(Node h1, Node h2) {
        boolean flag = true;

        while (h1 != null && h2 != null) {

            if (h1.data != h2.data) flag = false;

            h1 = h1.next;
            h2 = h2.next;
        }

        // case : now just check if any single element present or not.
        if (h1 != null || h2 != null)
            flag = false;

        return flag;
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class List {
    Node head;

    void add(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new_node;
    }
}
