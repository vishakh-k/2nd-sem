public class OuterClass {
    private int privateData = 42;

    // Inner class
    class InnerClass {
        void display() {
            // Accessing private member of OuterClass
            System.out.println("Private data from OuterClass: " + privateData);
        }
    }

    public static void main(String[] args) {
        // Create OuterClass object
        OuterClass outer = new OuterClass();

        // Create InnerClass object using OuterClass object
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Access method of inner class
        inner.display();
    }
}
