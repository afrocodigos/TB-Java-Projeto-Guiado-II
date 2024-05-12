package funcionariosBlackcoders;

public class Main {
    public static void main(String[] args) {

        // Adicionando os executivos
        CEO funcionario = new CEO("Hugo", "CEO", 5000, "41643459856", "Executivo");
        CTO funcionario2 = new CTO("Gabriela", "CTO", 5000, "41648859856", "Executivo");

        // Adicionando Coordenador, supervisor e analista de Desenvolvimento
        Coordenador funcionario3 = new Coordenador("Tulio", "Coordenador", 4500, "4164565689", "Desenvolvimento");

        // Criando árvores de armazenamento
        ArvoreCEO arvoreCEO = new ArvoreCEO();
        ArvoreCTO arvoreCTO = new ArvoreCTO();
        ArvoreCoordenador arvoreCoordenador = new ArvoreCoordenador();

        // Adicionando executivos em suas respectivas árvores
        arvoreCEO.adicionar(funcionario);
        arvoreCTO.adicionar(funcionario2);
        arvoreCoordenador.adicionar(funcionario3);

        // Testando CRUD
        arvoreCEO.mostrarTodos();
        arvoreCTO.mostrarTodos();
        arvoreCoordenador.mostrarTodos();
    }
}
