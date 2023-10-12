package model;

import java.util.ArrayList;
import java.util.List;

public class Tutor extends Usuario{
    private String tipo;
    private List<Animal> animais = new ArrayList<Animal>();

    public Tutor(String nome, String email, String endereco, int idade, int matricula, int telefone, float salario, String tipo, List<Animal> animais) {
        super(nome, email, endereco, idade, matricula, telefone, salario);
        this.tipo = tipo;
        this.animais = animais;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }
}