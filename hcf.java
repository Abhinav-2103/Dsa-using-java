import java.util.Scanner;
public class hcf {
    public static void main(String[]agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        sc.close();
        int c;
        int hcf=1;
        if(a>b){
             c = b;}
        else{
             c=a;}        
        for(int i=1;i<=c;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
            }
        System.out.println("Hcf = " + hcf);
        }
    }
    
