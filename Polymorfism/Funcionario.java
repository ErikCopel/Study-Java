package Polymorfism;

public class Funcionario {
    
    private double salario;
    private String nome;
    
    public double getBonificacao() {
        return getSalario();
    }

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
