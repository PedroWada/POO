import java.math.BigDecimal;

public class Engenheiro extends Funcionario{

    private String departamento;
    private int crea;



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

    
    public BigDecimal calculaSalario(BigDecimal salario){
        return salario.add(salario.multiply(0.5));
    }

    @Override
    public String converterParaTexto() {
        return "Engenheiro   "+"Nome:" + nome + "|" + "Codigo do funcionário:" + codigo + "|" + "Salário:" + salarioBase + "|"  + "Departamento:" + departamento + "|" + "Crea:" + crea;
    }
    
}
