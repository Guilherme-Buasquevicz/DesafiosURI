package DesafioURI;

import java.io.IOException;
import java.util.Scanner;

public class UriSeis {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o primeiro valor ?");
        double A = sc.nextDouble();

        System.out.println("Qual é o segundo valor ?");
        double B = sc.nextDouble();

        System.out.println("Qual é o terceiro valor ?");
        double C = sc.nextDouble();

        System.out.println("Qual é o qaurto valor ?");
        double D = sc.nextDouble();

        double diferenca = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + diferenca);

    }
}
