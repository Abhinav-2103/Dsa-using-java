import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
// Data Types
        float pi=3.14F;
        System.out.println("Value of pi: " + pi);
// Strings
        String Name ="Aman";
        String Name2=Name.replace("A", "E");
        System.out.println(Name2);
        System.out.println(Name.length());

//substrings
        String greeting="Hello, World!";
        String sub=greeting.substring(7,12);
        System.out.println(sub);

// Arrays
        int[] marks=new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=99;
        System.out.println(marks[1]);
// Sorting an array
        Arrays.sort(marks);
        System.out.println(marks[1]);

        int[][] finalmarks={{97,98,99},{95,96,97}};
        System.out.println(finalmarks[1][0]);

// Type Casting
        int a=10;
        int b=a+(int)20.11;
        System.out.println(b);


// Constants
        final float PI=3.14F;
        System.out.println(PI);


// Math functions
        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));
        System.out.println(Math.sqrt(16)); 

// User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Hello, " + name);
        sc.close();

//switch case
        int day=3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

// Loops
        for(int i=1;i<=5;i++){
            System.out.println("Iteration: " + i);
        }

        int j=1;
        while(j<=5){
            System.out.println("While Loop Iteration: " + j);
            j++;
        }
        int k=1;
        do{
            System.out.println("Do-While Loop Iteration: " + k);
            k++;
        }while(k<=5);

//break and continue
        for(int i=1;i<=10;i++){
            if(i==5){
                continue; // Skip iteration when i is 5
            }
            if(i==8){
                break; // Exit loop when i is 8
            }
            System.out.println("Value: " + i);
        }

//Exceptions
        try{
            int division=10/0;
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
}


//oops
        class Car {
            String color;
            String model;

            void start() {
                System.out.println("Car started");
            }
        }
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar.start(); 

    }}