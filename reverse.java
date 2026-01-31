import java.util.*;
public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rev=0;
        for(int i=n;i>0;i=i/10){
            int digit=i%10;
            rev=rev*10 + digit;

        }
        System.out.println(rev);
sc.close();
}}