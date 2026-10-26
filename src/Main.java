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

            switch (opcao){
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa Adicionada");
                    break;

                case 2:
                    if (tarefas.isEmpty()){
                        System.out.println("Nenhuma tarefa cadastrada");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + " - " + tarefas.get(i));
                        }
                    }

            }

        }

        scanner.close();
    }
}