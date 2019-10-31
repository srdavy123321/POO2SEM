
package funcionario;


public class Secretaria extends Funcionario{
    
    @Override
    public void bonificacao(){
        setBonificacao(getSalario() * 0.05);
    }
    
}
