package com.gendalf.firstproj;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 2;
        short f = 2;
        byte g = 17;
        long t = 1111;
        System.out.println(a);
        System.out.println(a + " " + a);
        float b = 5.9f;
        double c = 5.9;
        System.out.println(b + c);

        boolean fas = false;

        System.out.println(a != f);
        char lll = 98;
        System.out.println(lll);
        int ggg = lll;
        System.out.println(ggg);
        if (b == c || b == c) {
            System.out.println("ровно");
        } else if (1 > 2) {
            System.out.println("не ровно");
        } else {
            System.out.println("geg");
        }
        int v = 2;
        int l = 3;
        int n = 5;
        if (v > l && v > n) {
            System.out.println(v);
        } else if (l > v && l > n) {
            System.out.println(l);
        } else if (n > v && n > l) {
            System.out.println(n);
        }


        // Найти большее из 3 чисел
        // Из заглавной сделать мальенькую,из маленькой заглавную
        // из 4 знач числа вывести 2 последние цифры

    }
}
