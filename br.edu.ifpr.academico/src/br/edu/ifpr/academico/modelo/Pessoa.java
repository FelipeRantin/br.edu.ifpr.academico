package br.edu.ifpr.academico.modelo;

import java.util.Objects;

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

   @Override
   public int hashCode() {
      return Objects.hash(nome);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Pessoa other = (Pessoa) obj;
      return Objects.equals(nome, other.nome);
   }

   @Override
   public String toString() {
      return "Pessoa [nome=" + nome + "]";
   }
}