package DesafioURI;

import java.io.IOException;
import java.util.Scanner;

/*
A fórmula para calcular a área de uma circunferência é: area = pi . raio2.
 Considerando para este problema que pi = 3.14159:
 - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por pi.

 ENTRADA
 A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

 SAÍDA
 Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme
 exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de
 dupla precisão (double). Como todos os problemas, não esqueça de imprimir
 o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */

public class UriDois {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do raio ? ");
        double raio = sc.nextDouble();

        double area = 3.14159 * (raio * raio);

        System.out.println("A=" + area );
    }
}
