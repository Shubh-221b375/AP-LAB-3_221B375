// Two class definition (extends One)
class Two extends One {
    // Constructor of Two class that calls the parameterized constructor of One
    Two(int x) {
        super(x);  // Calls the constructor of One with parameter x
        System.out.println("Two's constructor called with x = " + x);
    }
}
