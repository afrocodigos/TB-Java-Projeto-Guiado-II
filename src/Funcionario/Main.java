package Funcionario;

import Funcionario.exceptions.ColaboradorJaExistenteException;
import Funcionario.exceptions.ColaboradorNaoEncontradoException;
import Funcionario.models.Area;
import Funcionario.models.Colaborador;
import Funcionario.models.Gestor;
import Funcionario.structures.ArvoreBinaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        Area ti = new Area("TI");
        Area rh = new Area("RH");
        Gestor gestor1 = new Gestor("Maria");
        Gestor gestor2 = new Gestor("João");

        Colaborador colaborador1 = new Colaborador(1, "Ana", ti, gestor1);
        Colaborador colaborador2 = new Colaborador(2, "Carlos", rh, gestor2);
        Colaborador colaborador3 = new Colaborador(3, "Bia", ti, gestor1);

        try {
            // Criar (Inserir)
            arvore.inserir(colaborador1);
            arvore.inserir(colaborador2);
            arvore.inserir(colaborador3);

            Scanner scanner = new Scanner(System.in);
            int id;

            while (true) {
                System.out.print("\nDigite o ID do colaborador que deseja buscar, atualizar ou deletar (ou 0 para sair): ");
                try {
                    id = scanner.nextInt();
                    if (id == 0) {
                        System.out.println("Programa encerrado.");
                        break;
                    }

                    try {
                        Colaborador colaborador = arvore.buscar(id);
                        System.out.println("Colaborador encontrado: " + colaborador);

                        scanner.nextLine(); // Limpar o buffer do scanner

                        System.out.print("Digite o novo nome para atualizar (ou pressione Enter para não atualizar): ");
                        String novoNome = scanner.nextLine().trim();

                        if (!novoNome.isEmpty()) {
                            colaborador.setNome(novoNome);
                            arvore.atualizar(id, colaborador);
                            System.out.println("Colaborador atualizado com sucesso: " + colaborador);
                        }

                        System.out.print("Deseja deletar este colaborador? (S/N): ");
                        String opcao = scanner.nextLine().trim().toUpperCase();
                        if (opcao.equals("S")) {
                            arvore.deletar(id);
                            System.out.println("Colaborador deletado com sucesso.");
                        }
                    } catch (ColaboradorNaoEncontradoException e) {
                        System.out.println("Erro: " + e.getMessage());
                    } catch (ColaboradorJaExistenteException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um número válido.");
                    scanner.nextLine(); // Limpar o buffer do scanner
                }
            }

        } catch (ColaboradorJaExistenteException e) {
            System.err.println("Erro ao inserir colaboradores: " + e.getMessage());
        }
    }
}
