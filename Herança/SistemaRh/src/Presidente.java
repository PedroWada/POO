import java.math.BigDecimal;

public class Presidente extends Funcionario{
    private BigDecimal cota;

    public Presidente(BigDecimal cota) {
        this.cota = cota;
    }

    public BigDecimal getCota() {
        return cota;
    }

    public void setCota(BigDecimal cota) {
        this.cota = cota;
    }
     
    
}
