package model;

public class Coelho extends Animal {

    public Coelho(String nome, String sexo, int idade) {
        super(nome, sexo, "Coelho", "Vegetais", idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Rondando...");
    }

    @Override
    public void especie() {
        System.out.println("Coelho");
    }

    @Override
    public void comer() {
        System.out.println("Comendo vegetais...");
    }
}

