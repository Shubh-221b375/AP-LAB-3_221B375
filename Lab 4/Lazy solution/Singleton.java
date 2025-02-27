public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}  // Private constructor to prevent instantiation

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy Singleton Instance Created!");
    }
}
