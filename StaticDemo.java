public class StaticDemo {

    static int count;

    static {
        count = 100;
        System.out.println("Static block executed. Count initialized to " + count);
    }

    StaticDemo() {
        count++;
    }

    static void displayCount() {
        System.out.println("Current count = " + count);
    }

    public static void main(String[] args) {

        System.out.println("Inside main method");

        StaticDemo.displayCount();

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        StaticDemo.displayCount();
    }
}
