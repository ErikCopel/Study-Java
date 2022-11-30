package AbstractClass;

public abstract class Funcionario {
    
    private double salario;
    private String nome;
    
    public abstract double getBonificacao();

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

}
