import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
        Scanner r = new Scanner(System.in);

        System.out.println("Please enter an int");
        int one = r.nextInt();

        r.nextLine();

        System.out.println("Please enter an another int");
        int two = r.nextInt();

        r.nextLine();

        System.out.println("Would you like to add or subtract the ints? A or S");
        String answer = r.nextLine();
        if(answer.equals('A') || answer.equals('a')){
            System.out.println("Sum of the two numbers: "+(one+two));
        }
        else if(answer.equals('S') || answer.equals('s')){
            System.out.println("Difference of the two numbers: "+(one-two));
        }
        else{
            System.out.println("Invalid answer.");
        }
    }
}