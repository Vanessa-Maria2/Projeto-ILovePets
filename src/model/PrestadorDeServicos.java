package model;

import java.util.ArrayList;
import java.util.List;

public class PrestadorDeServicos extends Usuario{
    private List<String> especialidades = new ArrayList<String>();
    private Animal animal;

    public PrestadorDeServicos(String nome, String email, String endereco, int idade, int matricula, int telefone, float salario, List<String> especialidades, Animal animal) {
        super(nome, email, endereco, idade, matricula, telefone, salario);
        this.especialidades = especialidades;
        this.animal = animal;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public float calculaSalario(int qtdHoras, int qtdDias) {
        return qtdHoras * qtdDias * 20;
    }
}