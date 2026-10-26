import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        boolean executando = true;

        while (executando){
            System.out.println("=====LISTA DE TAREFAS=====" +
                    "[1] - Adicionar tarefa" +
                    "[2] - Listar tarefas" +
                    "[3] - Remover tarefas" +
                    "[0] - Sair");

            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();

        }

        scanner.close();
    }
}