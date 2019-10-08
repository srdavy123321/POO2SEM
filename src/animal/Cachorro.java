
package animal;


public class Cachorro extends Animal{
    
    private boolean raboCAchorro;
    
    public Cachorro(String cor,double peso, boolean raboCachorro){
       super(cor, peso);
        this.raboCAchorro = raboCachorro;
    }

    public boolean isRaboCAchorro() {
        return raboCAchorro;
    }

    public void setRaboCAchorro(boolean raboCAchorro) {
        this.raboCAchorro = raboCAchorro;
    }
    
}
