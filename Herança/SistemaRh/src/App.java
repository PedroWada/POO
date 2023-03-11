import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        
        Engenheiro pedro = new Engenheiro("Pedro",  135, new BigDecimal("2500"), "Civil", 150);
        Presidente caio = new Presidente("Caio", 150, new BigDecimal("4500"), new BigDecimal("7000"));
        Gerente cintia = new Gerente("Cintia", 125, new BigDecimal("3600"), "Juridico", new BigDecimal("2200"));

        var folhaDePagamento = new FolhaDePagamento();
        folhaDePagamento.registrar(pedro);
        folhaDePagamento.registrar(caio);
        folhaDePagamento.registrar(cintia);
        System.out.println(folhaDePagamento.getTotalDaFolhaDePagamento());

        folhaDePagamento.login(cintia);
        folhaDePagamento.login(caio);

    }
}
