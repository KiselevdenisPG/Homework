import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char Moscow = 1;
        char obl = 2;
        char other_reg = 3;
        System.out.print("Введите сумму: ");
        double sum = in.nextDouble();
        if (sum < 5000 && sum > 0) {
            System.out.print("Введите адресс доставки (Москва: 1; Область: 2; Др. регион: 3): ");
            double dost = in.nextDouble();
            if (dost == Moscow) {
                sum += 300;
                System.out.print("К оплате: " + sum);
            } else if (dost == obl) {
                sum += 450;
                System.out.print("К оплате: " + sum);
            } else if (dost == other_reg) {
                sum += 500;
                System.out.print("К оплате: " + sum);
            } else {
                System.out.print(">>> Error <<<");
            }
        } else if (sum < 0) {
            System.out.print(">>> Error <<<");
        } else {
            System.out.print("К оплате: " + sum);
        }
    }
}