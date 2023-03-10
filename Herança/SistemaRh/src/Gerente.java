import java.math.BigDecimal;

public class Gerente extends Funcionario{
    private String area;
    private BigDecimal bonus;
    
    public Gerente(String nome, int codigo, BigDecimal salarioBase, String area, BigDecimal bonus) {
        super(nome, codigo, salarioBase);
        this.area = area;
        this.bonus = bonus;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public void setSalarioBase(BigDecimal salarioBase) {
        // TODO Auto-generated method stub
        super.setSalarioBase(bonus.add(salarioBase));
    }

    
    public BigDecimal calculaSalario(BigDecimal salario){
        return salario.add(this.bonus);
    }
    

}