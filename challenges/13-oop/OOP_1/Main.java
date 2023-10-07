package Java.Youtube.OOP_1;

public class Main {
    public static void main(String[] args) {
        // store 5 roll number
        int[] number = new int[5];

        // store 5 names
        String[] names = new String[5];

        // dara of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
//        float[] marks = new float[5];

        Student[] student = new Student[5];

//        Student nikunj; // just declaring
//        nikunj = new Student(); // Initialise
       Student nikunj = new Student(14, "Nikunj Makwana", 69.3f);
        Student rahul = new Student(12, "Rahul", 53.4f);

//       nikunj.rno = 24;
//       nikunj.name = "Niknj Makwana";
//       nikunj.marks = 69.69f;


//        nikunj.changeName("Don'tUse");
//        nikunj.greeting();


        System.out.println(nikunj.rno);
        System.out.println(nikunj.name);
        System.out.println(nikunj.marks);

        Student random = new Student(nikunj);

        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";
        System.out.println(two.name);

    }
}

// create  a class
// for every single students
class Student {
    int rno;
    String name;
    float marks = 90;


    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! my name is " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    Student (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
//        this.rno = 24;
//        this.name = "Niknj Makwana";
//        this.marks = 69.69f;


        // this is how you call a constructor form another constructor
        // internally : new Student (23, "default person", 100.0f);
        this(23, "default person", 100.0f);
    }


    // Student arpit = new Studnt(12, "Arpit",54);
    // here this will be replace with arpit
    Student (int roll, String naam, float mark) {
       this.rno = roll;     // rno = roll;
       this.name = naam;    // name = naam;
       this.marks = mark;   // marks = mark;
    }
}
