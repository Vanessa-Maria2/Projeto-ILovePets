package model;

public class Rato extends Animal {

    public Rato(String nome, String sexo, int idade) {
        super(nome, sexo, "Rato", "Queijo", idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Fazendo ruídos de roedura...");
    }

    @Override
    public void especie() {
        System.out.println("Rato");
    }

    @Override
    public void comer() {
        System.out.println("Comendo queijo...");
    }
}

