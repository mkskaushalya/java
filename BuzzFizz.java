import java.util.Scanner;

public class BuzzFizz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        int Fizz = number % 5;
        int Buzz = number % 3;
        // System.out.println(Fizz + " " + Buzz);
        if(Fizz == 0 && Buzz == 0){
            System.out.println("FizzBuzz");
        }else if(Fizz == 0 && Buzz != 0){
            System.out.println("Fizz");
        }else if(Fizz != 0 && Buzz == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(number);
        }
        

    }
}
