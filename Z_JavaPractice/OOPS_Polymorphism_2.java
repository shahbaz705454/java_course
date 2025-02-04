package Z_JavaPractice;

class Student2{

    String name;
    int age;

//    compile TIme polymorphism function overloading
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name,int age){
        System.out.print(name+" : ");
        System.out.print(age);
    }

}

public class OOPS_Polymorphism_2 {
    public static void main(String[] args) {
//        Polymorphism are two types
//        function overloading and function overriding
//        run time polymorphism and compileTime Polymorphism

        Student2 s1= new Student2();
        s1.name="Mohd Shahbaz Rayeen";
        s1.age = 24;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);








    }
}
