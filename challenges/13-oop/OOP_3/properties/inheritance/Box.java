package Java.Youtube.OOP_3.properties.inheritance;

public class Box {
    private double l;
    double h;
    double w;
//    double weight;

    static void greeting() {
        System.out.println("Hey, i am in Box class, greetings!");
    }

    public double getL() {
        return l;
    }


    Box () {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }



    // cube
    Box (double side) {

        // super(); Object class

        this.l = side;
        this.h = side;
        this.w = side;
    }

     Box(double l, double h, double w) {
         System.out.println("Box class constructor ");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }


}
