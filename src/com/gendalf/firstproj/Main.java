package com.gendalf.firstproj;

import java.util.Scanner;

public class Main {
    public static void findLustNumber(int k) {
        k = k % 100;
        System.out.println(k);
    }

    public static void main(String[] args) {
//        countNumbers(0,10000);
//        printAlphabet();
        power(2,4);
//        //1
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
    }

    public static int findMaxNumber(int g, int y, int pp) {
        int max = Integer.MIN_VALUE;
        if (g > pp && g > y) {
            max = g;
        } else if (pp > g && pp > y) {
            max = pp;
        } else if (y > g && y > pp) {
            max = y;
        }
        return max;
    }

    public static char changeSize(char ll) {
        int a = ll;
        if (65 < a && a < 90) {
            a += 32;
        } else {
            a -= 32;

        }
        return (char) a;
    }

    public static void countNumbers(int start, int end) {
        int soum = 0;
        for (int i = start; i <= end; i++) {
            soum =soum + i;
            System.out.println(i+" "+soum);
        }
    }
    public static void printAlphabet(){
        int a = 65;
        int o = 97;
        for(int i = 0;i<26;i++){
            System.out.println((char)(a+i)+" "+(char)(o+i)  );
        }
    }
    public static void power(int a,int pow){
        int result = a;
        for (int i = 1;i<=pow;i++){
            System.out.println(result);
            result = a * result ;
        }
    }
    //таблица умножения на 3
    //найти кол-во отрицательных чисел , ввод с клавиатуры
    // 3%-вклад положили s руб . какой станет сумма вклада через n-лет
}




