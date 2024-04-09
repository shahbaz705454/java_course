package OOPS;
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
class Circle extends Shape {              //hieraricle inheritance
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {

    public static void main(String[] args) {

    }
}
