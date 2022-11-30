package Exceptions.javaPilha;

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

        for(int i=0; i<5; i++) {
            System.out.println(i);
        }

        System.out.println("Fim metodo2");
    }

}
