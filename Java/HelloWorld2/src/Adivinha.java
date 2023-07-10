import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(100);
        Scanner input = new Scanner(System.in);

        String boasVindas = """
                Jogo de adivinhação!
                Qual é o número que estou pensando de 0 a 100?
                Você tem 5 chances para acertar.""";
        System.out.println(boasVindas);
        System.out.println(numeroAleatorio);

        for (int tentativas = 0; tentativas < 5; tentativas++) {
            System.out.println("Digite seu palpite:");
            int chute = input.nextInt();

            if (chute == numeroAleatorio) {
                System.out.println("Acertou!!");
                break;
            }

            if (chute > numeroAleatorio) {
                System.out.println("O número que estou pensando é menor.");
            } else {
                System.out.println("O número que estou pensando é maior.");
            }
        }

        System.out.println("O número que pensei foi " + numeroAleatorio + ".");
        System.out.println("Fim de jogo!");

    }
}
