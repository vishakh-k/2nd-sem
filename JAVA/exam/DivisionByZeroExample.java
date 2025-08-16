import java.util.Scanner;

public class DivisionByZeroExample {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator");
        int numerator=sc.nextInt();
        System.out.println("Enter the denometer");
        int denometer=sc.nextInt();
        try{
            int result=numerator/denometer;
            System.out.println("Result:"+result);
        }catch(ArithmeticException e){
            System.out.println("Exception Caught:DivisionByZero");
        }
        System.out.println("Program executed after Exception Handling");
        sc.close();
    }    
}
