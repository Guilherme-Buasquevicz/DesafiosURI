package DesafioURI;

/*
Leia dois valores inteiros. A seguir, calcule o
produto entre estes dois valores e atribua esta operação à
variável PROD.
A seguir mostre a variável PROD com mensagem correspondente.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a variável PROD conforme exemplo abaixo, com um
espaço em branco antes e depois da igualdade.
Não esqueça de imprimir o fim de linha após o produto,
caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */
import java.io.IOException;
import java.util.Scanner;

public class UriTres {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do primeiro numero ? ");
        double valorUm = sc.nextDouble();

        System.out.println("Qual o valor do segundo numero ? ");
        double valorDois = sc.nextDouble();

        double prod = valorUm * valorDois;

        System.out.println("O valor do produto é " + prod);
    }
}
