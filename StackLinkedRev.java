class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class StackLinkedRev {
    Node top =null;
    void push(int data){
        Node newNode = new Node(data);
        newNode.next=top;
        top=newNode;
    }
    void display(){
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){

        StackLinkedRev s = new StackLinkedRev();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.display();

    }
}
