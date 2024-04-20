


import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {

        int n, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if(sum==n){
            System.out.println(n +  " Mükemmel bir sayıdır");

        } else  System.out.println(n +  " Mükemmel bir sayı değildir");

    }
}