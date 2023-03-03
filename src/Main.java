import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int number = input.nextInt();
        int  t1 = 0, t2 = 1;

        System.out.print(number+" Elemanlı Fibonacci Serisi: ");
        for (int i = 1; i <= number; i++) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

}