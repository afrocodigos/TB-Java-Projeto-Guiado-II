package funcionariosStarlabs;

import java.util.ArrayList;

public class Area {
    private String nome;
    private ArrayList<Colaborador> colaboradores;

    public Area(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public Area(String nome) {
        this.nome = nome;
        this.colaboradores = new ArrayList<Colaborador>();
    } // This closing brace was missing

    public String getNome() {
        return nome;
    }

    public ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void addColaborador(Colaborador colaborador) {
        this.colaboradores.add(colaborador);
    }

    public void removeColaborador(Colaborador colaborador) {
        this.colaboradores.remove(colaborador);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setColaboradores(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public Area(String nome, ArrayList<Colaborador> colaboradores) {
        this.nome = nome;
        this.colaboradores = colaboradores;
    }
}