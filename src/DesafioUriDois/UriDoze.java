package DesafioUriDois;

/*

 QUESTÃO
 Leia os quatro valores correspondentes aos eixos x e y de dois pontos
 quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
 mostrando 4 casas decimais após a vírgula, segundo a fórmula: http://prntscr.com/jvxvhv

 ENTRADA

 O arquivo de entrada contém duas linhas de dados. A primeira linha contém
 dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores
 de ponto flutuante x2 y2.

 SAÍDA
 Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
*/

import java.io.IOException;
import java.util.Scanner;

public class UriDoze {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor de x1 ");
        double X1 = sc.nextDouble();

        System.out.println("Qual o valor de X2 ");
        double X2 = sc.nextDouble();

        System.out.println("Qual o valor de Y1 ");
        double Y1 = sc.nextDouble();

        System.out.println("Qual o valor de Y2 ");
        double Y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow((X2 - X1),2) + Math.pow((Y2 - Y1),2));

        System.out.println(String.format("%.4f", distancia));
    }
}
