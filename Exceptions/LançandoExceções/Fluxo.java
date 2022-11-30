package Exceptions.LançandoExceções;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fim main");

    }

    public static void metodo1() {
        System.out.println("Inicio metodo1");
        metodo2();
        System.out.println("Fim metodo1");
    }

    public static void metodo2() {
        System.out.println("Inicio metodo2");
        ArithmeticException e = new ArithmeticException("Deu errado");
        throw e;
        //System.out.println("Fim metodo2");
    }

}
