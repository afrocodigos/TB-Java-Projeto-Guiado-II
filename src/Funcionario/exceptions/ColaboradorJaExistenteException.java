package Funcionario.exceptions;

public class ColaboradorJaExistenteException extends GerenciamentoColaboradoresException {
    public ColaboradorJaExistenteException(int id) {
        super("Colaborador com ID " + id + " já existe.");
    }
}
