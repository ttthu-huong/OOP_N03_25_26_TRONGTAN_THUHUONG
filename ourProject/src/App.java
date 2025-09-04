javac -version
java -version

public class Number {
    public int i;
}

public class App {
    public static void main(String[] args) {
        Number n1 = new Number(); // n1 points to a new Number object
        Number n2 = new Number(); // n2 points to another new Number object

        n1.i = 2;
        n2.i = 5;
        n1 = n2;

        n2.i = 10;
        System.out.println(n1.i); // prints 10
        n1.i = 20;
        System.out.println(n2.i); // prints 20
    }
}
