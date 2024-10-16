import java.math.BigInteger;
import java.util.Scanner;

public class LargeNumberFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        BigInteger factorial=BigInteger.ONE;

        for(int i=2;i<=num;i++){
        	factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);


    }
}
