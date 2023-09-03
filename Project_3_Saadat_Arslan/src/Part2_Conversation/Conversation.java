package Part2_Conversation;
import java.util.Scanner;
public class Conversation {
    public static void main(String[] args) {
        Scanner AgeScanner = new Scanner(System.in);
        int Age;
        System.out.println("Please input your age. I'll assume your current daily activity ");
        Age = AgeScanner.nextInt();
        System.out.println("So your age is " + Age);
        if(Age > 0){
            if(Age < 6){
            System.out.println("You probably go to either kindergarten, or stay at home");
        }
            else if(Age < 17){
                System.out.println("You probably go to school");
            }
            else if(Age < 24){
                System.out.println("You probably go to a university");
            }
            else if(Age < 60){
                System.out.println("You probably go to work");
            }
            else if(Age < 122){
                System.out.println("You are hopefully retired by now");
            }
            else{
                System.out.println("Congratulations, you are the oldest living person");
            }
        }
    else {
            System.out.println("It is impossible to have negative age");
        }
    }
}
