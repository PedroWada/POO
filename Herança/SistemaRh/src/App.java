import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario funcionario1 = new Engenheiro("Caio",  135, new BigDecimal("2500"), "Civil", 150);
       Funcionario funcionario2 = new Presidente("Raphael", 150, new BigDecimal("4500"), new BigDecimal("7000"));
       Funcionario funcionario3 = new Gerente("Joana", 125, new BigDecimal("3600"), "Juridico", new BigDecimal("2200"));

       System.out.println(funcionario1.converterParaTexto());
       System.out.println(funcionario2.converterParaTexto());
       System.out.println(funcionario3.converterParaTexto());
    }
}
