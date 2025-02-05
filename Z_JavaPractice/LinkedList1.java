package Z_JavaPractice;
import java.util.*;
class LL{
    Node head;
    private int size;

    LL(){
        this.size=0;
    }
     class Node{
        String data;
        Node next;

        Node(String data){
            this.data =data;
            this.next=null;
            size++;

        }
    }


    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head ==null){
            head =newNode;
            return;
        }

        newNode.next=head;
        head=newNode;


    }


    public void addLast(String data){
        Node newNode = new Node(data);
        if (head ==null){
            head =newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    public void printNode(){
        if (head==null){
            System.out.println("Linked-list is empty");
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+"-> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
        if (head==null){
            System.out.println("Linked-list is already empty");
        };


        size--;
        head= head.next;


    }
    public void deleteLast(){
        if(head ==null){
            System.out.println("List is already empty");

        }

        Node secondlast =head;
        Node last = head.next;
        while (last.next != null){
            last =last.next;
            secondlast=secondlast.next;
        }

        size--;
        secondlast.next=null;
    }
    public void size(){
        System.out.println(size);
    }
}

public class LinkedList1 {






    public static void main(String[] args) {
        LinkedList<String> list2 = new LinkedList<>();
        LL list = new LL();
        list.addFirst("hello");
        list.addFirst("is");
        list.addFirst("This");
        list.printNode();

        list.addLast("Shahbaz");
        list.printNode();
        list.size();
        list.deleteLast();
        list.printNode();
        list.deleteFirst();
        list.printNode();
        list.size();


    }
}
