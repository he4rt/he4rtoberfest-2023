package Java.Youtube.OOP_3.properties.inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {

        super(l, h, w); // what is this..? --> call the parent call class constructor
        // used the initialise values present in parent class

//        System.out.println(super.weight);  super.weight is ref to parent class of weight

        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }


//    @Override
//    static void greeting() {
//        System.out.println("Hey, i am in BoxWeight class, greetings!");
//    }
}
