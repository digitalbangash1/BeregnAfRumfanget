package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast højde");
        double h = scanner.nextDouble();

        System.out.println("Indtast radius");
        double r = scanner.nextDouble();
        var V = (Math.PI* r*r*h);
        System.out.println("Rumfanget af cylinder er = " + V);

        scanner.close();

    }
}
