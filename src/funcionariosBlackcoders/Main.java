package funcionariosBlackcoders;

public class Main {
    public static void main(String[] args) {

        // Adicionando os executivos
        CEO funcionario = new CEO("Hugo", "CEO", 5000, "41643459856", "Executivo");
        CTO funcionario2 = new CTO("Gabriela", "CTO", 5000, "41648859856", "Executivo");

        // Adicionando Coordenador, supervisor e analista de Desenvolvimento
        Coordenador funcionario3 = new Coordenador("Tulio", "Coordenador", 4500, "4164565689", "Desenvolvimento");
        Supervisor funcionario4 = new Supervisor("Guilherme", "Supervisor", 3800, "4884565689", "Desenvolvimento");
        Analista funcionario5 = new Analista("Gustavo", "Analista", 3000, "48845663249", "Desenvolvimento");

        // Adicionando Consultor
        Consultor funcionario6 = new Consultor("Otávio", "Consultor", 2000, "41645869875", "Financeiro BlackCoders");

        // Criando árvores de armazenamento - Filtragem por cargo
        ArvoreCEO arvoreCEO = new ArvoreCEO();
        ArvoreCTO arvoreCTO = new ArvoreCTO();
        ArvoreCoordenador arvoreCoordenador = new ArvoreCoordenador();
        ArvoreSupervisor arvoreSupervisor = new ArvoreSupervisor();
        ArvoreAnalista arvoreAnalista = new ArvoreAnalista();

        // Adicionando executivos em suas respectivas árvores
        arvoreCEO.adicionar(funcionario);
        arvoreCTO.adicionar(funcionario2);
        arvoreCoordenador.adicionar(funcionario3);
        arvoreSupervisor.adicionar(funcionario4);
        arvoreAnalista.adicionar(funcionario5);

        // Testando CRUD
        arvoreCEO.mostrarTodos();
        arvoreCTO.mostrarTodos();
        arvoreCoordenador.mostrarTodos();
        arvoreSupervisor.mostrarTodos();
        arvoreAnalista.mostrarTodos();

        // Criando uma árvore para todos os funcionários cadastrados
        ArvoreDeFuncionarios arvoreTotal = new ArvoreDeFuncionarios<>();
        arvoreTotal.adicionar(funcionario);
        arvoreTotal.adicionar(funcionario2);
        arvoreTotal.adicionar(funcionario3);
        arvoreTotal.adicionar(funcionario4);
        arvoreTotal.adicionar(funcionario5);
        arvoreTotal.mostrarTodos();

        // Criando uma árvore para todos os Consultores cadastrados
        ArvoreDeConsultores arvoreDeConsultores = new ArvoreDeConsultores<>();
        arvoreDeConsultores.adicionar(funcionario6);
        arvoreDeConsultores.mostrarTodos();
    }
}
