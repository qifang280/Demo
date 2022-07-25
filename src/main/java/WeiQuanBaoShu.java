import java.util.Scanner;

public class WeiQuanBaoShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        boolean[] arr = new boolean[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        int index = 0;
        int countNum = 0;
        int leftCount = len;
        do {
            if (arr[index]) {
                countNum++;
                if (countNum==3) {
                    arr[index] = false;
                    leftCount--;
                    countNum = 0;
                }
            }

            index++;
            if (index==len) {
                index = 0;
            }
        }while (leftCount>1);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                System.out.println(i);
            }
        }

    }
}
