import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class TwentyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        for (int i = 1; i <= 5; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter number " + i + ": ");
                String input = scanner.nextLine();
                try {
                    double number = Double.parseDouble(input);
                    
                    
                    if (number < 0) {
                        throw new NegativeNumberException("Number cannot be negative.");
                    }
                    
                    total += number;
                    validInput = true;

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                } catch (NegativeNumberException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("The total sum is: " + total);
        scanner.close();
    }
}
