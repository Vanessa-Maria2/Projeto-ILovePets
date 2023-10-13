package model;

import interfaces.AnimalInterface;

public class Animal implements AnimalInterface {
    private String nome, sexo;
    private int idade;

    public Animal(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public void emitirSom(){
        System.out.println("Emitindo som...");
    }
    
    @Override
    public String especie() {
    	return "Especie";
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade + ", sexo: " + sexo;
    }
}