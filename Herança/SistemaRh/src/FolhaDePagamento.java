import java.math.BigDecimal;

public class FolhaDePagamento {
    
    private BigDecimal totalDaFolhaDePagamento = BigDecimal.ZERO;

    public void registrar(Funcionario funcionario){
        totalDaFolhaDePagamento = totalDaFolhaDePagamento.add(funcionario.calculaSalario());
    }

    public void login(Autenticavel autenticavel){
        autenticavel.autenticar();
    }

    public BigDecimal getTotalDaFolhaDePagamento() {
        return totalDaFolhaDePagamento;
    }
}
