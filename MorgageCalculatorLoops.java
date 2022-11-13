import java.text.NumberFormat;
import java.util.Scanner;

public class MorgageCalculatorLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float P, R, r, N, n;
        while(true){
            System.out.print("Principal ($1K - $1M):");
            P = scanner.nextFloat();
            if(P >= 1000 && P <= 1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        while(true){
            System.out.print("Annual Interest Rate:");
            R = scanner.nextFloat();
            r = R/(12*100);
            if(R > 0 && R <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than 30.");
        }        
        
        while(true){
            System.out.print("Period(Years):");
            N = scanner.nextFloat();
            n = N * 12;
            if(P > 0)
                break;
            System.out.println("Enter a real value.");
        }
        double A = Math.pow((1 + r), n);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String M = currency.format(P * ((r*A)/(A -1)));
        // System.out.println(P + " " + r + " " + n);
        System.out.println("Mortgage: " + M);
    }
}
