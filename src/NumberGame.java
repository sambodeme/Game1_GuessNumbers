import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args){
        int value = (int)(Math.random() * 100) +1;
        System.out.println("I have randomly chosen a number between [1, 100]");
        System.out.println("Try to guess it.");
        System.out.println("You have 10 guess(es) left:");
        Scanner inputValue = new Scanner(System.in);
        for (int i = 1; i < 10 ; i++) {
            int userInput= inputValue.nextInt();
            if (userInput > value){
                System.out.println("It's smaller than "+userInput);
                System.out.println("You have "+ (10 - i) +" guess(es) left:");
            }
            else if (value > userInput){
                System.out.println("It's bigger than "+userInput);
                System.out.println("You have "+ (10 - i) +" guess(es) left:");
            }
            else {
                System.out.println("CORRECT ... YOU WIN!");
                System.out.print(value);
                break;
            }
        }
    }
}
