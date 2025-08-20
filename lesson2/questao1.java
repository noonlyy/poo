import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro, um número decimal e um nome composto separados por tabulação (\\t):");
        String entrada = scanner.nextLine();

        String[] dados = entrada.split("\t");

        int numeroInteiro = Integer.parseInt(dados[0]);
        double numeroDecimal = Double.parseDouble(dados[1]);
        String nome = dados[2];

        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Nome: " + nome);

        scanner.close();
    }
}
