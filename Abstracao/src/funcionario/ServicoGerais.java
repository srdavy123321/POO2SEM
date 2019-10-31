
package funcionario;


public class ServicoGerais extends Funcionario{
    
    @Override
    public void bonificacao(){
        setBonificacao(getSalario() * 0.07);
    }
    
}
