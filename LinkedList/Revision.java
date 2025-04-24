package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Revision {
    public static Node head = null;

    // Adding node at start
    public void addAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // add at last
    public void addAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Find size of likedlist===>no.of nodes
    public int size() {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    // add at given index
    public void addAtIndex(int data, int index) {
        int length = size();
        System.out.println("Size: " + length);
        if (index > length)
            System.out.println(" index out of range");
        else if (index == length)
            addAtLast(data);
        else if (index == 0)
            addAtStart(data);
        else {
            Node temp = head;
            int idx = 1;
            Node newNode = new Node(data);
            while (idx != index - 1) {
                temp = temp.next;
                idx++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // delete from start
    public void deleteAtStart() {
        int val = head.data;
        head = head.next;
        System.out.println(val);

    }

    // delete from last
    public void deleteAtLast() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is Empty");
        } else if (head.next == null) {
            int val = head.data;
            head = null;
            System.out.println(val);

        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            int val = temp.next.data;
            temp.next = null;
            System.out.println(val);
        }
    }

    // delete at any NOde
    public void deleteAtIndex(int index) {
        int length = size();
        System.out.println("Size: " + length);
        if (index > length)
            System.out.println(" index out of range");
        else if (index == length)
            deleteAtLast();
        else if (index == 0)
            deleteAtStart();
        else {
            Node temp = head;
            int idx = 1;

            while (idx != index - 1) {
                temp = temp.next;
                idx++;
            }
            int val = temp.next.data;
            temp.next = temp.next.next;
            System.out.println(val);
        }

    }

    // find middle of linkedlist
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // reverse a list
    public void reverseList() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    // detect cycle in ll
    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }

        return false;

    }

    // remove loop in ll
    public void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;

        }
        if (slow == fast) {
            if (slow == head) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            } else {
                slow = head;
                Node prev = fast;
                while (slow != fast) {
                    prev = fast;
                    slow = slow.next;
                    fast = fast.next;
                }

                prev.next = null;
            }

        }

        else {
            System.out.println("No loop detected");
        }
    }

    public static void main(String[] args) {
        Revision ll = new Revision();
        ll.addAtStart(6);
        ll.addAtStart(4);
        ll.addAtStart(3);
        ll.addAtStart(2);
        ll.display();
        ll.addAtLast(10);
        ll.addAtLast(20);
        ll.addAtLast(30);
        ll.addAtLast(40);
        ll.display();
        ll.addAtIndex(11, 0);
        ll.display();
        ll.addAtIndex(22, 9);
        ll.display();
        ll.addAtIndex(33, 9);
        ll.display();
        ll.deleteAtStart();
        ll.display();
        ll.deleteAtLast();
        ll.display();
        ll.reverseList();
        ll.display();
        ll.addAtLast(100);
        ll.display();
        ll.deleteAtIndex(3);
        ll.display();
        ll.deleteAtIndex(0);
        ll.display();
        ll.deleteAtIndex(7);
        ll.display();
        System.out.println("Middle :" + ll.middleNode(head).data);
        System.out.println(ll.hasCycle(head));
        ll.removeLoop(head);
    }

}
