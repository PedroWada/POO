import java.math.BigDecimal;

public final class Presidente extends Funcionario implements Autenticavel{
    private BigDecimal cota;

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
    
    public BigDecimal calculaSalario(){
        return super.salarioBase.add(cota);
    }



    @Override
    public String toString() {
        return "Presidente   "+"Nome:" + nome + "|" + "Codigo do funcionário:" + codigo + "|" + "Salário:" + calculaSalario() + "|";
    }

    @Override
    public void autenticar() {
        System.out.println("Presidente Logado! ");
    }



    
}
