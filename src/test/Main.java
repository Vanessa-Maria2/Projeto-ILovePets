package test;

import model.*;


public class Main {

    public static void main(String[] args) {
        // Criação de instâncias de animais
    	Animal cao = new Cao("Fido", "Macho", 3);
        Animal gato = new Gato("Whiskers", "Fêmea", 2);
        Animal coelho = new Coelho("Pernalonga", "Macho", 1);
        Animal rato = new Rato("Jerry", "Macho", 1);
     
        // Criação de instâncias de usuários
        Vendedor vendedor = new Vendedor("Carlos", "carlos@email.com", "Rua C", 35, 67890, 111222333, 0.0f, 5);



        System.out.println("\nInformacoes do Vendedor:");
        System.out.println(vendedor);

        // Exibição das informações dos animais
        System.out.println("\nInformacoes do Cao:");
        System.out.println(cao);

        System.out.println("\nInformacoes do Gato:");
        System.out.println(gato);

        System.out.println("\nInformacoes do Coelho:");
        System.out.println(coelho);

        System.out.println("\nInformacoes do Rato:");
        System.out.println(rato);
    }
}


