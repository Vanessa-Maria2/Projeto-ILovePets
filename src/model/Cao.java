package model;

public class Cao extends Animal {

	private String som;
	
    public Cao(String nome, String sexo, int idade) {
        super(nome, sexo, "Cao", "Racao de cachorro", idade);
    }

    @Override
    public void emitirSom() {
    	som = "Latindo...";
    }

    @Override
    public void especie() {
        System.out.println("Cão");
    }

    @Override
    public void comer() {
        System.out.println("Comendo ração de cachorro...");
    }

    @Override
    public String toString() {
    	emitirSom();
        return super.toString() + ", som: " + som;
    }
}
