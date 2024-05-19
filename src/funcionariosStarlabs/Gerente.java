package funcionariosStarlabs;

import java.util.ArrayList; // Ensure this line is present

public class Gerente extends Colaborador {
    private ArrayList<Colaborador> subordinados;

    public Gerente(String nome, String cargo, double salario, Area area) {
        super(nome, cargo, salario, area, null);
        this.subordinados = new ArrayList<Colaborador>();
        // Rest of your class code...
    }

    public ArrayList<Colaborador> getSubordinados() {
        return subordinados;
    }

    public void addSubordinado(Colaborador colaborador) {
        this.subordinados.add(colaborador);
        colaborador.setGerente(this);
    }

    public void removeSubordinado(Colaborador colaborador) {
        this.subordinados.remove(colaborador);
        colaborador.setGerente(null);
    }
}
