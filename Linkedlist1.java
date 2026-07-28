class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linkedlist1{

    Node head=null;
    void insertval(int data){
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }



    public static void main(String[] args) {
        Linkedlist1 ob = new Linkedlist1();

        ob.insertval(1);
        ob.insertval(2);
        ob.insertval(3);
        ob.insertval(5);
        ob.display();
        
    }
}