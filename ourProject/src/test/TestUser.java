public class TestUser {
    public static void test() {
        User u = new User("U01", "Lan", "lan@example.com");
        u.showInfo();
        System.out.println("Valid? " + u.isValid());

        u.setEmail("lanexample.com");
        System.out.println("After invalid email set. Valid? " + u.isValid());
    }

    public static void main(String[] args) {
        test();
    }
}
