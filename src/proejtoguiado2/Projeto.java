package proejtoguiado2;

public interface Projeto {

    void adicionarDepartamento(Departamento departamento1);

    void adicionarGestor(String string, Usuario gestor);

    void setDiretor(Usuario diretor);

    void listarStatusAtividadesPorDepartamento(Papel gestor);

}
