import java.util.Scanner;
class loops{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        System.out.println("Enter numbers of times to print:");
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            if(i<n){ System.out.print(x+" ");
            }
            else{
                System.out.print(x);
            }
           
        }

    }
}