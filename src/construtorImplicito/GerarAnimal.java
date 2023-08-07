package construtorImplicito;

public class GerarAnimal {
    public static void main(String[] args) {

        Animal objetoAnimal = new Animal();
        objetoAnimal.setNome("cavalo");
        objetoAnimal.setTamanho(1.9);

        System.out.println("O animal instanciado é " + objetoAnimal.getNome() +
                " e o tamanho deste animal é " + objetoAnimal.getTamanho() + " metros.");
    }
}
