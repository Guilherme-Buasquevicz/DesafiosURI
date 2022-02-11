package Calculadora;

public class Main {
    public static void main(String[] args) {

        Calculadora c1 = new Calculadora();
        c1.setValorUm(50);
        c1.setValorDois(10);
        c1.dividir();
        System.out.println(c1);

        System.out.println("----------------------");

        Calculadora c2 = new Calculadora();
        c2.setValorUm(1000);
        c2.setValorDois(5000);
        c2.somar();
        System.out.println(c2);

        System.out.println("----------------------");

        Calculadora c3 = new Calculadora();
        c3.setValorUm(500);
        c3.setValorDois(10);
        c3.mutiplicar();
        System.out.println(c3);

        System.out.println("----------------------");

        Calculadora c4 = new Calculadora();
        c4.setValorUm(1000);
        c4.setValorDois(500);
        c4.subtrair();
        System.out.println(c4);

    }
}
