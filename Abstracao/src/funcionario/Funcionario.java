
package funcionario;


public abstract class Funcionario {
    
    private double salario;
    private double bonificacao;
    
    public abstract void bonificacao();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    
}
