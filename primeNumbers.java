import java.util.Scanner;
public class primeNumbers {
    public static void primeN(int num) {
        boolean result = false;
        int counter = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number:");
        num = inp.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("prime is");
        } else {
            System.out.println("prime is not");
        }primeN(2);

    }

    public static void main (String[]args){
        primeN(2);
    }
}
