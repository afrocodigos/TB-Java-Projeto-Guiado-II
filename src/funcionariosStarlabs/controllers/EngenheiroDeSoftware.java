package funcionariosStarlabs.controllers;

import funcionariosStarlabs.FuncionarioBase;

import java.util.Objects;

public class EngenheiroDeSoftware extends FuncionarioBase {

    private String areaDeAtuacao;

    private String nivel;


    public EngenheiroDeSoftware(String nome, String cargo, double salario, String cpf, String areaDeAtuacao, String nivel) {
        super(nome, cargo, salario, cpf);
        this.areaDeAtuacao = areaDeAtuacao;
        this.nivel= nivel;
    }

    public void mudarAreaDeAtuacao(String novaArea) {
        if (novaArea.equalsIgnoreCase("frontend") || novaArea.equalsIgnoreCase("backend") || novaArea.equalsIgnoreCase("fullstack")) {
            areaDeAtuacao = novaArea;
            System.out.println("Área de atuação alterada para: " + novaArea);
        } else {
            System.out.println("Área de atuação inválida. As opções são: Frontend, Backend ou Fullstack.");
        }
    }

    public void mudarNivel(String novoNivel) {
        if (novoNivel.equalsIgnoreCase("Junior") || novoNivel.equalsIgnoreCase("Pleno") || novoNivel.equalsIgnoreCase("Senior")) {
            nivel = novoNivel;
            alterarSalario();
            System.out.println("Área de atuação alterada para: " + novoNivel +"Novo salario= "+ getSalario());
        } else {
            System.out.println("Área de atuação inválida. As opções são: Junior, Pleno ou Senior.");
        }
    }

    private void alterarSalario(){
        double AdPleno = 5000;
        double AdSernior = 10000;

        double novoSalario;

        if(Objects.equals(nivel, "Pleno")){
            novoSalario= getSalario() + AdPleno;
            this.setSalario(novoSalario);
        }

        if(Objects.equals(nivel, "Senior")){
            novoSalario= getSalario() + AdSernior;
            this.setSalario(novoSalario);
        }
    }


    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
