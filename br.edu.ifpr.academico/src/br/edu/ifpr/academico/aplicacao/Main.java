package br.edu.ifpr.academico.aplicacao;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.academico.modelo.Aluno;
import br.edu.ifpr.academico.modelo.Endereço;
import br.edu.ifpr.academico.modelo.Pessoa;
import br.edu.ifpr.academico.modelo.Professor;

public class Main {

   public static void main(String[] args) {
      
      Endereço e1 = new Endereço ("Rua Albert Albert Einstein", "Bairro Pinheiros", 43);
      Endereço e2 = new Endereço ("Rua João XXIII", "Bairro Palmeiras", 44);
      Endereço e3 = new Endereço ("Rua da Liberdade", "Bairro Lorena", 56);
      Endereço e4 = new Endereço ("Rua José", "Bairro Jardim Tókio", 102);
      
      List<Pessoa> pessoas = new ArrayList<>();
      Pessoa p1 = new Aluno ("CArlinhos Tornado", 2353632, e3);
      Pessoa p2 = new Aluno ("Cuzao", 235342, e2);
      Pessoa p3 = new Professor ("Romualdo", 23235, e1);
      Pessoa p4 = new Professor ("Luciana Potker", 42563, e4);
      pessoas.add(p1);
      pessoas.add(p2);
      pessoas.add(p3);
      pessoas.add(p4);
      
      pessoas.forEach(System.out::println);
      
   }
   
}