package proejtoguiado2;


public class Main {
    public static void main(String[] args) {
        // Criando usuários
        Usuario diretor = new Usuario("Diretor", Papel.DIRETOR);
        Usuario gestor = new Usuario("Gestor", Papel.GESTOR);
        Usuario desenvolvedor = new Usuario("Desenvolvedor", Papel.DESENVOLVEDOR);
        Usuario consultor = new Usuario("Consultor", Papel.CONSULTOR);
        
        // Criando recursos
        Recurso recurso1 = new Recurso("João");
        Recurso recurso2 = new Recurso("Maria");
        
        // Criando atividades
        Atividade atividade1 = new Atividade("Atividade 1");
        atividade1.setStatus(StatusAtividade.EM_ANDAMENTO);
        atividade1.adicionarObservacao("Desenvolvedor", "Estou trabalhando nessa atividade.");
        
        // Criando equipes
        Equipe equipe1 = new Equipe("Equipe 1");
        equipe1.adicionarRecurso(recurso1);
        equipe1.adicionarRecurso(recurso2);
        equipe1.adicionarAtividade(atividade1);
        
        // Criando departamentos
        final Departamento departamento = new Departamento();
Departamento departamento1;
departamento1.adicionarEquipe(equipe1);
        
        // Criando projeto
        final Projeto projeto = new Projeto();
        projeto.adicionarDepartamento(departamento1);
        projeto.adicionarGestor("Gestor", gestor);
        projeto.setDiretor(diretor);
        
        // Exibindo status das atividades
        System.out.println("Status das atividades por departamento:");
        projeto.listarStatusAtividadesPorDepartamento(Papel.GESTOR);
    }
}
