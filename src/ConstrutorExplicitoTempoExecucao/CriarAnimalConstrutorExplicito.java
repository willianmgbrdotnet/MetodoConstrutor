package ConstrutorExplicitoTempoExecucao;

public class CriarAnimalConstrutorExplicito {
    public static void main(String[] args) {
        Animal segundoAnimal = new Animal("cachorro", 1.2);

        System.out.println("Este animal é um " + segundoAnimal.getNome() +
                " e sua altura é " + segundoAnimal.getTamanho() + " metros.");

    }
}
