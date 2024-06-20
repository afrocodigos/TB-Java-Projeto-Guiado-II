package funcionariosEvilCorp;

import java.util.Scanner;
import funcionariosEvilCorp.gerenciamentoCargos.*;
import funcionariosEvilCorp.modelo.*;

public class Main {
    public static void main(String[] args) {
        VPDeEngenhariaArvore vpArvore = new VPDeEngenhariaArvore();
        CTOArvore ctoArvore = new CTOArvore();

        VPDeEngenharia vp1 = new VPDeEngenharia("Alice", "VP de Engenharia", 200000);
        VPDeEngenharia vp2 = new VPDeEngenharia("Bob", "VP de Engenharia", 180000);

        CTO cto1 = new CTO("Carol", "CTO", 250000);
        CTO cto2 = new CTO("Dave", "CTO", 230000);

        vpArvore.adicionar(vp1);
        vpArvore.adicionar(vp2);

        ctoArvore.adicionar(cto1);
        ctoArvore.adicionar(cto2);

        vpArvore.mostrarTodos();

        ctoArvore.mostrarTodos();

        // Buscando pelo nome
        VPDeEngenharia vpEncontrado = vpArvore.buscar("Alice");
        if (vpEncontrado != null) {
            System.out.println("VP de Engenharia encontrado: " + vpEncontrado.getNome() + " - "
                    + vpEncontrado.getCargo() + " - " + vpEncontrado.getSalario());
        }

        CTO ctoEncontrado = ctoArvore.buscar("Carol");
        if (ctoEncontrado != null) {
            System.out.println("CTO encontrado: " + ctoEncontrado.getNome() + " - " + ctoEncontrado.getCargo() + " - "
                    + ctoEncontrado.getSalario());
        }

        // Atualizando os dados
        vpArvore.atualizarDados("Alice", 210000, "VP de Engenharia Sênior");

        ctoArvore.atualizarDados("Carol", 260000, "CTO Sênior");

        // Mostrando todos
        vpArvore.mostrarTodos();

        ctoArvore.mostrarTodos();

        // Remoção
        vpArvore.remover("Bob");

        ctoArvore.remover("Dave");

        // Mostrando todos novamente
        vpArvore.mostrarTodos();

        ctoArvore.mostrarTodos();
    }
}
