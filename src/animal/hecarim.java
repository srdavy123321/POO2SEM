
package animal;

public class hecarim extends Animal{
    
    private boolean selvagem;
    
    public hecarim(String cor, double peso, boolean selvagem){
        super(cor, peso);
        this.selvagem = selvagem;
    }

    public boolean isSelvagem() {
        return selvagem;
    }

    public void setSelvagem(boolean selvagem) {
        this.selvagem = selvagem;
    }
}
