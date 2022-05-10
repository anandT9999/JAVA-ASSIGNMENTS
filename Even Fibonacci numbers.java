import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        do
        {
            sum = a + b;
            a = b;
            b = sum;

            if (b % 2 == 0)
                sum = sum + b;
        }
        while (b < 4000000);
        System.out.println(sum);
    }
}