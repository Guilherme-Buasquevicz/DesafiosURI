package DesafioURI;

import java.util.Scanner;

public class UriDez {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o primeiro valor ?");
        int valorUm = sc.nextInt();

        System.out.println("Qual o segundo valor ?");
        int valorDois = sc.nextInt();

        System.out.println("Qual o terceiro valor ?" );
        int valorTres = sc.nextInt();

        if(valorUm > valorDois && valorUm > valorTres){
            System.out.println(valorUm + " eh o maior" );
        }else if(valorDois > valorTres ){
            System.out.println(valorDois + " eh o maior ");
        }else{
            System.out.println(valorTres + " eh o maior ");
        }

    }
}

