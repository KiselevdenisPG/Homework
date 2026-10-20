import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Value: ");
        int value = in.nextInt();
        if (value>10) {
            System.out.println("\nvalue > 10");
        } else {
            System.out.println("\nvalue <= 10");
        }
        int[] nums = new int[10];
        nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(nums);
        for (int i = 0; i<10; i++){
            System.out.printf("Введите %d-ый элемент массива: %n", i);
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.stream(nums).max());
        for (int i = 0; i<10; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}