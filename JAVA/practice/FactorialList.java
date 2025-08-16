public class FactorialList {
    public static void main(String[] args) {
        int num = 1;  // Start from 1
        while (num <= 10) {
            long fact = 1;
            
            // Print the formula first
            System.out.print("Factorial of " + num + " = ");
            
            // Print the multiplication sequence
            int i = num;
            while (i >= 1) {
                System.out.print(i);
                
                if (i > 1) {
                    System.out.print(" * ");
                }
                
                fact *= i;
                i--;
            }
            
            // Print the final result
            System.out.println(" = " + fact);
            
            num++;  // Move to next number
        }
    }
}