package com.beecrowd.c01_begginer.n1002;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;
        double area = PI * (Math.pow(scanner.nextDouble(), 2));

        System.out.printf("A=%.4f%n", area);

    }
}
