package model;

public class Coelho extends Animal {
	public Coelho(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Rondando...");
    }

    @Override
    public String especie() {
        return "Coelho Europeu";
    }

    @Override
    public String toString() {
        return super.toString() + ", especie: " + especie();
    }
}

