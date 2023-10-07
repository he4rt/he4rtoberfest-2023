package Java.Youtube.OOP_6.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human nikunj = new Human(23, "Nikunj");
//        Human twin = new Human(nikunj);

        Human twin = (Human) nikunj.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(nikunj.arr));
    }
}
