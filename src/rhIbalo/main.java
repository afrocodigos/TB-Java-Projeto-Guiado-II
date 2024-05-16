package rhIbalo;

import static rhIbalo.GeradorFuncionario.gerarFuncionarioAleatorio;

public class main {
    public static void main(String[] args) {
        GeradorFuncionario funcionarioAleatorio = gerarFuncionarioAleatorio();
        funcionarioAleatorio.exibirInformacoes();
    }
}
