import java.util.Scanner;

public class Menu_Driven_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0; // initialize choice

        while (choice != 4) {
            // Display the menu
            System.out.println("\nMenu:");
            System.out.println("1) Calculate the sum of integers from 1 to m");
            System.out.println("2) Calculate the factorial of a given number");
            System.out.println("3) Display the leftmost digit of a given number");
            System.out.println("4) Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value of m: ");
                    int m = sc.nextInt();
                    int sum = 0;
                    int i = 1;
                    while (i <= m) {
                        sum += i;
                        i++;
                    }
                    System.out.println("Sum of integers from 1 to " + m + " is: " + sum);
                    break;

                case 2:
                    System.out.print("Enter the number to calculate factorial: ");
                    int n = sc.nextInt();
                    long factorial = 1;
                    int j = 1;
                    while (j <= n) {
                        factorial *= j;
                        j++;
                    }
                    System.out.println("Factorial of " + n + " is: " + factorial);
                    break;

                case 3:
                    System.out.print("Enter a number to find its leftmost digit: ");
                    int num = sc.nextInt();
                    int leftmost = num;
                    while (leftmost >= 10) {
                        leftmost /= 10;
                    }
                    System.out.println("Leftmost digit of " + num + " is: " + leftmost);
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        }

        sc.close();
    }
}