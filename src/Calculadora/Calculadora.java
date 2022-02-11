package Calculadora;

public class Calculadora {
    private double valorUm;
    private double valorDois;
    private double total;

    public void somar(){
        total = valorUm + valorDois;
        System.out.println("A Adição de " + valorUm + " + " + valorDois + " = " + total);
    }

    public void subtrair(){
        total = valorUm - valorDois;
        System.out.println("A Subtração de " + valorUm + " - " + valorDois + " = " + total);
    }

    public void mutiplicar(){
        total = valorUm * valorDois;
        System.out.println("A Multiplicação de " + valorUm + " X " + valorDois + " = " + total);
    }

    public void dividir(){
        total = valorUm / valorDois;
        System.out.println("A divisão de " + valorUm + " / " + valorDois + " = " + total);
    }

    public void setValorUm(double valorUm) {
        this.valorUm = valorUm;
    }

    public void setValorDois(double valorDois) {
        this.valorDois = valorDois;
    }

}
