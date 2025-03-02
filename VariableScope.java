public class VariableScope {
    // Declare global variable
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print global count from main
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call showScope method
        showScope();
    }

    public static void showScope() {
        // Declare local variable
        int localCount = 50;
        
        // Print global and local counts from showScope
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
