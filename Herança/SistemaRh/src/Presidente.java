import java.math.BigDecimal;

public final class Presidente extends Funcionario{
    private BigDecimal cota;

    @Override
    public String converterParaTexto() {
        // TODO Auto-generated method stub
        return "Presidente   "+"Nome:" + nome + "|" + "Codigo do funcionário:" + codigo + "|" + "Salário:" + salarioBase + "|";
    }

    public Presidente(String nome, int codigo, BigDecimal salarioBase, BigDecimal cota) {
        super(nome, codigo, salarioBase);
        this.cota = cota;
    }

    public BigDecimal getcota() {
        return cota;
    }

   
    public void setCota(BigDecimal cota) {
        this.cota = cota;
    }
     
    
}
