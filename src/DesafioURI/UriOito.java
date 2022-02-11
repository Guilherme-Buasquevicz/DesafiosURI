package DesafioURI;

/*
QUESTÃO
 Faça um programa que leia o nome de um vendedor, o seu salário fixo e
 o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que
 este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar
 o total a receber no final do mês, com duas casas decimais.

 ENTRADA
 O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2
 valores de dupla precisão (double) com duas casas decimais, representando
 o salário fixo do vendedor e montante total das vendas efetuadas por este
 vendedor, respectivamente.

 SAÍDA
 Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

import java.util.Scanner;

public class UriOito {
    public static void main(String[] args) {

        double comissao = 0.15;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o nome do vendedor ?");
        String nome = sc.next();

        System.out.println("Qual é o salario fixo dele ?");
        double salarioFixo = sc.nextDouble();

        System.out.println("Quanto ele vendeu no mes em dinheiro ");
        double vendasMes = sc.nextDouble();

        double valorFinal = vendasMes * comissao;

        System.out.println("O vendedor " + nome);
        System.out.println("ganhou  " + valorFinal );
        System.out.println("então ele vai receber " + (valorFinal + salarioFixo) + " No final do mes");
    }
}
