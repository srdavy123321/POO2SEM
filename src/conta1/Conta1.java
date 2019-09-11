
package conta1;


public class Conta1 {
    public String numeroAgencia;
    public String numeroConta;
    public double saldo;

    public void depositar(Conta1 c1, double valor){
        if (valor > 0 && c1 != null){
            c1.saldo += valor;
            System.out.println("Deposito realizado com sucesso");
            System.out.println("Novo Saldo :"+c1.saldo);


        }

    }
    
    
    
    public void transferir(Conta1 contaDestino, double valor){
        if(this.saldo >= valor && contaDestino !=null ){
        contaDestino.saldo += valor;
            System.out.println("Transferencia realizada!");
            System.out.println("Novo saldo; "+this.saldo);
            System.out.println("Novo saldo C. Destino; "+contaDestino.saldo);
        }
        

    } 
    
    public static void emprestimo(double valor, double renda, Conta1 c1){
        if(valor > 0 && (renda >= 988 && renda <= 2000)){
            System.out.println("Emprestimo até: "+5000);
            System.out.println("Emprestimo Realizado!");
            c1.saldo = 5000;
            
        }
        
    }
    
    public void sacar(double valor){
        if(valor <= 0 || valor > saldo){
            System.out.println("Saque não realizado!");
        }else{
            this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Novo saldo: "+this.saldo);
            
        }
    }

    
   
}