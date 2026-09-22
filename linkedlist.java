class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    
}
class linkedlist {
    Node head;

    void add(int data){
       Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!= null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
     void addAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
     }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
    }
    
}