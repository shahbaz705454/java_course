package Z_JavaPractice;
class Shape{
    public void area(){
        System.out.println("Displaying Area");
    }

}
//Single inheritance
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println((1/2)*l*h);
    }
}

//Hierarchical Inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

//Multilevel inheritance
class EquilateralTriangle extends Shape{
    public void area(int l,int h){
        System.out.println((2)*l*h);
    }
}

//For Multiple Inheritance in java is not present we use Interface for achieving multiple inheritance


public class OOPS_Inheritance_3 {
    public static void main(String[] args) {


    }
}
