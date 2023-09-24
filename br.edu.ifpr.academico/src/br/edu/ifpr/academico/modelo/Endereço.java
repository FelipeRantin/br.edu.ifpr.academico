package br.edu.ifpr.academico.modelo;

import java.util.Objects;

public class Endereço {
   
   private String rua;
   private String bairro;
   private int numero;
   
   public Endereço() {
      
   }
   
   public Endereço (String rua, String bairro, int numero) {
      
      this.rua = rua;
      this.bairro = bairro;
      this.numero = numero;
      
   }

   public String getRua() {
      return rua;
   }

   public void setRua(String rua) {
      this.rua = rua;
   }

   public String getBairro() {
      return bairro;
   }

   public void setBairro(String bairro) {
      this.bairro = bairro;
   }

   public int getNumero() {
      return numero;
   }

   public void setNumero(int numero) {
      this.numero = numero;
   }

   @Override
   public String toString() {
      return " " + rua + ", " + bairro + ", " + numero;
   }

   @Override
   public int hashCode() {
      return Objects.hash(bairro, numero, rua);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Endereço other = (Endereço) obj;
      return Objects.equals(bairro, other.bairro) && numero == other.numero && Objects.equals(rua, other.rua);
   }
   
 }