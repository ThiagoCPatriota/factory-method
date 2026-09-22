package game;

public class Main {
    public static void main(String[] args) {
        Location amazon = new AmazonLocation();
        System.out.println("Jogador entrou na Amazonia.");
        amazon.encounterPlayer();

        System.out.println();

        Location sertao = new SertaoLocation();
        System.out.println("Jogador entrou no Sertao.");
        sertao.encounterPlayer();
    }
}