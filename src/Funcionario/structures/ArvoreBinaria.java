package Funcionario.structures;

import Funcionario.exceptions.ColaboradorJaExistenteException;
import Funcionario.exceptions.ColaboradorNaoEncontradoException;
import Funcionario.models.Colaborador;

public class ArvoreBinaria {
    private Nodo raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    // Método para inserir um novo colaborador
    public void inserir(Colaborador colaborador) throws ColaboradorJaExistenteException {
        raiz = inserirRec(raiz, colaborador);
    }

    private Nodo inserirRec(Nodo raiz, Colaborador colaborador) throws ColaboradorJaExistenteException {
        if (raiz == null) {
            raiz = new Nodo(colaborador);
            return raiz;
        }

        if (colaborador.getId() < raiz.colaborador.getId())
            raiz.esquerda = inserirRec(raiz.esquerda, colaborador);
        else if (colaborador.getId() > raiz.colaborador.getId())
            raiz.direita = inserirRec(raiz.direita, colaborador);
        else
            throw new ColaboradorJaExistenteException(colaborador.getId());

        return raiz;
    }

    // Método para buscar um colaborador por ID
    public Colaborador buscar(int id) throws ColaboradorNaoEncontradoException {
        Colaborador colaborador = buscarRec(raiz, id);
        if (colaborador == null) {
            throw new ColaboradorNaoEncontradoException(id);
        }
        return colaborador;
    }

    private Colaborador buscarRec(Nodo raiz, int id) {
        if (raiz == null || raiz.colaborador.getId() == id)
            return raiz != null ? raiz.colaborador : null;

        if (raiz.colaborador.getId() > id)
            return buscarRec(raiz.esquerda, id);

        return buscarRec(raiz.direita, id);
    }

    // Método para deletar um colaborador por ID
    public void deletar(int id) throws ColaboradorNaoEncontradoException {
        if (buscar(id) != null) {
            raiz = deletarRec(raiz, id);
        }
    }

    private Nodo deletarRec(Nodo raiz, int id) {
        if (raiz == null) return raiz;

        if (id < raiz.colaborador.getId())
            raiz.esquerda = deletarRec(raiz.esquerda, id);
        else if (id > raiz.colaborador.getId())
            raiz.direita = deletarRec(raiz.direita, id);
        else {
            if (raiz.esquerda == null)
                return raiz.direita;
            else if (raiz.direita == null)
                return raiz.esquerda;

            raiz.colaborador = minValorNodo(raiz.direita);
            raiz.direita = deletarRec(raiz.direita, raiz.colaborador.getId());
        }

        return raiz;
    }

    private Colaborador minValorNodo(Nodo raiz) {
        Colaborador minv = raiz.colaborador;
        while (raiz.esquerda != null) {
            minv = raiz.esquerda.colaborador;
            raiz = raiz.esquerda;
        }
        return minv;
    }

    // Método para atualizar um colaborador
    public void atualizar(int id, Colaborador novoColaborador) throws ColaboradorNaoEncontradoException, ColaboradorJaExistenteException {
        deletar(id);
        inserir(novoColaborador);
    }

    // Método para imprimir a árvore em ordem
    public void emOrdem() {
        emOrdemRec(raiz);
    }

    private void emOrdemRec(Nodo raiz) {
        if (raiz != null) {
            emOrdemRec(raiz.esquerda);
            System.out.println(raiz.colaborador);
            emOrdemRec(raiz.direita);
        }
    }
}
