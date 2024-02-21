package Basics;

class Complex{
    int a;
    int b;
    Complex(){
        a = 1;
        b  =1;
    };
    Complex(int x,int y){
        a=x;
        b=y;


    }

    Complex(Complex c){

        a= c.a;
        b=c.b;
    }


    void showDisplay(){
        System.out.println(a + " " + b + "i");

    }
    Complex addComplex(Complex x){
        Complex n = new Complex();
        n.a = a+x.a;
        n.b = b+x.b;
        return n;

    }
    Complex subComplex(Complex c){
        Complex n = new Complex();
        n.a = a -c.a;
        n.b = b-c.b;


        return n;
    }
    Complex multiplicationComplex(Complex c){
        Complex n = new Complex();
        n.a = a*c.a-b*c.b;
        n.b = a*c.b+b*c.a;


        return n;
    }


}

public class ComplexNumber {
    public static void main(String[] args) {

        Complex o1 = new Complex(3,3);
        Complex o2 = new Complex(5,7);
        Complex o3 = new Complex();

//        o3 = o2.addComplex(o1);
//        o3.showDisplay();
        o3 = o2.subComplex(o1);
        o3.showDisplay();

        o3 = o2.multiplicationComplex(o1);
        o3.showDisplay();

    }
}
