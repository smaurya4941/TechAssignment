class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insert_after_value(self, value, data):
        new_node = Node(data)
        current = self.head
        while current:
            if current.data == value:
                new_node.next = current.next
                current.next = new_node
                return
            current = current.next
        raise ValueError("Value not found in the list")

    def display(self):
        current = self.head
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")

# Example Usage:
llist = LinkedList()
llist.insert_at_beginning(3)
llist.insert_at_beginning(7)
llist.insert_at_beginning(1)
llist.insert_after_value(7, 5)
llist.display()
