package Funcionario.exceptions;

public class ColaboradorNaoEncontradoException extends GerenciamentoColaboradoresException {
    public ColaboradorNaoEncontradoException(int id) {
        super("Colaborador com ID " + id + " não encontrado.");
    }
}
