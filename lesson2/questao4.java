import java.text.Normalizer;
import java.util.Scanner;

public class questao4 {

    public static String removerAcentos(String texto) {
        if (texto == null) return null;
        return Normalizer
                .normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para verificar se é palíndromo: ");
        String entrada = scanner.nextLine();

        String textoLimpo = removerAcentos(entrada.toLowerCase());

        textoLimpo = textoLimpo.replaceAll("[^a-z]", "");

        boolean ehPalindromo = true;
        int inicio = 0;
        int fim = textoLimpo.length() - 1;

        while (inicio < fim) {
            if (textoLimpo.charAt(inicio) != textoLimpo.charAt(fim)) {
                ehPalindromo = false;
                break;
            }
            inicio++;
            fim--;
        }

        if (ehPalindromo) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}
