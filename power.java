import java.util.*;
public class power {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter another number");
        int b=sc.nextInt();
        int c=(int) Math.pow(a,b);
        System.out.println("The number is: "+c);

sc.close();
    }
}
