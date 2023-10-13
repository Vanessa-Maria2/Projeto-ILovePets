package test;

import java.util.ArrayList;
import java.util.List;

import model.*;


public class Main {

    public static void main(String[] args) {
        // Criação de instâncias de animais
    	Animal cao = new Cao("Fido", "Macho", 3);
        Animal gato = new Gato("Whiskers", "Fêmea", 2);
        Animal coelho = new Coelho("Pernalonga", "Macho", 1);
        Animal rato = new Rato("Jerry", "Macho", 1);
     
        List<Animal> animais = new ArrayList<>();
        animais.add(cao);
        animais.add(gato);
        animais.add(coelho);
        animais.add(rato);

        List<String> especialidades = new ArrayList<>();
        especialidades.add("Venda de Alimentos e Suprimentos");
        especialidades.add("Banho e tosa");
        especialidades.add("Consultas ou exames");
        especialidades.add("Serviços de adestramento");

        // Criação de instâncias de usuários
        Vendedor vendedor = new Vendedor("Carlos", "carlos@email.com", "Rua C", 35, 67890, 111222333, 0.0f, 5);
        Tutor tutor = new Tutor("Karla", "karla@gmail.com", "Rua Dom Pedro I", 20, 2022005, 988362817, 1300f, "veterinário", animais);
        PrestadorDeServicos prestadorDeServicos = new PrestadorDeServicos("Maria", "maria@gmail.com", "Lagoa Nova, Natal", 25, 20230011, 987482171, 1500, especialidades, rato);
        
        List<Animal> animaisTutor = tutor.getAnimais();

        System.out.println("\nInformacoes do Vendedor:");
        System.out.println(vendedor);

        System.out.println("\nInformacoes do Tutor:");
        System.out.println(tutor);
        System.out.println("\nAnimais do Tutor:");
        for(Animal animal: animaisTutor){
            System.out.println(animal.toString());
        }

        System.out.println("\nInformacoes do Prestador de Serviços:");
        System.out.println(prestadorDeServicos);
        System.out.println("\nAnimal do Prestador de Serviços:");
        System.out.println(prestadorDeServicos.getAnimal().toString());

        // Exibição das informações dos animais
        System.out.println("\nInformacoes do Cao:");
        System.out.println(cao);
    	cao.emitirSom();

        System.out.println("\nInformacoes do Gato:");
        System.out.println(gato);
    	gato.emitirSom();

        System.out.println("\nInformacoes do Coelho:");
        System.out.println(coelho);
    	coelho.emitirSom();

        System.out.println("\nInformacoes do Rato:");
        System.out.println(rato);
    	rato.emitirSom();
    	
    	}
}


