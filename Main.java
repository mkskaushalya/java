import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;
public class Main{
    public static void main(String[] args){

        Test testdata = new Test();
        System.out.println(testdata.x + " " + testdata.name);

        // Data types
        // byte age = 30;
        // long viewsCount = 3_123_456_789L;
        // String name = "Sahan";
        // double price = 10.2552;
        // float weight = 50.64F;
        // boolean isEligible = true;
        // char characther= 'A';
        // Date now = new Date();
        
        // Point point1 = new Point(1, 1);
        // Point point2 = point1;
        // System.out.println('y');

        // ==== String ====

        // String message = new String("Sahan Kaushalya");
        // String fullName = "Sahan" + "Kaushalya";
        // System.out.println(fullName.endsWith("ya"));
        // System.out.println(fullName.startsWith("sa"));
        // System.out.println(fullName.startsWith("sa"));

        // System.out.println(fullName.length());

        // System.out.println(fullName.indexOf("F"));

        // String name = "Sahan\nKaushalya";
        // System.out.println(name);
        // ===== 1D Array ======
        // int[] numbers = new int[5];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[2] = 3;
        // numbers[3] = 4;
        // numbers[4] = 5;
        // System.out.println(Arrays.toString(numbers));

        // 3D Array
        // int[][][] numbers = new int[2][3][2];
        // numbers[0][0][0] = 0;
        // numbers[0][1][0] = 1;
        // numbers[0][2][0] = 2;
        // numbers[1][0][0] = 3;
        // numbers[1][1][0] = 4;
        // numbers[1][2][0] = 5;
        
        // numbers[0][0][1] = 6;
        // numbers[0][1][1] = 7;
        // numbers[0][2][1] = 8;
        // numbers[1][0][1] = 9;
        // numbers[1][1][1] = 10;
        // numbers[1][2][1] = 11;
        // System.out.println(Arrays.deepToString(numbers));

        // Constant
        // final float pi = 3.14F;
        // // pi = 1;
        // System.out.println(pi);

        // =========== Arithmatic operator =========



        // ====== Convert String to number =====
        // String x = "123";
        // int y = Integer.parseInt(x) + 2;
        // System.out.println(y);

        // ==== Usefull methods
        // int results = Math.round(1.5F);
        // System.out.println(results);

        // int results = (int)Math.ceil(1.1F);
        // System.out.println(results);
        
        // int results = (int)Math.floor(1.1F);
        // System.out.println(results);

        // int results = (int)Math.min(3, 5);
        // System.out.println(results);

        // int random = (int)Math.round(Math.random() * 100);
        // System.out.println(random);

        // int random = (int)(Math.random() * 100);
        // System.out.println(random);

        // ===== Number Formating
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String results = currency.format(123456.789);
        // System.out.println(results);

        // NumberFormat percent = NumberFormat.getPercentInstance();
        // String results2 = percent.format(0.1555);
        // System.out.println(results2);
        // ====== Input ======
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Name:");
        // String name = scanner.nextLine().trim();
        // System.out.println(name);

        // calcute();



        // ===== For loops =====
        // for(int i = 1; i<=5; i++){
        //     System.out.println("Hello World!");
        // }

        // for(int i = 5; i >= 1; i--){
        //     System.out.println("Hello World! " + i);
        // }

        //  ===== While Loop ======
        // int i = 1;
        // while(i <= 10){
        //     System.out.println("Hello World! " + i);
        //     i++;
        // }

        // Do While Loop
        // do {
        //     System.out.println("Hello World! " + i);
        //     i++;
        // } while(i < 10);
    }

    // private static void calcute() {
    //     Scanner scanner = new Scanner(System.in);


    //     System.out.print("Principal:");
    //     float P = scanner.nextFloat();
    //     System.out.print("Annual Interest Rate:");
    //     float R = scanner.nextFloat();
    //     float r = R/(12*100);
    //     System.out.print("Period(Years):");
    //     float N = scanner.nextFloat();
    //     float n = N * 12;
    //     double A = Math.pow((1 + r), n);

    //     NumberFormat currency = NumberFormat.getCurrencyInstance();
    //     String M = currency.format(P * ((r*A)/(A -1)));
    //     // System.out.println(P + " " + r + " " + n);
    //     System.out.println("Mortgage: " + M);
    // }
}