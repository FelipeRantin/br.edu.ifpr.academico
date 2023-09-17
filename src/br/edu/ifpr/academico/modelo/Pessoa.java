package br.edu.ifpr.academico.modelo;

public class Pessoa {
   
   private String nome;
   
   public Pessoa () {
      
   }
   
   public Pessoa (String nome) {
      super.toString();
      this.nome = nome;
   }
   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String mostrarNome() {
	  return nome;
   }
}