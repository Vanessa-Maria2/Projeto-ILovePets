package model;

public class Gato extends Animal {

    public Gato(String nome, String sexo, int idade) {
        super(nome, sexo, "Gato", "Racao de gato", idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miando...");
    }

    @Override
    public void especie() {
        System.out.println("Gato");
    }

    @Override
    public void comer() {
        System.out.println("Comendo racao de gato...");
    }
}
