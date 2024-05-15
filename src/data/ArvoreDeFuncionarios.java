package data;
import interf4ce.ArvoreInterface;
import model.FuncionarioBase;
import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.IOException;
import java.util.logging.FileHandler;


public class ArvoreDeFuncionarios<T extends FuncionarioBase> implements ArvoreInterface<T> {


    private TreeSet<T> funcionarios;

    public ArvoreDeFuncionarios() {
        funcionarios = new TreeSet<>((f1,  f2) -> f1.getNome().compareTo(f2.getNome()));
    }


    private static final Logger LOGGER = Logger.getLogger(ArvoreDeFuncionarios.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("./InformationLogs/", true);
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao configurar o FileHandler", e);
        }
    }


    @Override
    public void adicionar(T funcionario) {
        LOGGER.setLevel(Level.INFO);
        if (!existeFuncionario(funcionario)) {
            funcionarios.add(funcionario);
            System.out.println("Funcionário adicionado com sucesso!");
            LOGGER.info("Funcionário: " + funcionario.getNome() + " adicionado com sucesso: ");
        } else {
            LOGGER.setLevel(Level.WARNING);
            LOGGER.warning("Tentativa de adicionar funcionário: " + funcionario.getNome() + " duplicado");
            System.out.println("Já existe um funcionário com o mesmo nome e cpf na nossa base de dados. ");
        }
    }

    @Override
    public boolean existeFuncionario(T funcionario) {
        return false;
    }

    @Override
    public T buscar(String nome) {
        LOGGER.setLevel(Level.INFO);
        for (T funcionarioBase : funcionarios) {
            if (funcionarioBase.getNome().equals(nome)) {
                LOGGER.info("Funcionário : " + funcionarioBase.getNome() + " encontrado com sucesso. ");
                return funcionarioBase; // retorno o funcionário encontraro
            }
        }
        LOGGER.warning("Funcionario : " + nome + " não encontrado");
        System.out.println("Funcionário não existe na nossa base de dados");
        return null;
    }

    @Override
    public void remover(String nome) {
        LOGGER.setLevel(Level.INFO);
        T funcionarioParaRemover = buscar(nome);
        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
            LOGGER.info("Funcionário: " + nome + "removido com sucesso: ");
            System.out.println("Funcionário: " + nome + "removido com sucesso!");
        } else {
            LOGGER.setLevel(Level.WARNING);
            LOGGER.warning("Tentativa de remover funcionário:"  + nome + "inexistente");
            System.out.println(nome + "Não foi encontrado na nossa base de dados");
        }
    }

    @Override
    public void mostrarTodos() {
        LOGGER.setLevel(Level.INFO);
        LOGGER.info("Listagem de todos os funcionários:");
        System.out.println("\n=== Todos os Funcionário ===");
        for (T funcionarioBase : funcionarios) {
            System.out.println(funcionarioBase.getId() + "-" + funcionarioBase.getNome() + " - " + funcionarioBase.getCargo() + " - " + funcionarioBase.getSalario());
        }
    }

    @Override
    public void atualizarDados(String nome, double novoSalario, String novoCargo) {
        LOGGER.setLevel(Level.INFO);
        T funcionarioParaAtualizar = buscar(nome);
        if (funcionarioParaAtualizar != null) {
            funcionarioParaAtualizar.setSalario(novoSalario);
            funcionarioParaAtualizar.setCargo(novoCargo);
            LOGGER.info("Dados do funcionário: "  + nome + " atualizados com sucesso");
            System.out.println("Dados da pessoa funcionária atulizados com sucesso!");
        } else {
            LOGGER.warning("Tentativa de atualizar dados de funcionário: "  + nome + " inexistente");
            System.out.println("Pessoa não encontrada em nossa base!");
        }
    }
}