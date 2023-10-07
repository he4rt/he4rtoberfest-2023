package Java.Youtube.OOP_6.generics.comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    float mark;

    public Student(int rollNo, float mark) {
        this.rollNo = rollNo;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return mark + " " + rollNo;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.mark - o.mark);

        // if diff == 0; mean both are equal
        // if diff < -1 mean is bigger else o is smaller
        return diff;
    }
}
