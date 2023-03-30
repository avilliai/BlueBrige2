import java.util.Scanner;

public class selectCount {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int n = input.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                String target = String.valueOf(i);
                if (target.contains("2") || target.contains("0") || target.contains("1")
                        || target.contains("9")) {
                    sum += i;
                }
            }
            System.out.println(sum);
        } catch (Exception e) {
            input.close();
        }
    }
}

