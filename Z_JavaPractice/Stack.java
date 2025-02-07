package Z_JavaPractice;

import java.util.ArrayList;

class StackImplement{
    public static ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty(){
       return list.size()==0;

    }
//    push
    public void push(int data){
        list.add(data);
    }

//    pop
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        return top;
    }
}

public class Stack {
    public static void main(String[] args) {
        StackImplement list = new StackImplement();
        System.out.println(list.pop());
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        for (int i = 0; i <4 ; i++) {
            System.out.println(list.peek());
            list.pop();

        }

    }
}
