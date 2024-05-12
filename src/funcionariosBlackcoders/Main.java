package funcionariosBlackcoders;

public class Main {
    public static void main(String[] args) {

        // Adicionando os executivos
        CEO funcionario = new CEO("Hugo", "CEO", 5000, "41643459856", "Executivo");
        CTO funcionario2 = new CTO("Gabriela", "CEO", 5000, "41648859856", "Executivo");

        // Criando árvores de armazenamento
        ArvoreCEO arvoreCEO = new ArvoreCEO();
        ArvoreCTO arvoreCTO = new ArvoreCTO();

        // Adicionando executivos em suas respectivas árvores
        arvoreCEO.adicionar(funcionario);
        arvoreCTO.adicionar(funcionario2);

        // Testando CRUD
        arvoreCEO.buscar("Hugo");
        arvoreCEO.mostrarTodos();
        arvoreCEO.atualizarDados("Hugo", 7000, "CTO");
        arvoreCEO.mostrarTodos();
        arvoreCEO.remover("Hugo");
        arvoreCEO.mostrarTodos();
    }
}
