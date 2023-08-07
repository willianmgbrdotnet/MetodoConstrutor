package ParametrosDefinidosNoConstrutor;

public class ChamarObjetoCriadoNaClasse {
    public static void main(String[] args) {
        //Caso queira criar um objeto diferente daquele já definido na classe,
        //basta definir novos parâmetros ao novo objeto.
        AnimalComParametros objetoAnimalPronto = new AnimalComParametros(/* "bezerro", 1.50 */);

        System.out.println("O animal criado no construtor da Classe é um " + objetoAnimalPronto.getNome() +
                " com o tamanho de " + objetoAnimalPronto.getTamanho() + " metros.");
    }
}
