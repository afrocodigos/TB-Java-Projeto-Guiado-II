package funcionariosBlackcoders;

public class Main {
    public static void main(String[] args) {
        CEO funcionario = new CEO("Hugo", "CEO", 5000, "41643459856", "Executivo");
        CEO funcionario2 = new CEO("Gabriela", "CEO", 5000, "41648859856", "Executivo");

        ArvoreCEO arvoreCEO = new ArvoreCEO();

        arvoreCEO.adicionar(funcionario);
        arvoreCEO.adicionar(funcionario2);
        arvoreCEO.buscar("Hugo");
        arvoreCEO.mostrarTodos();
        arvoreCEO.atualizarDados("Hugo", 7000, "CTO");
        arvoreCEO.mostrarTodos();
        arvoreCEO.remover("Hugo");
        arvoreCEO.mostrarTodos();
    }
}
