import java.math.BigDecimal;

public class Funcionario{

        private int codigo;
        private String nome;
        private BigDecimal salario = 1000.0;

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

        public BigDecimal salario(){
            return salario;
        }
        
}