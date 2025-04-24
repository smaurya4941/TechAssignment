class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class Sll:
    head = None
    
    def insertAtBegin(self, data):
        newnode = Node(data)
        newnode.next = self.head
        self.head = newnode

    def insertAtLast(self,data):
        newnode = Node(data)
        if self.head is None:
            self.head = newnode
            return
        temp = self.head
        while temp.next!=None:
            temp = temp.next
        temp.next = newnode  

    def display(self):
        temp = self.head
        while (temp!=None):
            print(temp.value,end=' ')
            temp = temp.next
        print()

    

    def insert_at_position(self, data, position):
        if position < 1:
            print("Position should be >= 1")
            return
        new_node = Node(data)
        if position == 1:
            new_node.next = self.head
            self.head = new_node
            return

        temp = self.head
        for _ in range(position - 2):
            if temp is None:
                print("Position out of range")
                return
            temp = temp.next

        if temp is None:
            print("Position out of range")
            return

        new_node.next = temp.next
        temp.next = new_node

    def deleteFromBegin(self):
        if self.head is None:
            print("List is empty.")
            return
        temp = self.head
        self.head = self.head.next
        del temp

    def deleteFromLast(self):
        if self.head is None:
            print("List is empty.")
            return
        temp=self.head
        while(temp.next is not None):
            temp=temp.next
        temp=None
        del temp


s = Sll()
s.insertAtBegin(12)
s.insertAtBegin(10)
s.insertAtBegin(15)
s.insertAtLast(20)
s.insertAtLast(60)
s.insertAtLast(80)
s.display()
# s.deleteFromBegin()
# s.display()
s.deleteFromLast()
s.display()


