package Exceptions.TratamentoExceções;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fim main");

    }

    public static void metodo1() {
        System.out.println("Inicio metodo1");
        
        try {
            metodo2();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException ");
            e.printStackTrace();
        }

        System.out.println("Fim metodo1");
    }

    public static void metodo2() {
        System.out.println("Inicio metodo2");

        for(int i=0; i<5; i++) {
            System.out.println(i);
            int a = 3 / 0;
        }

        System.out.println("Fim metodo2");
    }

}
