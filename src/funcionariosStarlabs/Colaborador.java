package funcionariosStarlabs;

public class Colaborador implements Comparable<Colaborador> {
    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private Area area;
    private Gerente gerente;

    public static int nextId = 1;

    public Colaborador(String string, String string2, double d, Area area2, Gerente gerente2) {
        // TODO Auto-generated constructor stub
    }

    public Colaborador() {
        // TODO Auto-generated constructor stub
    }

    public void updateInfo(String nome, String cargo, double salario, Area area, Gerente gerente) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.area.removeColaborador(this);
        this.area = area;
        this.area.addColaborador(this);
        this.gerente.removeSubordinado(this);
        this.gerente = gerente;
        this.gerente.addSubordinado(this);
    }

    // Getters, setters, and other methods...

    @Override
    public int compareTo(Colaborador outroColaborador) {
        // Implement the comparison logic here
        // For example, to compare by name:
        return this.getNome().compareTo(outroColaborador.getNome());
    }

    private Colaborador getNome() {
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

    @Override
    public String toString() {
        return "Colaborador [id=" + id + ", nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + ", area="
                + area + ", gerente=" + gerente + "]";
    }

    public void setGerente(Gerente gerente2) {
        this.gerente = gerente2;
    }
}