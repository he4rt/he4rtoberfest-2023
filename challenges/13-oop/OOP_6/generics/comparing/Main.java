package Java.Youtube.OOP_6.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student nikunj = new Student(12, 89.65f);
        Student nk = new Student(5,99.43f);
        Student arpit = new Student(2,95.43f);
        Student karan = new Student(13,77.43f);
        Student sachin = new Student(9,96.23f);

        Student[] list = {nikunj, nk, arpit, karan, sachin};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.mark - o2.mark);
            }
        });


        System.out.println(Arrays.toString(list));

//        if (nikunj.compareTo(nk) < 0) {
//            System.out.println("nk has more mark");
//        }

    }
}
