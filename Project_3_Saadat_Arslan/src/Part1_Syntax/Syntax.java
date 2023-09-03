package Part1_Syntax;

import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {
        boolean repeatFlag = false;
        while(!repeatFlag){
        // If/else, switch, demonstration of relational operators;
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Please input an integer");
        int UserInt = UserInput.nextInt();
        int intCase;
        if (UserInt < 0) {
            intCase = 1;
        }
        else if (UserInt > 6) {
            intCase = 2;
            //nested if/else
            if (UserInt < 9) {
                intCase = 3;
            }
            else if (UserInt >= 10){
                intCase = 4;
            }
        }
        else if (UserInt <= 3 && UserInt > 0){
            intCase = 5;
        }
        else if (UserInt != 4 && UserInt != 0 || UserInt == 5 && UserInt != 0){
            intCase = 6;
            }
        else {
            intCase = 7;
        }
        switch (intCase) {
            case 1 -> System.out.println("Your integer is less than or equal to 0");
            case 2 -> System.out.println("Your integer is larger than 6");
            case 3 -> System.out.println("Your integer is between 6 and 9");
            case 4 -> System.out.println("Your integer is larger than or equal to 10");
            case 5 -> System.out.println("Your integer is lesser than or equal to 3");
            case 6 -> System.out.println("Your integer is either equal to 5 or 6");
            case 7 -> System.out.println("Your integer is equal to 4 or zero");
        }
            System.out.println("Do you want to try again? Answer with 'yes' if you do");
        UserInput.nextLine();
        String answer = UserInput.nextLine();
            if (answer.toLowerCase().equals("yes")){
                System.out.println("Let's start over then");
            }
            else {
                repeatFlag = true;
            }
        }
    }
}
/*
    Demonstrate use of control statements: if/else, switch.
    Demonstrate relational operators: ==, !=, >, <, <=, >= inside if condition statement.
    Compare strings using String.equals() inside if condition statement.
    Demonstrate logical operators: &&, ||, ! inside if condition statement.
    Demonstrate using conditions with user input.
    Demonstrate nested if/else conditionals:
*/