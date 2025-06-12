public class p2 {
    public static void main(String[] args) {
        int num=1;
        while(num<=10){
            long fact=1;

            System.out.print("Factorail of "+num+"=");
             int i=num;
             while(i>=1){
                System.out.print(i);
                if(i>1){
                    System.out.print("*");
                }
                fact=fact*i;
                i--;
             }
             num++;
             System.out.println("="+fact);
        }
    }
}