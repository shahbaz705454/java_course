package OOPS;





//There are 5 inheritance in java
// 1-Single Inheritance
// 2-Multi level Inheritance
// 3-Hierarchical inheritance
// 4-Hybrid Inheritance
// 5-Multiple In Inheritance (Using interface only) Exception in java
class Shape{
    public void area(){
        System.out.println("Displaying area of different shapes");
    }
}
class Triangle extends Shape{         //Single level inheritance
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class EuiTriangle extends Triangle{    // multi Level Inheritance
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }


}
class Circle extends Shape {              //hierarchical inheritance
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {

    public static void main(String[] args) {



    }
}
