
package main;

import pacote.AlunoPacote;
import privado.AlunoPrivado;
import protegido.AlunoProtegido;
import publico.AlunoPublico;

public class Main {
    public static void main(String[] args) {
        AlunoPacote aluno1 = new AlunoPacote(); // pacote e classe
        AlunoPrivado aluno2 = new AlunoPrivado(); // classe
        AlunoProtegido aluno3 = new AlunoProtegido(); // pacote, classe,sub classe
        AlunoPublico aluno4 = new AlunoPublico(); // todas as classes
        
        aluno1.setNome("Davy");
        aluno2.setNome("Davy");
        aluno3.setNome("Davy");
        aluno4.nome = "Davy";
        
        System.out.println("Aluno Pacote: "+aluno1.getNome());
        System.out.println("Aluno Privado: "+aluno2.getNome());
        System.out.println("Aluno Protegido: "+aluno3.getNome());
        System.out.println("AlunoPublico: "+aluno4.nome);
        
    }
    
}
