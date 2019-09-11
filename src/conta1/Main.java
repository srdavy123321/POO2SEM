
package conta1;


public class Main {
    public static void main(String[] args) {

        Conta1 c1 = new Conta1();
        Conta1 c2 = new Conta1();
        
        c1.depositar(c1, 100);
        c2.depositar(c2, 500);
        
        
        c1.sacar(100);
        c2.sacar(400);
        
        Conta1.emprestimo(5000, 1500, c2);

    }

}