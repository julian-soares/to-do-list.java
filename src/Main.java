import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        ArrayList<Boolean> tarefasConcluidas = new ArrayList<>();
        boolean executando = true;

        while (executando) {
            System.out.printf("=====LISTA DE TAREFAS=====%n" +
                    "[1] - Adicionar tarefa%n" +
                    "[2] - Listar tarefas%n" +
                    "[3] - Remover tarefas%n" +
                    "[4] - Limpar tarefas%n" +
                    "[5] - Marcação de tarefas%n" +
                    "[0] - Sair%n");

            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    tarefasConcluidas.add(false);
                    System.out.println("Tarefa Adicionada");
                    break;

                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            if (tarefasConcluidas.get(i)) {
                                System.out.println((i + 1) + " - [x] " + tarefas.get(i));
                            } else {
                                System.out.println((i + 1) + " - [ ] " + tarefas.get(i));
                            }
                        }
                    }
                    break;

                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não ha tarefas listadas para remover");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            if (tarefasConcluidas.get(i)) {
                                System.out.println((i + 1) + " - [x] " + tarefas.get(i));
                            } else {
                                System.out.println((i + 1) + " - [ ] " + tarefas.get(i));
                            }
                        }

                        System.out.print("Número da tarefa para remover: ");
                        int numero = scanner.nextInt();
                        scanner.nextLine();

                        if (numero >= 1 && numero <= tarefas.size()) {
                            String removida = tarefas.remove(numero - 1);
                            tarefasConcluidas.remove((numero - 1));
                            System.out.println("Removida: " + removida);
                        } else {
                            System.out.println("Número inválido");
                        }
                    }
                    break;

                case 4:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas para serem limpas");
                    } else {
                        System.out.println("Limpando tarefas...");
                        tarefas.clear();
                        tarefasConcluidas.clear();
                    }
                    break;

                case 5:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas para marcar");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            if (tarefasConcluidas.get(i)) {
                                System.out.println((i + 1) + " - [x] " + tarefas.get(i));
                            } else {
                                System.out.println((i + 1) + " - [ ] " + tarefas.get(i));
                            }
                        }

                        System.out.print("Número da tarefa para marcar: ");
                        int numeroTarefa = scanner.nextInt();
                        scanner.nextLine();

                        System.out.printf("Marcar como Verdadeira ou Falsa?%n" +
                                "[1] - Verdadeira%n" +
                                "[2] - Falsa%n");
                        int opcaoTarefa = scanner.nextInt();
                        scanner.nextLine();

                        if (numeroTarefa >= 1 && numeroTarefa <= tarefas.size() && opcaoTarefa == 1) {
                            tarefasConcluidas.set(numeroTarefa - 1, true);
                            System.out.println("Tarefa marcada como concluída");
                        } else if (numeroTarefa >= 1 && numeroTarefa <= tarefas.size() && opcaoTarefa == 2) {
                            tarefasConcluidas.set(numeroTarefa - 1, false);
                            System.out.println("Tarefa marcada como não concluída");
                        } else {
                            System.out.println("Opção Inválida!");
                        }
                    }
                    break;

                case 0:
                    executando = false;
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Número inválido");
            }
        }

        scanner.close();
    }
}