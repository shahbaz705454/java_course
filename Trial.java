import java.util.Scanner;

class Vehicle {
    private int base_price;
    private String COfog, brand;

    public void setPrice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Brand Name:");
        brand = input.next();
        System.out.println("Enter Country of Origin:");
        COfog = input.next();
        System.out.println("Enter Base Price:");
        base_price = input.nextInt();
    }

    public int getPrice() {
        return base_price;
    }

    public void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Country of Origin: " + COfog);
        System.out.println("Base Price: " + base_price);
    }
}

class Car extends Vehicle {
    String model;
    int speed;

    public void setValue() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Model:");
        model = input.next();
        System.out.println("Enter Speed:");
        speed = input.nextInt();
    }


    int marketPrice;

    public int calculateMarketPrice() {
        int  mk = getPrice();
        marketPrice = getPrice();

        if (speed >=80) {
            marketPrice += (mk * 15) / 100;
        } else {
            marketPrice -= (mk * 5) / 100;
        }

        return marketPrice;
    }

    public void display() {
        double marketPrice = calculateMarketPrice();
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Market Price: " + marketPrice);
    }

    @Override
    public void setPrice() {
        super.setPrice();
    }
}

   class ass12 {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        Car obj1 = new Car();
        obj1.setPrice();
        obj.setPrice();
        obj.show();
        obj1.show();
        obj1.setValue();
        obj1.display();
    }
}