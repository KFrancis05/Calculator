import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
        Scanner r = new Scanner(System.in);

        System.out.println("Please enter a number");
        float one = r.nextFloat();

        r.nextLine();

        System.out.println("Please enter another number");
        float two = r.nextFloat();

        r.nextLine();

        System.out.println("What would you like to do? \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide");
        int answer = r.nextInt();
        if(answer == 1){
            System.out.println("Sum of the two numbers: "+(one+two));
        }
        else if(answer == 2){
            System.out.println("Difference of the two numbers: "+(one-two));
        }
        else if(answer == 3){
            System.out.println("Product of the two numbers: "+(one*two));
        }
        else if(answer == 4){
            if(two == 0){
                System.out.println("Error: Divide by Zero");
            }
            else{
                System.out.println("Quotient of the two numbers: "+(one/two));
            }
        }
        else{
            System.out.println("Invalid answer.");
        }
    }
}