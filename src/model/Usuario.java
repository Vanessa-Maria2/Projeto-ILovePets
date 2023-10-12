package model;

import interfaces.UsuarioInterface;

public class Usuario implements UsuarioInterface{
    private String nome, email, endereco;
    private int idade, matricula, telefone;
    private float salario;

    public Usuario(String nome, String email, String endereco, int idade, int matricula, int telefone, float salario) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.idade = idade;
        this.matricula = matricula;
        this.telefone = telefone;
        this.salario = salario;
    }   
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

   @Override
    public String toString(){
        return "Nome: " + nome + ", email: " + email + ", endereçp: " + endereco + ", idade: " + idade +
        ", matrícula: " + matricula + ", telefone:" + telefone + ", salário: " + salario;
    }

    @Override
    public float calculaSalario(int qtdHoras, int qtdDias) {
        return qtdHoras * qtdDias * 20;
    }
}