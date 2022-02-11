package DesafioURI;

/*
Leia 3 valores, no caso, variáveis A, B e C, que
são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota
A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de
0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a variável MEDIA conforme exemplo abaixo,
com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas,
não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */

import java.io.IOException;
import java.util.Scanner;

public class UriCinco {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua primeira nota ?");
        double notaUm = sc.nextDouble();

        System.out.println("Qual sua segunda nota ?");
        double notaDois = sc.nextDouble();

        System.out.println("Qual sua terceira nota ?");
        double notaTres = sc.nextDouble();

        double media = ((notaUm * 2) + (notaDois * 3) + (notaTres * 5))/10;

        System.out.println(String.format("Media = %.1f", media));

    }
}
