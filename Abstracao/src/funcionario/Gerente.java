
package funcionario;


public class Gerente extends Funcionario{
    
    @Override
    public void bonificacao(){
        setBonificacao(getSalario() * 0.10);
        
    }
    
}
