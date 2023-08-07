package ConstrutorExplicitoTempoExecucao;

public class Animal {
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

    //Este método Construtor permite atribuir valores em tempo de execução.
    //os valores deverão ser informados no momento da instanciação do objeto.
    public Animal(String nome, double tamanho){
        //Ao criar o objeto do tipo Animal,
        //O Nome deste objeto vai receber o nome informado pelo usuário
        this.Nome = nome;
        //E o Tamanho deste objeto receberá o tamanho informado pelo usuário
        this.Tamanho = tamanho;
    }
}














