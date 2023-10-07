package Java.Youtube.OOP_7;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // there are enum constants
        // public, static and final
        // since its final you can create child enums
        // types is Week


        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hey how are you??");
        }
        // This is not public or protected, only privet and default
        // why? we don't want to create a new object
        // this is not a enum concept, that why.

        // internally public static final week Monday = new Week();

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();

        System.out.println(Week.valueOf("Monday"));
//        for (Week day:Week.values()){
//            System.out.println(day);
//        }
//        System.out.println(week.ordinal());
    }
}