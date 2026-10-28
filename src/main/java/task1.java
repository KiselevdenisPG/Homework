import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();
        System.out.print("Введите операцию (+; -; *; /): ");
        String oper = in.next();
            switch (oper) {
                case "+": System.out.print(num1 + num2); break;
                case "-": System.out.print(num1 - num2); break;
                case "*": System.out.print(num1 * num2); break;
                case "/":
                    if (num2 != 0) {
                        System.out.print(num1 / num2);
                    } else {
                        System.out.print("Error");
                    } break;
                default: System.out.print("Error"); break;
        }
    }
}
