class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class StackLinkedList {
    
    Node top = null;
    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top=newNode;
    }
    int pop(){
        if(top==null){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            int temp=top.data;
            top=top.next;
            return temp;
        }

    }
    int peek(){
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }
    void display(){
        if(top==null){
            System.out.println("Stack is Empty");
        }
        else{
            Node temp =top;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        StackLinkedList s = new StackLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.pop());
        System.out.println(s.peek());
        s.display();
    }
}
