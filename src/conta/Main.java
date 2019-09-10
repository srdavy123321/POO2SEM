
package conta;


public class Main {
    public static void main(String[] args) {
            
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Conta c3 = new Conta();
        
        c1.numeroAgencia = "124,124";
        c1.numeroConta = "298365982765923";
        
        c2.numeroAgencia = "123.123";
        c2.numeroConta = "1824572364512794";
        
        c3.numeroAgencia = "123.123";
        c3.numeroConta = "8174518365418234";
        
        c1.depositar(c1, 800);
        c2.depositar(c2, 1000);
        c1.transferir(c2, 400);
        
  
    }
    
}
