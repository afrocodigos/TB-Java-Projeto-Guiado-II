package test.java.controller;

import funcionariosBlackMoneySoftware.controller.ValidadorDaSenha;

import java.util.Scanner;

public class ValidadorDaSenhaTest {
    public static void main(String[] args) {

        ValidadorDaSenha senha = new ValidadorDaSenha();

        Scanner sc = new Scanner(System.in);

        String senha0 = "Luc@s159357";
        String senha1 = "Lucas123321@123";
        String senha2 = "12313123";
        String senha3 = "Çois@12313123";


        System.out.println(senha.verificarSenha(senha0));
        System.out.println(senha.verificarSenha(senha1));
        System.out.println(senha.verificarSenha(senha2));
        System.out.println(senha.verificarSenha(senha3));



    }
}
