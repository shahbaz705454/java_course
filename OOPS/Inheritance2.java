package OOPS;

class Box{
    double l;
    double w;
    double h;

     Box(double l,double w, double h){
         this.h=h;
         this.w= w;
         this.l=l;

     }
     Box (Box old){
         this.h =old.h;
         this.w=old.w;
         this.l= old.l;
     }

     Box(double l){
         this.l =l;
         this.w=-1;
         this.h=-1;
     }
     Box(){
         l=-1;
         w=-1;
         h=-1;
     }
     void display(){
         System.out.println("height is : "+ h + " \nlength is : "+ l + "\nwidth is : "+w );
     }

}
class BoxWeight extends Box{
    double weight;

    BoxWeight(double l,double w,double h,double weight){
        super(l,w,h);
        this.weight=weight;
    }
    void display(){
        System.out.println("height is : "+ h + " \nlength is : "+ l + "\nwidth is : "+w +"\nweight is  : "+ weight);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {

        Box box1 = new Box();
//        box1.display();


        Box box2 = new Box(22.2);
//        box2.display();
        Box box3 = new Box(22.4,55.6,77.6);
//        box3.display();
        Box box4 = new Box(box3);
//        box4.display();

        BoxWeight box = new BoxWeight(22,33.44,55.6,774.4);
        box.display();


    }
}

