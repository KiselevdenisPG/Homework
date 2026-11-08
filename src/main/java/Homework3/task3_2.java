package Homework3;

import java.util.Scanner;
import static java.lang.System.out;

public class task3_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        out.print("Введите кол-во чисел: ");
        int num1 = in.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (num1 > 0) {
            for (int i = 0; i != num1; i++) {
                out.printf("Введите число %d: ", i + 1);
                int nums = in.nextInt();
                sum = sum + nums;
                if (nums > max) { max = nums; }
                if (nums < min) { min = nums; }
            }
            out.println("Сумма: " + (sum));
            out.println("Ср. арифметическое: " + (sum/num1));
            out.printf("maх: %d, min: %d", max, min);
        } else{
            out.println("-- Error --");
        }
    }
}