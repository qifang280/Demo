import java.util.Scanner;

public class SheXingJuZheng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int first = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(first);
            int sum = first;
            for (int j = i + 1; j <= num; j++) {
                sum += j;
                System.out.print(" " + sum);
            }
            System.out.println();
            first += i;
        }
    }
}
