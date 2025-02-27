public class Singleton {
    // Eager initialization: Instance created at class loading
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}  // Private constructor to prevent instantiation

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Eager Singleton Instance Created!");
    }
}
