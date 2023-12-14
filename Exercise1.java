//Guess number game using java
//trying to understand how random number is working
import java.util.Scanner;
import java.util.Random;


class Exercise1 {
    public static void main(String[] args){
        Random random = new Random();
        String line;
        Scanner in = new Scanner(System.in); 
        System.out.println("I\'m thinking of a number between 1 and 100");
        System.out.println("Can you guess the number");
        System.out.print("Type the number you think: ");
        line = in.nextLine();
        System.out.println("Your guess number is: " + line);
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is: " + number);
        //System.out.print("You are of with: " + line -  number);
    }
}
