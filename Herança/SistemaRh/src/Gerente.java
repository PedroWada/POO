import java.math.BigDecimal;

public class Gerente extends Funcionario implements Autenticavel{
    private String area;
    private BigDecimal bonus;
    
    public Gerente(String nome, int codigo, BigDecimal salarioBase, String area, BigDecimal bonus) {
        super(nome, codigo, salarioBase);
        this.area = area;
        this.bonus = bonus;
    }


    @Override
    public BigDecimal calculaSalario() {
        return super.salarioBase.add(getBonus());
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
    public String toString() {
        // TODO Auto-generated method stub
        return "Gerente   "+"Nome:" + nome + "|" + "Codigo do funcionário:" + codigo + "|" + "Salário:" +  calculaSalario() + "|"  + "Area:" + area + "|";
    }


    @Override
    public void autenticar() {
        System.out.println("Gerente logado");
    }

    

}