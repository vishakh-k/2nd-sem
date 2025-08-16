import java.util.Scanner;

public class FactorailWhileLoop {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit for ur factorail numbers");
        int limit=sc.nextInt();
        int num=1;
        int fact=1;
        while(num<=limit){
            fact=fact*num;
            System.out.println("The factorail of7 "+num+" is :"+fact);
            num++;
        }
        sc.close();
    }
}
