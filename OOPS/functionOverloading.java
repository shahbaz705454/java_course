package OOPS;

class Student{
    int rollNo;
    String name;
    int age;

    public void printInfo(int roll){
        this.rollNo=roll;
        System.out.println(this.rollNo);
    }
    public void printInfo(String name){
        this.name=name;
        System.out.println(this.name);
    }
    public void printInfo(int roll,String name,int age){
        this.age=age;
        System.out.println(roll+" "+name+" "+this.age);
    }

}

public class functionOverloading {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.printInfo(34);
        s1.printInfo("Mohd");
        s1.printInfo(44,"shahbaz",18);


    }

}
