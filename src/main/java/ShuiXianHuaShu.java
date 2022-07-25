public class ShuiXianHuaShu {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int i1 = i / 100;
            int i2 = (i - i1 * 100) / 10;
            int i3 = i - i1 * 100 - i2 * 10;
            if (i == i1 * i1 * i1 + i2 * i2 * i2 + i3 * i3 * i3) {
                System.out.println(i);
            }
        }
    }
}
