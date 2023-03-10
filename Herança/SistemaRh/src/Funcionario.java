import java.math.BigDecimal;

public abstract class Funcionario{

        private int codigo;
        private String nome;
        private BigDecimal salarioBase;

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

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    } 

    public abstract BigDecimal calculaSalario();

    public abstract String converterParaTexto();
    
    

       
        
}