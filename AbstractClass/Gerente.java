package AbstractClass;

public class Gerente extends Funcionario {
    
    public double getBonificacao() {
        
        System.out.println("Bonificação GERENTE");
        return super.getSalario() + 500;

    }
}
