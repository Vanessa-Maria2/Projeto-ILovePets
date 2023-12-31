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

    @Override
    public String toString() {
        return super.toString() + ", quantidade de vendas: " + qtdVendas;
    }

    @Override
    public float calculaSalario(int qtdHoras, int qtdDias) {
        return qtdHoras * qtdDias * 25;
    }
}