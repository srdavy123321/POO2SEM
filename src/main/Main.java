
package main;

import Peeoa.Aluno;
import Peeoa.AlunoMonitor;
import Peeoa.Professor;
import Peeoa.Vigia;


public class Main {
    
    public static void main(String[] args) {
    
        Aluno a1 = new Aluno();
        AlunoMonitor am = new AlunoMonitor();
        
        Professor p1 = new Professor();
        Vigia v1 = new Vigia();
        
        a1.setNome("Davy");
        a1.setDataNascimento("10/12/1998");
        a1.setCPF("145.456.487-58");
        
        am.setNome("Lucas");
        am.setDataNascimento("15/01/2000");
        am.setCPF("256.369.147-58");
        
        p1.setNome("Robsun");
        p1.setDataContratacao("10/10/2015");
        p1.setSalario(2500);
        
        v1.setNome("Tiaguin");
        v1.setDataContratacao("09/02/2016");
        v1.setSalario(1800);
        
        System.out.println(a1.getNome());
        System.out.println(a1.getDataNascimento());
        System.out.println(a1.getCPF());
        
        System.out.println(am.getNome());
        System.out.println(am.getDataNascimento());
        System.out.println(am.getCPF());
        
        System.out.println(p1.getNome());
        System.out.println(p1.getDataContratacao());
        System.out.println(p1.getSalario());
        
        System.out.println(v1.getNome());
        System.out.println(v1.getDataContratacao());
        System.out.println(v1.getSalario());
        
        
        
        
        
       
    }
    
}
