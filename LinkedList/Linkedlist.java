package LinkedList;

public class Linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) { // constructor
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void insertfirst(int data) {
        // step 1--create a node
        Node newnode = new Node(data);
        size++;

        if (head == null) { // list is empty
            head = tail = newnode;
        }

        // step 2--new node's next points head
        newnode.next = head; // linking step

        // step 3--head==new node
        head = newnode;
    }

    public void insertlast(int data) {
        Node newnode = new Node(data);// create a node
        size++;

        if (head == null) {// list is empty
            head = tail = newnode;
            return;
        }
        tail.next = newnode; // tail's next point newnode
        tail = newnode;// value of newnode in tail
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }

    }

    public void insertmid(int index, int data) {
        if (index == 0) {   ///inserting at start
            insertfirst(data);
            return;
        }
        Node newnode = new Node(data); //creating a node
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        // temp --> prev at i=index-2
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int deletefirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int deletelast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev:i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail ka data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public static void reverseList(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;//changing linking
            prev=curr;
            curr=next;
        }
        head=prev;
        
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertfirst(4);
        ll.insertfirst(6);

        ll.insertfirst(8);
        ll.insertlast(8);
        ll.insertlast(28);

        ll.insertmid(2, 77);
        ll.printlist();

        System.out.println();

        // ll.deletefirst();
        // System.out.println(ll.deletefirst());
        ll.deletelast();
        ll.printlist();
        System.out.println("size:" + ll.size);
        reverseList();
        ll.printlist();

    }

}

    
    
