package funcionariosStarlabs;

public class Main {
    public static void main(String[] args) {
        // Criação de áreas
        Area area1 = new Area("Desenvolvimento");
        Area area2 = new Area("Recursos Humanos");
        Area novaArea = new Area("Marketing");

        // Criação de gerentes
        Gerente gerente1 = new Gerente("Andre Gonsalves", "Gerente de Desenvolvimento", 10000.0, area1);
        Gerente gerente2 = new Gerente("Carla Guedes", "Gerente de Recursos Humanos", 8000.0, area2);
        Gerente novoGerente = new Gerente("Ana", "Gerente de Marketing", 8500.0, novaArea);

        // Criação de colaboradores
        Colaborador colaborador1 = new Colaborador();
        Colaborador colaborador2 = new Colaborador("Pedro", "Analista de RH", 4000.0, area2, gerente2);
        Colaborador colaborador3 = new Colaborador("Lucas", "Desenvolvedor", 6000.0, area1, gerente1);
        Colaborador novoColaborador = new Colaborador("João", "Analista de Marketing", 4000.0, novaArea, novoGerente);

        // Criação da árvore binária de colaboradores
        final ArvoreBinaria<Colaborador> arvoreColaboradores = new ArvoreBinaria<>();
        arvoreColaboradores.inserir(colaborador1);
        arvoreColaboradores.inserir(colaborador2);
        arvoreColaboradores.inserir(colaborador3);
        arvoreColaboradores.inserir(novoColaborador);

        // Atualizando as informações de um colaborador existente
        Colaborador colaboradorEncontrado = extracted(colaborador1, arvoreColaboradores);
        if (colaboradorEncontrado != null) {
            colaboradorEncontrado.updateInfo("Ana Silva", "Desenvolvedora Sênior", 6000.0, area1, gerente1);
        } else {
            System.out.println("Colaborador não encontrado.");
        }

        // Testes
        System.out.println("Colaborador encontrado: " + extracted(colaborador2, arvoreColaboradores));
        arvoreColaboradores.remover(colaborador1);
        System.out
                .println();
    }

    Main getNome() {
        // TODO #6 Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

    private static Colaborador extracted(Colaborador colaborador1,
            final ArvoreBinaria<Colaborador> arvoreColaboradores) {
        for (Colaborador col : arvoreColaboradores.getAllNodes()) { // Hypothetical getAllNodes method
            if (col.equals(colaborador1)) {
                return col;
            }
        }
        return null;
    }

    public int compareTo(Colaborador nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
// Classe Colaborador