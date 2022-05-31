package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int a = n/100;
        int b = n%100/10;
        int c = n%10;
        int maxmin = Math.max(a,b);
        int maxmax = Math.max(maxmin,c);
        System.out.println("The largest digit of the number = " + maxmax);
    }
}