package ui;

import java.util.Scanner;

public class Ui {

    private static final Scanner sc = new Scanner(System.in);

    public String showMenu() {
        System.out.println("1 - Cadastrar um novo pet\n2 - Alterar os dados do pet cadastrado\n3 - Deletar um pet cadastrado\n4 - Listar todos os pets cadastrados\n5 - Listar pets por algum critério (idade, nome, raça)\n6 - Sair");
        return sc.next();
    }
}
