package model;

public class Cao extends Animal {	
    public Cao(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    @Override
    public void emitirSom() {
    	System.out.println("Latindo...");
    }
    
    @Override
    public String especie() {
        return "Poodle";
    }

    @Override
    public String toString() {
        return super.toString() + ", especie: " + especie();
    }
}
