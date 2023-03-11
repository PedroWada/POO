import java.math.BigDecimal;

public class Engenheiro extends Funcionario{

    private String departamento;
    private int crea;
    private BigDecimal adicao = new BigDecimal(0.5);


    public Engenheiro(String nome, int codigo, BigDecimal salarioBase, String departamento, int crea) {
        super(nome, codigo, salarioBase);
        this.departamento = departamento;
        this.crea = crea;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getCrea() {
        return crea;
    }
    public void setCrea(int crea) {
        this.crea = crea;
    }

    @Override
    public BigDecimal calculaSalario() {
        return super.salarioBase.add(salarioBase.multiply(adicao));
    }
    
 @Override
 public String toString() {
     return "Engenheiro   "+"Nome:" + nome + "|" + "Codigo do funcionário:" + codigo + "|" + "Salário:" + calculaSalario() + "|" 
      + "Departamento:" + departamento + "|" + "Crea:" + crea;
 }
}
