package Z_JavaPractice;

class Student{
//    DATA
    String name;
    int age;

//    MEMBER
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

//    There are three types of constructor
//    DEFAULT CONSTRUCTOR
    Student(){
        System.out.println("Default Constructor Called");
    }

//    PARAMETERIZED Constructor
    Student(String name,int age){
        this.age = age;
        this.name=name;

    }


//    COPY Constructor

    Student(Student s2){
        this.name =s2.name;
        this.age =s2.age;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("name",25);
//        s1.name="Mohd Shahbaz";
//        s1.age=24;
        s1.printInfo();





    }
}
