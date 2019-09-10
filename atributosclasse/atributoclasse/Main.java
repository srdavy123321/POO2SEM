
package atributoclasse;


public class Main {
    public static void main(String[] args) {
        
        //Carro
        System.out.println("CARRO :");
        
     Carro c1 = new Carro();
     Carro.cor = "Cinza";
     Carro.modelo = "HYUNDAI HB20";
     Carro.portas = "4";
     Carro.preco = 44.499;
     Carro.rodas = "4";
     
        System.out.println("Cor :"+Carro.cor);
        System.out.println("Modelo :"+Carro.modelo);
        System.out.println("Portas :"+Carro.portas);
        System.out.println("Preço :R$"+Carro.preco);
        System.out.println("Rodas :"+Carro.rodas);
        
        //Caneta
        System.out.println("CANETA :");
        
        Caneta c2 = new Caneta();
        
        Caneta.carga = "100%";
        Caneta.cor = "Azul";
        Caneta.marca = "Compactor";
        Caneta.ponta = "0.5";
        Caneta.valor = 1.00;
        
        System.out.println("Carga :"+Caneta.carga);
        System.out.println("Cor :"+Caneta.cor);
        System.out.println("Marca :"+Caneta.marca);
        System.out.println("Ponta :"+Caneta.ponta);
        System.out.println("Valor :R$"+Caneta.valor);
     
        
        
       
        
        
        
        
        
        
        
    }
    
}
