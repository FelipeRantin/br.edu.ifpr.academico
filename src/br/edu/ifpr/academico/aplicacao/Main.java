package br.edu.ifpr.academico.aplicacao;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.academico.modelo.Aluno;

public class Main {
   public Main () {
      
   }
   public static void main(String[] args) {
      
      Aluno a1 = new Aluno ("fdefefd", 23512);
      Aluno a2 = new Aluno ("Matheus", 23452);
      
      List<Aluno> alunos = new ArrayList<>();
      
      alunos.add(a1);
      alunos.add(a2);

      alunos.forEach(System.out::println);
      
     
   }
}
