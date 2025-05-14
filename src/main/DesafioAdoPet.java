package main;

import service.FileService;
import ui.Ui;

public class DesafioAdoPet {
    private static final FileService fs = new FileService();

    public static void main(String[] args) {
        fs.createFormulario();
        Ui ui = new Ui();
        String chosen = "";
        while (!chosen.equals("6")) {
            chosen = ui.showMenu();
            switch (chosen) {
                case "1":
                    System.out.println("Cadastrar um novo pet");
                    break;
                case "2":
                    System.out.println("Alterar os dados do pet cadastrado");
                    break;
                case "3":
                    System.out.println("Deletar um pet cadastrado");
                    break;
                case "4":
                    System.out.println("Listar todos os pets cadastrados");
                    break;
                case "5":
                    System.out.println("Listar pets por algum critério (idade, nome, raça)");
                    break;
                case "6":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Valor inválido! Selecione uma das 6 opções");
            }
        }
    }
}
