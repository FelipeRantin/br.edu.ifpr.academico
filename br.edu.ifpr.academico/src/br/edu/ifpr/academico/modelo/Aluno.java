package br.edu.ifpr.academico.modelo;

import java.util.Objects;

public class Aluno extends Pessoa {
    private int matricula;
    Endereço endereço;

    public Aluno() {
    }

    public Aluno(String nome, int matricula, Endereço endereço) {
        super(nome); 
        this.matricula = matricula;
        this.endereço = endereço;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
      return Objects.hash(matricula);
   }

   @Override
    public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Aluno other = (Aluno) obj;
      return matricula == other.matricula;
   }

   @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + getNome() + ", endereço=" + endereço + "]";
    }
}