package Java.Youtube.OOP_3.properties.polymorphism;

public class Circle extends Shapes {

    // this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this called annotation
    void area() {
        System.out.println("Area is pie * r * r");
    }
}