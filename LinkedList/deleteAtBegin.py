class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class Sll: 
    head = None
    # def __init__(self,data):
    #     self.head=None(data)
    
    def insertAtBegin(self, data):
        newnode = Node(data)
        newnode.next = self.head
        self.head = newnode
    
    def deleteAtBegin(self):
        if self.head is None:
            print("List is empty, nothing to delete")
            return 

        temp=self.head
        self.head=self.head.next
        del temp


    def display(self):
        temp = self.head
        while (temp!=None):
            print(temp.value)
            temp = temp.next


s = Sll()
s.insertAtBegin(12)
s.insertAtBegin(10)
s.insertAtBegin(15)
s.display()
s.deleteAtBegin()
print("After Deletion first node")
s.display()