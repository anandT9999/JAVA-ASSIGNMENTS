import java.util.*;
public class Main {

    public static void main(String[] args) {

        long num = 600851475143L;
        boolean isPrime = true;
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {

                    System.out.println(i);

                }
            }   
        }
    }
}