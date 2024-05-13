package funcionariosBlackcoders;

import java.util.TreeSet;

public class ArvoreDeConsultores<T extends ConsultorBase> {
    private TreeSet<T> consultores;

    public ArvoreDeConsultores() {
        consultores = new TreeSet<>((f1, f2) -> f1.getNome().compareTo(f2.getNome()));
    }

    public void adicionar(T consultor) {
        consultores.add(consultor);
        System.out.println("Consultor adicionado com sucesso!");
    }

    public T buscar(String nome) {

        for (T consultorBase : consultores) {
            if (consultorBase.getNome().equals(nome)) {
                return consultorBase; // retorno o consultor encontrado
            }
        }
        System.out.println("Consultor não existe na nossa base de dados");
        return null;
    }

    public void remover(String nome) {
        T consultorParaRemover = buscar(nome);
        if (consultorParaRemover != null) {
            consultores.remove(consultorParaRemover);
            System.out.println("Consultor " + nome + " removido com sucesso!");
        } else {
            System.out.println(nome + "Não foi encontrado na nossa base de dados");
        }
    }

    public void mostrarTodos() {
        System.out.println("\n==== Lista Consultores ====");
        for (T consultoresBase : consultores) {
            System.out.println(consultoresBase.getNome() + " - " + consultoresBase.getCargo() + " - " + consultoresBase.getSalario());
        }
        System.out.println("============================\n");
    }

    public void atualizarDados(String nome, double novoSalario, String novoCargo) {
        T consultorParaAtualizar = buscar(nome);
        if (consultorParaAtualizar != null) {
            consultorParaAtualizar.setSalario(novoSalario);
            consultorParaAtualizar.setCargo(novoCargo);
            System.out.println("Dados da pessoa consultora atulizados com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada em nossa base!");
        }
    }
}
