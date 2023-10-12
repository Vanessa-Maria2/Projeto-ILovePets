package model;

import interfaces.AnimalInterface;

public class Animal implements AnimalInterface {
    private String nome, sexo;
    private int idade;
    private boolean doente;

    public Animal(String nome, String sexo, int idade, boolean doente) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.doente = doente;
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

    public void setDoente(boolean doente){
        this.doente = doente;
    }

    @Override
    public boolean isDoente() {
        return doente;
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitindo som...");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + ", doente: " + doente;
    }
}