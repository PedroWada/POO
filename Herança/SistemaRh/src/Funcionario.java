import java.math.BigDecimal;

public abstract class Funcionario{

        protected int codigo;
        protected String nome;
        protected BigDecimal salarioBase ;

        public Funcionario(String nome, int codigo, BigDecimal salarioBase) {
            this.nome = nome;
            this.codigo = codigo;
            this.salarioBase = salarioBase;
        }
        
        public int getCodigo() {
            return codigo;
        }
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        
    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public abstract BigDecimal calculaSalario();

    @Override
    public abstract String toString();
    

    
        
}