package model;

import interfaces.AnimalInterface;

public class Animal implements AnimalInterface {
    private String nome, sexo, especie, comer;
    private int idade;

    public Animal(String nome, String sexo, String especie, String comer, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.especie = especie;
        this.comer = comer;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public String getComer() {
        return comer;
    }

    public void setComer(String comer) {
        this.comer = comer;
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
    public void especie(){
        System.out.println("Especie...");
    }
    
    @Override
    public void comer(){
        System.out.println("Comendo...");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + ", especie: " + especie + ", comer: " + comer ;
    }
}