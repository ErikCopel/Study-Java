package Polymorfism;

public class Gerente extends Funcionario {
    
    public double getBonificacao() {
        
        System.out.println("Bonificação GERENTE");
        return super.getBonificacao() + 500;

    }
}
