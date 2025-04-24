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
        # newnode=Node(data)
        # temp = self.head
        # while (temp!=None):
        #     temp = temp.next
        # temp.next=newnode
        # newnode.next=None
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
            print(temp.value)
            temp = temp.next

    def deleteAtBegin(self):
        self.head=self.head.next


s = Sll()
s.insertAtBegin(12)
s.insertAtBegin(10)
s.insertAtBegin(15)
s.insertAtLast(20)
s.insertAtLast(60)
s.insertAtLast(80)
s.display()
s.deleteAtBegin()
print("After Deletion")
s.display()
