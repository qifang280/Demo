import java.util.Scanner;

public class ZiFu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        extracted(line);
    }

    private static void extracted(String line) {
        String a1 = "[\u4e00-\u9fa5]";
        String a2 = "[a-zA-Z]";
        String a3 = "[0-9]";
        String a4 = "\\s";
        int b1 = 0;
        int b2 = 0;
        int b3 = 0;
        int b4 = 0;
        int b5 = 0;
        char[] chars = line.toCharArray();
        String[] strings = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            strings[i] = String.valueOf(chars[i]);
        }
        for (String string : strings) {
            if (string.matches(a1)) {
                b1++;
            } else if (string.matches(a2)) {
                b2++;
            } else if (string.matches(a3)) {
                b3++;
            } else if (string.matches(a4)) {
                b4++;
            } else {
                b5++;
            }
        }
        System.out.println("汉字个数" + b1);
        System.out.println("字母个数" + b2);
        System.out.println("数字个数" + b3);
        System.out.println("空格" + b4);
        System.out.println("其他" + b5);
    }

}
