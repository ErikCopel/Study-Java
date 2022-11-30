package AbstractClass;

public class TestaFuncionario {
    

    public static void main(String[] args) {
        
        Gerente g1 = new Gerente();
        Diretor d1 = new Diretor();
        Engenheiro e1 = new Engenheiro();
        
        g1.setNome("Joao");
        d1.setNome("Maria");
        e1.setNome("Roberto");  

        g1.setSalario(5000);
        d1.setSalario(7000);
        e1.setSalario(4000);

        ControleBonificacao c = new ControleBonificacao();

        c.registra(g1);
        System.out.println("===================");
        c.registra(d1);
        System.out.println("===================");
        c.registra(e1);
        System.out.println("===================");
        
        System.out.println("Total = " + c.getSoma());





    }




}
