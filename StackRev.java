public class StackRev {
    int top;
    int[] rev;
    int size;
    StackRev(int size){
        this.size=size;
        this.top=-1;
        rev = new int[size];
    }
    void push(int data){
        if(top==size-1){
            System.out.println("Stack is overflow");
            return;
        }
        else{
            rev[++top]=data;
        }
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(rev[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        StackRev s = new StackRev(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.display();


    }
}
