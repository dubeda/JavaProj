import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();
	System.out.println("Enter third number: "):
	int thirdNumber = input.nextInt();	
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.printf("the sum is %d", sum);
    }
}
