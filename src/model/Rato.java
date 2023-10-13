package model;

public class Rato extends Animal {
    public Rato(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Fazendo ruidos de roedura...");
    }

    @Override
    public String especie() {
        return "Ratazana";
    }

    @Override
    public String toString() {
        return super.toString() + ", especie: " + especie();
    }

}

