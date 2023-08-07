package ParametrosDefinidosNoConstrutor;

public class AnimalComParametros {
    private String Nome;
    private double Tamanho;

    //metodos getters e setters para permitirem acesso aos atributos privados
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        Nome = nome;
    }
    public double getTamanho(){
        return Tamanho;
    }
    public void setTamanho(double tamanho){
        Tamanho = tamanho;
    }


    public AnimalComParametros(){
        this("gato", 0.38);
    }
    public AnimalComParametros(String nome, double tamanho){
        this.Nome = nome;
        this.Tamanho = tamanho;
    }
}
