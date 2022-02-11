package DesafioUriDois;

import java.io.IOException;
import java.util.Scanner;

public class UriQuinze {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos segundos ?");
        int Segundos = sc.nextInt();

        int horas = Segundos / 3600;
        Segundos -= horas * 3600;

        int minutos = Segundos / 60;
        Segundos -= minutos * 60;

        int segundos = Segundos;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
