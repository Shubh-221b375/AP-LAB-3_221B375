public abstract class Bharatvanshi {
    // Common method for all Bharatvanshis
    public void fight() {
        System.out.println(getClass().getSimpleName() + " is a great fighter.");
    }

    // Abstract methods for individual behavior
    public abstract void obey();
    public abstract void kind();
}

