
import java.util.Scanner;
public class power2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int base=sc.nextInt();
        System.out.println("enter another number");
        int power=sc.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result = result * base;
        }
        System.out.println("Result: "+result);
        

sc.close();
    }
    
}
