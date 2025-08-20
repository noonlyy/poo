import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String textoOriginal = scanner.nextLine();

        char[] caracteres = textoOriginal.toCharArray();

        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        String textoInvertido = new String(caracteres);

        System.out.println("String invertida: " + textoInvertido);

        scanner.close();
    }
}
