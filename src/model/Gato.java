package model;

public class Gato extends Animal {
    public Gato(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miando...");
    }

    @Override
    public String especie() {
        return "Siames";
    }

    @Override
    public String toString() {
        return super.toString() + ", especie: " + especie();
    }
}
