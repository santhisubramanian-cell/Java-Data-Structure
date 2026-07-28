import java.util.*;
public class StackArray{
    int top;
    int[] stack;
    int size;
    StackArray(int size){
        this.size=size;
        this.top=-1;
        stack= new int[size];
        
    }
    void push(int data){
        if(top==size-1){
            System.out.println("Stack is Overflow");
            return;
        }
        else{
            stack[++top]=data;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is Underflow");
            return -1;
        }
        return stack[top--];
        
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
            
        }
        System.out.println();
    }


    public static void main(String[] args) {
       
        StackArray stk = new StackArray(5);
        stk.display();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        System.out.println(stk.pop());
        System.out.println(stk.peek());
        stk.display();

    }
}