package Funcionario.structures;

import Funcionario.models.Colaborador;

class Nodo {
    Colaborador colaborador;
    Nodo esquerda, direita;

    public Nodo(Colaborador colaborador) {
        this.colaborador = colaborador;
        esquerda = direita = null;
    }
}

