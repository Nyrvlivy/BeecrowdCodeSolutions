package com.beecrowd.c01_begginer.n1008;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int employeeNumber = scanner.nextInt();
        int workedHours = scanner.nextInt();
        double hourlyRate = scanner.nextDouble();
        scanner.close();

        double salary = workedHours * hourlyRate;

        System.out.printf("NUMBER = %d%n SALARY = U$ %.2f%n", employeeNumber, salary);
    }
}
