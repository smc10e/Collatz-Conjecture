import java.util.Scanner;

/**
 * Created by smcampbell on 10/7/2015.
 * This program takes in number from user input and returns the number
 * of steps it takes to reach 1 using the Collatz Conjecture. The basic
 * idea is that the number is divided by two if the number is even and if
 * odd its multiplied by 3 and then has 1 added to it. The resulting value
 * is then put through this same algorithm until the resulting value
 * eventually is 1.
 */
public class Collatz_Conjecture {

    public static void main(String[] args){

        int number;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Collatz Conjecture Algorithm");
        System.out.print("Please enter a number greater than 0: ");
        number = scanner.nextInt();

        while(number <= 0){
            System.out.println("Initial number must be greater than 0");
            System.out.print("Please enter a number greater than 0: ");
            number = scanner.nextInt();
        }
        if(number == 1){
            System.out.println("Step 1: " + number);
        }
        while(number != 1) {
            counter++;
            if (number % 2 == 0) {
                number = number/2;
            }
            else{
                number = 3*number + 1;
            }
            System.out.println("Step " + counter + ": " + number);
        }
        System.out.println("It takes " + counter + " steps to reach 1.");
    }
}
