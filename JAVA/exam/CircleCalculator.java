import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the raduis:");
        double r=sc.nextDouble();

        double area=Math.PI*r*r;
        double circumference=2*Math.PI*r;

        System.out.printf("Area of a Circle %.2f%n",area);
        System.out.printf("Circumference of a Circle %.2f%n",circumference);
}
}