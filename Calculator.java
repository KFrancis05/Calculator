import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
        Scanner r = new Scanner(System.in);

        System.out.println("Please enter an int");
        int one = r.nextInt();

        r.nextLine();

        System.out.println("Please enter an another int");
        int two = r.nextInt();

        System.out.println("Sum of the two numbers: "+(one+two));
    }
}