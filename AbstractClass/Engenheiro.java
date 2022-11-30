package AbstractClass;

public class Engenheiro extends Funcionario {
    
    public double getBonificacao() {
        
        System.out.println("Bonificação ENGENHEIRO");
        return super.getSalario() + 800;

    }
}
