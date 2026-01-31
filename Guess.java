import java.util.Scanner;


public class Guess {
    
    public static void main(String[] args) {
        int my_number=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);

        int user_input;       
        do{
            System.out.print("Guess the number between(1-100): ");
            user_input=sc.nextInt();
            if(user_input==my_number){
                System.out.println("Wow! your number is correct");
                break;}
            else if (user_input>my_number){
                System.out.println("Your number is too high");
            }
            else{
                System.out.println("Your number is too low");

            }

       

    }while(user_input>=0);
    sc.close();
}}
