package com.company;

public class Main {

    public static void main(String[] args) {
        int c = 0, a = 0, b = 1;
        int array[] = new int[20];
        for (int i = 0; i < 20; i++) {
            c = a;
            a = b;
            b = b + c;
            array[i] = b;
            System.out.print(array[i] + " ");
        }
    }
}
