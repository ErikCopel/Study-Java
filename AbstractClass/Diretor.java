package AbstractClass;

public class Diretor extends Funcionario {
    
    public double getBonificacao() {
        
        System.out.println("Bonificação DIRETOR");
        return super.getSalario() + 1000;

    }
}
