package Homework3;

import java.util.Scanner;
import static java.lang.System.out;

public class task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ATTEMPTS = 0;
        int min = 1;
        int max = 100;
        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;

        int your_num;

        do {
            out.print("Enter your number (0 - 100): ");
            your_num = in.nextInt();

            ATTEMPTS++;

            if ((your_num < 0) || (your_num > 100)) {
                out.println("-- ERROR --");
                continue;
            } else if (your_num > randomNumber) {
                out.println("-- Меньше --");
                continue;
            } else if (your_num < randomNumber) {
                out.println("-- Больше --");
                continue;
            } else if (your_num == randomNumber) {
                out.println("--- Победа ---");
                out.println("Загаданное число : " + randomNumber);
                out.println("Попыток : " + ATTEMPTS);
                break;
            }

        } while (your_num != randomNumber);
    }
}
