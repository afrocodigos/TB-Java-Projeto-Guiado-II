package funcionariosStarlabs;

public class ArvoreBinaria<T extends Comparable<T>> {
    private No<T> raiz;

    private static class No<T extends Comparable<T>> {
        T valor;
        No<T> esquerda;
        No<T> direita;

        No(T valor) {
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }
    }

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private No<T> inserirRecursivo(No<T> no, T valor) {
        if (no == null) {
            return new No<>(valor);
        }

        if (valor.compareTo(no.valor) < 0) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor.compareTo(no.valor) > 0) {
            no.direita = inserirRecursivo(no.direita, valor);
        }

        return no;
    }

    public boolean buscar(T valor) {
        return buscarRecursivo(this.raiz, valor);
    }

    private boolean buscarRecursivo(No<T> no, T valor) {
        if (no == null) {
            return false;
        }

        if (valor.compareTo(no.valor) == 0) {
            return true;
        }

        if (valor.compareTo(no.valor) < 0) {
            return buscarRecursivo(no.esquerda, valor);
        } else {
            return buscarRecursivo(no.direita, valor);
        }
    }

    public void remover(T valor) {
        this.raiz = removerRecursivo(this.raiz, valor);
    }

    private No<T> removerRecursivo(No<T> no, T valor) {
        if (no == null) {
            return null;
        }

        if (valor.compareTo(no.valor) < 0) {
            no.esquerda = removerRecursivo(no.esquerda, valor);
        } else if (valor.compareTo(no.valor) > 0) {
            no.direita = removerRecursivo(no.direita, valor);
        } else {
            if (no.esquerda == null) {
                return no.direita;
            } else if (no.direita == null) {
                return no.esquerda;
            }

            no.valor = menorValor(no.direita);
            no.direita = removerRecursivo(no.direita, no.valor);
        }

        return no;
    }

    private T menorValor(No<T> no) {
        T menorValor = no.valor;
        while (no.esquerda != null) {
            menorValor = no.esquerda.valor;
            no = no.esquerda;
        }
        return menorValor;
    }

    public Colaborador[] getAllNodes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllNodes'");
    }
}