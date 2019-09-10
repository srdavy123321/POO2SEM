
package conta;


public class Conta {
    public String numeroAgencia;
    public String numeroConta;
    public double saldo;
    
    public void depositar(Conta c1, double valor){
        if (valor > 0 && c1 != null){
            c1.saldo += valor;
            System.out.println("Deposito realizado com sucesso");
            System.out.println("Novo Saldo :"+c1.saldo);
            
            
        }
       
    }
    public void transferir(Conta contaDestino, double valor){
        if(this.saldo >= valor && contaDestino !=null ){
        contaDestino.saldo += valor;
            System.out.println("Transferencia realizada!");
            System.out.println("Novo saldo; "+this.saldo);
            System.out.println("Novo saldo C. Destino; "+contaDestino.saldo);
        }
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
