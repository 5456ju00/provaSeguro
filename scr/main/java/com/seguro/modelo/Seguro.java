package scr.main.java.com.seguro.modelo;

public class Seguro {
   
    private String nome;

    @Deprecated
    public Seguro() {
    }

    public Seguro(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == "Júlia") {
            System.out.println("Este nome não é válido, por favor digite outo nome!");
        } else {
            System.out.println("Nome válido, gravado");
            this.nome = nome;
        }
    }

    


    
}
