package rhIbalo;
import java.text.DecimalFormat;
import java.util.Random;

public class GeradorFuncionario extends FuncBase{

    public GeradorFuncionario(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);
    }

    // Método para gerar valores aleatórios
    public static GeradorFuncionario gerarFuncionarioAleatorio() {
        Random gerador = new Random();

        // Exemplo: Gerar nome aleatório
        String[] nomes = {"Helena", "Miguel", "Arthur", "Gael", "Heitor", "Alice", "Theo", "Lara", "Davi", "Sophia", "Enzo", "Valentina", "Bernardo", "Isabella", "Rafael", "Laura", "Gabriel", "Manuela", "Pedro", "Júlia"};
        String nomeAleatorio = nomes[gerador.nextInt(nomes.length)];

        // Exemplo: Gerar cargo aleatório
        String[] cargos = {"Analista", "Gerente", "Desenvolvedor", "Coordenador"};
        String cargoAleatorio = cargos[gerador.nextInt(cargos.length)];

        // Exemplo: Gerar salário aleatório entre 2000 e 8000
        double salarioAleatorio = 2000 + gerador.nextDouble() * 6000;

        // Exemplo: Gerar CPF aleatório (apenas para ilustração)
        String cpfAleatorio = String.format("%03d.%03d.%03d-%02d",
                gerador.nextInt(1000), gerador.nextInt(1000),
                gerador.nextInt(1000), gerador.nextInt(100));

        return new GeradorFuncionario(nomeAleatorio, cargoAleatorio, salarioAleatorio, cpfAleatorio);
    }

    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        DecimalFormat formatoSalario = new DecimalFormat("#,##0.00");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + formatoSalario.format(salario));
        System.out.println("CPF: " + cpf);
    }


}
