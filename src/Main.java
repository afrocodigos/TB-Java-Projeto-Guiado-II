import data.*;
import model.*;

public class Main {

    public static void main(String[] args) {
        // Criando instâncias de funcionários
        SuporteTecnico suporteTecnico = new SuporteTecnico("João", "Suporte Técnico", 4000.0, "123456789");
        SuporteTecnico suporteTecnico1 = new SuporteTecnico("Lucas", "Suporte Técnico", 4000.0, "123456788");
        SuporteTecnico suporteTecnico2 = new SuporteTecnico("João", "Suporte Técnico", 4000.0, "123456789");


        VPDeEngenharia vpDeEngenharia = new VPDeEngenharia("Maria", "VP de Engenharia", 8000.0, "987654321");
        VPDeEngenharia vpDeEngenharia1 = new VPDeEngenharia("Joaquina", "VP de Engenharia", 8000.0, "987654322");
        VPDeEngenharia vpDeEngenharia2 = new VPDeEngenharia("Priscila", "VP de Engenharia", 8000.0, "987654323");


        QA qa = new QA("Pedro", "QA", 3500.0, "456789123");
        QA qa1 = new QA("Marlon", "QA", 3500.0, "456789129");
        QA qa2 = new QA("Oswaldo", "QA", 3500.0, "456789123");

        Programadores programador = new Programadores("Ana", "Programador", 6000.0, "789123456");
        Programadores programador1 = new Programadores("Marcia", "Programador", 6000.0, "789123457");
        Programadores programador2 = new Programadores("Karinne", "Programador", 6000.0, "789123458");

        // Adicionando funcionários em suas respectivas árvores
        ArvoreSuporteTecnico arvoreSuporteTecnico = new ArvoreSuporteTecnico();
        arvoreSuporteTecnico.adicionar(suporteTecnico);
        arvoreSuporteTecnico.adicionar(suporteTecnico1);
        arvoreSuporteTecnico.adicionar(suporteTecnico2);


        ArvoreVPDeEngenharia arvoreVPDeEngenharia = new ArvoreVPDeEngenharia();
        arvoreVPDeEngenharia.adicionar(vpDeEngenharia);
        arvoreVPDeEngenharia.adicionar(vpDeEngenharia1);
        arvoreVPDeEngenharia.adicionar(vpDeEngenharia2);

        ArvoreQA arvoreQA = new ArvoreQA();
        arvoreQA.adicionar(qa);
        arvoreQA.adicionar(qa1);
        arvoreQA.adicionar(qa2);

        ArvoreProgramadores arvoreProgramadores = new ArvoreProgramadores();
        arvoreProgramadores.adicionar(programador);
        arvoreProgramadores.adicionar(programador1);
        arvoreProgramadores.adicionar(programador2);

        System.out.println("===============================");

        // Executando métodos nas árvores
        System.out.println("Funcionários na árvore de Suporte Técnico:");
        arvoreSuporteTecnico.mostrarTodos();
        System.out.println();

        System.out.println("Funcionários na árvore de VP de Engenharia:");
        arvoreVPDeEngenharia.mostrarTodos();
        System.out.println();

        System.out.println("Funcionários na árvore de QA:");
        arvoreQA.mostrarTodos();
        System.out.println();

        System.out.println("Funcionários na árvore de Programadores:");
        arvoreProgramadores.mostrarTodos();
        System.out.println();

        System.out.println("===============================");
        arvoreSuporteTecnico.buscar("João");
        arvoreVPDeEngenharia.buscar("João");
        arvoreVPDeEngenharia.buscar("Maria");
        arvoreProgramadores.buscar("Marcia");
        arvoreQA.buscar("Oswaldo");

        System.out.println("===============================");
        arvoreVPDeEngenharia.remover("Priscila");
        arvoreVPDeEngenharia.mostrarTodos();

        System.out.println("===============================");
        arvoreQA.atualizarDados("Oswaldo",4000.0, "QA2");
        arvoreQA.mostrarTodos();

    }
}
