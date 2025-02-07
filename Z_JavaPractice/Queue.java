package Z_JavaPractice;
class queue2{
    public static int [] arr;
    int size=0;
    int rear = -1;
        queue2(int n){
            arr = new int[n];
            this.size = n;



        }

        public boolean isEmpty(){
            return rear ==-1;

        }

//        enqueue

        public void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
            }

            rear++;
            arr[rear] =data;
        }

//        Deque
    public int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front =arr[0];
        for (int i = 0; i <rear ; i++) {
            arr[i]=arr[i+1];

        }
        rear--;
        return front;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int front =arr[0];
        return front;

    }
}

public class Queue {
    public static void main(String[] args) {

        queue2 q = new queue2(5);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());

    }
}
