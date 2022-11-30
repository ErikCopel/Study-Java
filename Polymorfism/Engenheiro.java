package Polymorfism;

public class Engenheiro extends Funcionario {
    
    public double getBonificacao() {
        
        System.out.println("Bonificação ENGENHEIRO");
        return super.getBonificacao() + 800;

    }
}
