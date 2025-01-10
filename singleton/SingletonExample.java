package singleton;

public class SingletonExample {

    // Private constructor to restrict instantiation
    private SingletonExample() {
        // Optional: Prevent instantiation via reflection
        if (Holder.INSTANCE != null) {
            throw new RuntimeException("Instance already created");
        }
    }

    // Static inner class for holding the singleton instance
    private static class Holder {
        private static final SingletonExample INSTANCE = new SingletonExample();
    }

    // Public method to provide access to the singleton instance
    public static SingletonExample getInstance() {
        return Holder.INSTANCE;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
