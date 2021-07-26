package day1.firstassignment.fifthactivity;


import java.util.Scanner;



// as the requirements were not so clear so in this program i am only accepting the array of prime number
//othereise user will get an error of invalid output
public class Bank {
    static boolean checkPrime(int n) {
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    static int sumPrimeArray(int a[], int size) {

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Invalid array size");
        } else {
            int primeNumber[] = new int[size];

            for (int i = 0; i < size; i++) {
                int input = scanner.nextInt();
                if (input < 0) {
                    System.out.println("Invalid input");
                    break;
                }
                if (checkPrime(input)) {
                    primeNumber[i] = input;
                } else {
                    System.out.println("Invalid input");
                    break;
                }
            }

        }
    }

}
