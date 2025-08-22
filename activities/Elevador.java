package elevador;
public class Elevador {
    private int andarAtual;
    private int capacidadeMaxima;
    private int quantidadePessoas;
    private int totalAndares;

    public Elevador(int capacidadeMaxima, int totalAndares) {
        this.andarAtual = 0; 
        this.capacidadeMaxima = capacidadeMaxima;
        this.quantidadePessoas = 0;
        this.totalAndares = totalAndares;
    }

    public void entrar() {
        if (quantidadePessoas < capacidadeMaxima) {
            quantidadePessoas++;
            System.out.println("Uma pessoa entrou. Pessoas no elevador: " + quantidadePessoas);
        } else {
            System.out.println("Elevador cheio! Capacidade máxima atingida.");
        }
    }

    public void sair() {
        if (quantidadePessoas > 0) {
            quantidadePessoas--;
            System.out.println("Uma pessoa saiu. Pessoas no elevador: " + quantidadePessoas);
        } else {
            System.out.println("Não há pessoas no elevador.");
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no último andar!");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no térreo!");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public static void main(String[] args) {
        Elevador elevador = new Elevador(10, 5); 

        elevador.entrar();
        elevador.entrar();
        elevador.subir();
        elevador.subir();
        elevador.sair();
        elevador.descer();
    }
}
