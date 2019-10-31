
package main;

import funcionario.Funcionario;
import funcionario.Gerente;
import funcionario.Secretaria;
import funcionario.ServicoGerais;

public class Main {
    
    public static void calcularBonificacao(Funcionario f){
        f.bonificacao();
        if (f instanceof Gerente){
            System.out.println("Gerente: "+(f.getSalario()+f.getBonificacao()));
        
    }else if(f instanceof Secretaria){
            System.out.println("Secretaria: "+(f.getSalario()+f.getBonificacao()));
            
    }else{
            System.out.println("ServicoGerais: "+(f.getSalario()+f.getBonificacao()));
    }
        
    }
    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente();
        Secretaria s1 = new Secretaria();
        ServicoGerais SG = new ServicoGerais();
        
        g1.setSalario(1000);
        s1.setSalario(1000);
        SG.setSalario(1000);
        
        calcularBonificacao(g1);
        calcularBonificacao(s1);
        calcularBonificacao(SG);
        
        
        
        
        
        
        
        
        
        
    }
    
}
