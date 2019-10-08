
package animal;


public class Gato extends Animal{
    
    private boolean GatoCareca; 

    public Gato(String cor, double peso, boolean GatoCareca) {
        super(cor, peso);
        this.GatoCareca = GatoCareca;
    }

    public Gato(String amarelo, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
