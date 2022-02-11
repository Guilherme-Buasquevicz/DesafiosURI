package DesafioURI;
/*

 QUESTÃO
 Escreva um programa que leia o número de um funcionário, seu número de
 horas trabalhadas, o valor que recebe por hora e calcula o salário
 desse funcionário. A seguir, mostre o número e o salário do funcionário,
 com duas casas decimais.

 ENTRADA
 O arquivo de entrada contém 2 números inteiros e 1 número com duas casas
 decimais, representando o número, quantidade de horas trabalhadas e o valor
 que o funcionário recebe por hora trabalhada, respectivamente.

 SAÍDA
 Imprima o número e o salário do funcionário, conforme exemplo fornecido,
 com um espaço em branco antes e depois da igualdade. No caso do salário,
 também deve haver um espaço em branco após o $.
 */

import java.io.IOException;
import java.util.Scanner;

public class UriSete {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é seu id ? ");
        int id = sc.nextInt();

        System.out.println("Quantas horas você trabalha ?");
        int horaTrabalhadas = sc.nextInt();

        System.out.println("Quanto você ganha por hora ?");
        double valorHora = sc.nextDouble();

        double salario = horaTrabalhadas * valorHora;

        System.out.println("O id dele é = " + id);
        System.out.println(String.format("salario = R$ %.2f", salario));
    }
}
