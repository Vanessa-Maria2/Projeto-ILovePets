package model;

public class Vendedor extends Usuario{
    private int qtdVendas;

    public Vendedor(String nome, String email, String endereco, int idade, int matricula, int telefone, float salario, int qtdVendas) {
        super(nome, email, endereco, idade, matricula, telefone, salario);
        this.qtdVendas = qtdVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }
}