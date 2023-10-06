package Java.Youtube.OOP_3.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 34, 43);
//        Box box2 = new Box(box1);
//        System.out.println(box1.w + " " + box1.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(3, 4, 54, 43);
//        System.out.println(box3.h + " " + box3.weight);

//        Box box5 = new BoxWeight(2, 34, 45, 45);
//        System.out.println(box5.w);


        // there are many way variable in both parent and child classes
        // you are given access to variable that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also mean, that the ones you have are trying to access should be initialised
        // but here, when the object itSelf is of type parent class, how will you call the constructor of child class
        // that is why error
//        BoxWeight box6 = new Box(12, 23, 43);
//        System.out.println(box6);


        BoxPrice box7 = new BoxPrice(5, 3, 69);

//        box1.greeting();

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting(); // you can inherit nut you cannot override
    }
}
