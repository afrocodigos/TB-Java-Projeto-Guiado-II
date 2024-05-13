import funcionariosStarlabs.FuncionarioBase;
import funcionariosStarlabs.arvores.ArvoreEngSoftware;
import funcionariosStarlabs.arvores.ArvoreGestor;
import funcionariosStarlabs.controllers.CTO;
import funcionariosStarlabs.controllers.EngenheiroDeSoftware;
import funcionariosStarlabs.controllers.Gestor;

public class Main {

    public static void  main (String[] args){

        CTO cto = new CTO("Gabs", "CTO", 1000.0, "123.456.789-00");

        Gestor<FuncionarioBase> gestor = new Gestor<>("Julio", "Gestor", 6000.0, "987.654.321-00");
        Gestor<FuncionarioBase> gestor2 = new Gestor<>("Jess", "Gestor", 6000.0, "111.222.333-44");
        Gestor<FuncionarioBase> gestor3 = new Gestor<>("João", "Gestor", 6000.0, "555.666.777-88");

        ArvoreGestor arvoreGestor = new ArvoreGestor();
        ArvoreEngSoftware arvoreEngSoftware = new ArvoreEngSoftware();

        EngenheiroDeSoftware engSoftWare = new EngenheiroDeSoftware("Ari", "Desenvolvedor", 3000.0, "222.333.444-55", "backend", "Junior");
        EngenheiroDeSoftware engSoftWare1= new EngenheiroDeSoftware("Leo", "Desenvolvedor", 3000.0, "333.444.555-66", "backend", "Senior");
        
        System.out.println("### OPERAÇÕES EM GESTORES ###");
        operacoesGestores(gestor, gestor2, arvoreGestor, engSoftWare, engSoftWare1);

        System.out.println("\n### OPERAÇÕES EM ENGENHEIROS DE SOFTWARE ###");
        operacoesEngenheirosSoftware(arvoreEngSoftware, engSoftWare, engSoftWare1);

    }

    private static void operacoesGestores(Gestor<FuncionarioBase> gestor, Gestor<FuncionarioBase> gestor2, ArvoreGestor arvoreGestor,
                                          EngenheiroDeSoftware engSoftWare, EngenheiroDeSoftware engSoftWare1) {
        arvoreGestor.adicionar(gestor);
        arvoreGestor.adicionar(gestor2);
        System.out.println("Gestores adicionados com sucesso.");

        System.out.println("Buscando gestores na árvore:");
        arvoreGestor.buscar("Julio");
        arvoreGestor.buscar("Gabs");

        System.out.println("Removendo gestor da árvore:");
        arvoreGestor.remover("Julio");

        System.out.println("Atualizando dados do gestor na árvore:");
        arvoreGestor.atualizarDados("Jess", 8524.54);

        System.out.println("Mostrando todos os gestores na árvore:");
        arvoreGestor.mostrarTodos();

        gestor.adicionarSubordinado(engSoftWare);
        gestor.adicionarSubordinado(engSoftWare1);

        System.out.println("Mostrando subordinados do gestor:");
        gestor.mostrarSubordinados();

        System.out.println("O gestor tem " + gestor.contarSubordinados() + " subordinado(s).");

        gestor.removerSubordinado(engSoftWare1);

        System.out.println("Mostrando subordinados do gestor após remoção:");
        gestor.mostrarSubordinados();
        System.out.println("O gestor tem " + gestor.contarSubordinados() + " subordinado(s).");

        gestor.addBonus();
        System.out.println("Bônus adicionado com sucesso para o gestor e seus subordinados.");
        System.out.println("Novo salário do gestor: " + gestor.getSalario());
    }

    private static void operacoesEngenheirosSoftware(ArvoreEngSoftware arvoreEngSoftware,
                                                     EngenheiroDeSoftware engSoftWare, EngenheiroDeSoftware engSoftWare1) {
        arvoreEngSoftware.adicionar(engSoftWare);
        arvoreEngSoftware.adicionar(engSoftWare1);
        System.out.println("Engenheiros de software adicionados com sucesso.");

        System.out.println("Buscando engenheiros de software na árvore:");
        arvoreEngSoftware.buscar("ari");
        arvoreEngSoftware.buscar("Gabs");

        System.out.println("Removendo engenheiro de software da árvore:");
        arvoreEngSoftware.remover("ari");

        System.out.println("Mostrando todos os engenheiros de software na árvore:");
        arvoreEngSoftware.mostrarTodos();

        engSoftWare.mudarNivel("Pleno");
        engSoftWare.mudarAreaDeAtuacao("frontend");

    }
}
