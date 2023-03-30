public class tes {
    public static void main(String[] args) {
        /**给定数列 1, 1, 1, 3, 5, 9, 17, …，从第 4 项开始，每项都是前 3 项的和,求 第 20190324 项的最后 4 位数字。*/
        int a = 1, b = 1, c = 1;
        // 要是求第四项，则i < 4, 同理推得求20190324，则i < 20190324。
        //System.out.println(56991269%10000);
        for (int i = 3; i < 20190324; i++) {
            int temp = (a + b + c) % 10000;

            a = b;
            b = c;
            c = temp;
        }
        System.out.println(c);
    }
}
