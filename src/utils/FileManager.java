package utils;
import java.io.*;
import java.util.*;
import placeholderCompany.*;


public class FileManager {
    public static void Teste() {
        ArvoreDeFuncionarios arvore = new ArvoreDeFuncionarios<>();
        arvore.adicionar(new Diretor("João", "Diretor", 10000, "123456789"));
        arvore.adicionar(new Pleno("Maria", "Pleno", 5000, "987654321"));
        arvore.adicionar(new Senior("José", "Senior", 7000, "456789123"));
        arvore.adicionar(new Estagiario("Pedro", "Estagiario", 1000, "789123456"));
        arvore.adicionar(new Junior("Ana", "Junior", 2000, "321654987"));
        arvore.mostrarTodos();
        salvarArquivoCSV(arvore, "funcionarios.csv");
        ArvoreDeFuncionarios arvore2 = carregarArquivoCSV("funcionarios.csv");
        arvore2.mostrarTodos();

    }
    public static void salvarArquivoCSV(ArvoreDeFuncionarios arvore, String nomeArquivo) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File(nomeArquivo));
            for (Object funcionario : arvore.getFuncionarios()) {
                if(funcionario instanceof Diretor){
                    Diretor diretor = (Diretor) funcionario;
                    writer.println("DIRETOR, "+ diretor.getNome() + "," + diretor.getCargo() + "," + diretor.getSalario() + "," + diretor.getCpf());
                }else if(funcionario instanceof Pleno){
                    Pleno pleno = (Pleno) funcionario;
                    writer.println("PLENO, "+ pleno.getNome() + "," + pleno.getCargo() + "," + pleno.getSalario() + "," + pleno.getCpf());
                }else if(funcionario instanceof Senior){
                    Senior senior = (Senior) funcionario;
                    writer.println("SENIOR, "+ senior.getNome() + "," + senior.getCargo() + "," + senior.getSalario() + "," + senior.getCpf());
                }else if(funcionario instanceof Estagiario){
                    Estagiario estagiario = (Estagiario) funcionario;
                    writer.println("ESTAGIARIO, "+ estagiario.getNome() + "," + estagiario.getCargo() + "," + estagiario.getSalario() + "," + estagiario.getCpf());
                }else if(funcionario instanceof Junior){
                    Junior junior = (Junior) funcionario;
                    writer.println("JUNIOR, "+ junior.getNome() + "," + junior.getCargo() + "," + junior.getSalario() + "," + junior.getCpf());
                }else if(funcionario instanceof Pleno){
                    Pleno pleno = (Pleno) funcionario;
                    writer.println("PLENO, "+ pleno.getNome() + "," + pleno.getCargo() + "," + pleno.getSalario() + "," + pleno.getCpf());
                }else if (funcionario instanceof Lead){
                    Lead lead = (Lead) funcionario;
                    writer.println("LEAD, "+ lead.getNome() + "," + lead.getCargo() + "," + lead.getSalario() + "," + lead.getCpf());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao salvar arquivo CSV: " + e.getMessage());
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
    public static ArvoreDeFuncionarios carregarArquivoCSV(String nomeArquivo) {
        ArvoreDeFuncionarios arvore = new ArvoreDeFuncionarios<>();
        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));
            boolean b = false;
            while(scanner.hasNextLine()){
                String linha = scanner.nextLine();
                String[] dados = linha.split(",");
                String tipo = dados[0].trim();
                String nome = dados[1].trim();
                String cargo = dados[2].trim();
                double salario = Double.parseDouble(dados[3]);
                String cpf = dados[4];
                if(tipo.equals("DIRETOR")){
                    Diretor diretor = new Diretor(nome, cargo, salario, cpf);
                    arvore.adicionar(diretor, b);
                }else if(tipo.equals("PLENO")){
                    Pleno pleno = new Pleno(nome, cargo, salario, cpf);
                    arvore.adicionar(pleno, b);
                }else if(tipo.equals("SENIOR")){
                    Senior senior = new Senior(nome, cargo, salario, cpf);
                    arvore.adicionar(senior, b);
                }else if(tipo.equals("ESTAGIARIO")){
                    Estagiario estagiario = new Estagiario(nome, cargo, salario, cpf);
                    arvore.adicionar(estagiario, b);
                }else if(tipo.equals("JUNIOR")){
                    Junior junior = new Junior(nome, cargo, salario, cpf);
                    arvore.adicionar(junior, b);
                }else if(tipo.equals("PLENO")){
                    Pleno pleno = new Pleno(nome, cargo, salario, cpf);
                    arvore.adicionar(pleno, b);
                }
            }
            return arvore;
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao carregar arquivo CSV: " + e.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
        Teste();
    }
}
