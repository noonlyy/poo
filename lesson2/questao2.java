import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        int ultimoIndiceVogal = -1;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (isVogal(c)) {
                ultimoIndiceVogal = i;
            }
        }

        if (ultimoIndiceVogal != -1) {
            System.out.println("Índice da última vogal: " + ultimoIndiceVogal);
        } else {
            System.out.println("Vogal não encontrada!");
        }

        scanner.close();
    }

    private static boolean isVogal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
