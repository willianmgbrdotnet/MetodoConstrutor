package construtorImplicito;

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

    public Animal(){
        //este é o construtor que é declarado automaticamente pelo java de forma implícita.
    }
}
