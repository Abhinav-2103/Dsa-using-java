import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int sum=0;
        for(int i=a;i>0;i=i/10){
            int b=i%10;
            sum=sum+b;

        }
System.out.println("The sum is: "+ sum);   
sc.close(); }
    
}
