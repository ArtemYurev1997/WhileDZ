package by.pvt.cash;

import java.util.Scanner;

public class WhileDZ {
    public static void main(String[] args) {

        /*for(int i = 1; i < 100; i++) {              //#1
            if(i % 7 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }*/


        /*Scanner scanner = new Scanner(System.in);  //#2
        int a = scanner.nextInt();;
        int b = scanner.nextInt();
        int sum = 0;
        for(int i = a; i < b; i++) {
            sum += i;
        }
        System.out.println(sum);
        */


       /* Scanner scanner = new Scanner(System.in); //#3
        int a = scanner.nextInt();
        int b = 0;

        while(a % 10 != 0) {
                int i = a % 10;
                a = a / 10;
                b = b * 10;
                b = b + i;
            }

            System.out.println(b);*/

       /*while(b % 10 != 0) {
            int i = 0;
            if (b % 2 == 0) {
                i = b % 10;
                System.out.print(i + " ");
            }
            else {
                i = b % 10;
                System.out.print(i + " ");
            }
            b = b / 10;
        }*/



       /* Scanner scanner = new Scanner(System.in); //#4
        int a = scanner.nextInt();
        int b = 0;
        while (a % 10 != 0) {
            if (a % 2 == 0) {
                b = a % 10;
                System.out.print(b + " ");

            }
            else {
                b = a % 10;
                System.out.print(b + " ");
            }
            a = a / 10;
        }*/
    }
}
