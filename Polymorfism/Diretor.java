package Polymorfism;

public class Diretor extends Funcionario {
    
    public double getBonificacao() {
        
        System.out.println("Bonificação DIRETOR");
        return super.getBonificacao() + 1000;

    }
}
