
package Classes;

import java.util.Objects;


public class Produto {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }
    
      public Produto() {
        this.nome = "SN";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{"+ nome + '}';
    }
    
    
    
}
