
package atributoinstancia;

public class Main {
    public static void main(String[] args) {
        
        //Aluno
        System.out.println("ALUNO :");
        
        Aluno a1 = new Aluno();
        a1.cpf = "075.456.654.24";
        a1.NMatricula = "12525";
        a1.endereco = "Rua B";
        a1.nacionalidade = "Brasileira";
        a1.nome = "Davy";
        
        System.out.println("CPF :" +a1.cpf);
        System.out.println("Matricula :" +a1.NMatricula);
        System.out.println("Endereço :" +a1.endereco);
        System.out.println("Nacionalidade :" +a1.nacionalidade);
        System.out.println("Nome :" +a1.nome);
        
       //Caneta
        System.out.println("CANETA :");
       
       Caneta c1 = new Caneta();
       c1.cor = "Preta";
       c1.dataFabricacao = "09/09/2019";
       c1.marca = "Big";
       c1.ponta = "0.5";
       c1.valor = 1.00;
       
        System.out.println("cor :"+c1.cor);
        System.out.println("Data de Fabricação :"+c1.dataFabricacao);
        System.out.println("Marca :"+c1.marca);
        System.out.println("Ponta :"+c1.ponta);
        System.out.println("Valor :R$"+c1.valor);
        
        //Celular
        System.out.println("CELULAR :");
        
        Celular p1 = new Celular();
        p1.android = "7.1";
        p1.dataFabricacao = "10/09/2019";
        p1.marca = "Android";
        p1.modelo = "J5 1°geração";
        p1.preco = 800;
        
        System.out.println("Android :"+p1.android);
        System.out.println("Data de Fabricação :"+p1.dataFabricacao);
        System.out.println(p1.marca);
        System.out.println("Modelo :"+ p1.modelo);
        System.out.println("Preço :R$"+p1.preco);
        
        //Notebook
        System.out.println("NOTEBOOK :");
        
        Notebook n1 = new Notebook();
        
        n1.RAM = "8G";
        n1.cor = "Preto";
        n1.marca = "DELL";
        n1.preco = 2199;
        n1.processador = "I5 8°Geração";
        
        System.out.println("RAM :"+n1.RAM);
        System.out.println("Cor :"+n1.cor);
        System.out.println("Marca :"+n1.marca);
        System.out.println("Preço :"+n1.preco);
        System.out.println("Processador :"+n1.processador);
        
        
        
       
       
       
       
       
       
       
       
            
        
    }
    
   
    
}
