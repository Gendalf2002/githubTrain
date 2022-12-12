package com.gendalf.firstproj;

import java.util.Scanner;

public class Main {
//    public static void findLustNumber(int k) {
//        k = k % 100;
//        System.out.println(k);
//    }

    public static void main(String[] args) {
//        countNumbers(0,10000);
//searchNegative(5);
//searchProcent(6,1005);
//

//        printAlphabet();
//        power(2,4);
//        //1
//        countNumbers();
//        System.out.println(fibNum(20));
        nummm(9);
//        countNumbers();

//        int v = 2;
//        int l = 3;
//        int n = 5;
//        int max = findMaxNumber(v, l, n);
//        System.out.println(max);
//
//        //2
//        Scanner scanner = new Scanner(System.in);
//        char ccc = scanner.next().charAt(0);
//        System.out.println(changeSize(ccc));
//
//        //3
//        int k = scanner.nextInt();
//        findLustNumber(k);
//    }

//    public static int findMaxNumber(int g, int y, int pp) {
//        int max = Integer.MIN_VALUE;
//        if (g > pp && g > y) {
//            max = g;
//        } else if (pp > g && pp > y) {
//            max = pp;
//        } else if (y > g && y > pp) {
//            max = y;
//        }
//        return max;
//    }
//
//    public static char changeSize(char ll) {
//        int a = ll;
//        if (65 < a && a < 90) {
//            a += 32;
//        } else {
//            a -= 32;
//
//        }
//        return (char) a;
//    }
//
//    public static void countNumbers(int start, int end) {
//        int soum = 0;
//        for (int i = start; i <= end; i++) {
//            soum = soum + i;
//            System.out.println(i + " " + soum);
//        }
//    }
//
//    public static void printAlphabet() {
//        int a = 65;
//        int o = 97;
//        for (int i = 0; i < 26; i++) {
//            System.out.println((char) (a + i) + " " + (char) (o + i));
//        }
//    }
//
//    public static void power(int a, int pow) {
//        int result = a;
//        for (int i = 1; i <= pow; i++) {
//            System.out.println(result);
//            result = a * result;
//        }
//    }


        //    public static void countNumbers() {
//        for (int i = 0; i <= 10; i++) {
//            int sum = 0;
//            sum += i * 3;
//            System.out.print(i + "*" + "3" + "=" + sum + "\n");
//        }
    }

    public static void searchNegative(int n) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if (input < 0) {
                counter++;
            }

        }
        System.out.println(counter);


    }

    public static void searchProcent(int n, double vklad) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            vklad = vklad * 0.03 + vklad;
        }
        System.out.println(vklad);
    }

    public static void searchDelitel(int k) {
        int n;
        int count = 0;
        Scanner f = new Scanner(System.in);
        n = f.nextInt();
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        ;
    }

//    public static void searchFebanachi() {
//        int g = 1;
//        int h = 1;
//        int v;
//        System.out.println(g + " " + h + " ");
//        for (int i = 3; i <= 11; i++) {
//            v = g + h;

//            System.out.print(v);
//            g = h;
//            h = v;
//            System.out.println();

//        }
//    }

    public static int fibNum(int n) {
        if (n == 1 || n == 0)
            return n;
        return fibNum(n - 1) + fibNum(n - 2);


    }

    public static void nummm(int v) {
        int foll = 5;
        while (foll < 10) {
            System.out.println(foll);
            foll++;
            if (foll == v) {
                break;


            }
        }

    }
}


// найти все делители числа n
// вывести последоват из n чисел фибаначи
//дано число фибаначи найти его номер




