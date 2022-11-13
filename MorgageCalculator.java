import java.text.NumberFormat;
import java.util.Scanner;

public class MorgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal:");
        float P = scanner.nextFloat();
        System.out.print("Annual Interest Rate:");
        float R = scanner.nextFloat();
        float r = R/(12*100);
        System.out.print("Period(Years):");
        float N = scanner.nextFloat();
        float n = N * 12;
        double A = Math.pow((1 + r), n);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String M = currency.format(P * ((r*A)/(A -1)));
        // System.out.println(P + " " + r + " " + n);
        System.out.println("Mortgage: " + M);

    }
}

// Principal:
// Annual Interest Rate:
// Period:
// M?
//P=Principal
// r = Monthly Interest Rate
// n = number of payments(month)
//M = P((r((1 + r)^n))/((1 + r)^n -1))

