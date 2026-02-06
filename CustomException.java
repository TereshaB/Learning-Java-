
// Custom exception class
class Arithmeticexception extends Exception {
    public Arithmeticexception(String message) {
        super(message);
    }
}

// Main class
public class CustomException {
    
    static int divide(int a, int b) throws Arithmeticexception {
        if (b == 0) {
            throw new Arithmeticexception("Division by zero is not allowed");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        try {
            int result = divide(100, 0);
            System.out.println(result);
        } catch (Arithmeticexception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

