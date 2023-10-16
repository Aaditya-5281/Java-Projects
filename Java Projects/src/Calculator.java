import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ans = 0.0; // Use a double for floating-point results

        while (true) {
            System.out.println("Enter an Operator (+, -, *, /, %) or 'x' to exit: ");
            char op = in.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Exiting the calculator. Final result is: " + ans);
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("Enter Two Numbers: ");
                double num1 = in.nextDouble();
                double num2 = in.nextDouble();

                switch (op) {
                    case '+':
                        ans = num1 + num2;
                        System.out.println(ans);
                        break;
                    case '-':
                        ans = num1 - num2;
                        System.out.println(ans);
                        break;
                    case '*':
                        ans = num1 * num2;
                        System.out.println(ans);
                        break;
                    case '/':
                        if (num2 != 0) {
                            ans = num1 / num2;
                            System.out.println(ans);
                        } else {
                            System.out.println("Division by zero is not allowed.");
                        }
                        break;
                }
            } else {
                System.out.println("Invalid Operator");
            }
        }
    }
}
