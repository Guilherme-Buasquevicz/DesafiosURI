package DesafioUriDois;

/*
QUESTÃO
 Joaozinho quer calcular e mostrar a quantidade de litros de combustível
 gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. Para isso,
 ele gostaria que você o auxiliasse através de um simples programa. Para
 efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e
 a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância
 percorrida e, em seguida, calcular quantos litros seriam necessários.
 Mostre o valor com 3 casas decimais após o ponto.

 ENTRADA
 O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na
 viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).

 SAÍDA
 Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal

 */
import java.io.IOException;
import java.util.Scanner;

public class UriQuatorze {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto tempo gasto na viagem ?");
        int tempo = sc.nextInt();

        System.out.println("Qual foi a velocidade durante a viagem ?");
        int velocidade = sc.nextInt();

        double km = tempo * velocidade;

        double media = km / 12;

        System.out.println(String.format("%.3f", media));
    }
}
