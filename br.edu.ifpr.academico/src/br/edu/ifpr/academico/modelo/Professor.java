package br.edu.ifpr.academico.modelo;

import java.util.Objects;

public class Professor extends Pessoa{
   
   private int registro;
   private Endereço endereço;
   
   public Professor() {
      
   }
   
   public Professor(String nome, int registro, Endereço endereço) {
      super(nome);
      this.registro = registro;
      this.endereço = endereço;
   }

   public int getRegistro() {
      return registro;
   }

   public void setRegistro(int registro) {
      this.registro = registro;
   }

   @Override
   public int hashCode() {
      return Objects.hash(registro);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Professor other = (Professor) obj;
      return registro == other.registro;
   }

   @Override
   public String toString() {
       return "Professor [registro=" + registro + ", nome=" + getNome() + "endereço=" + endereço + "]";
   }
}
   
   
   

