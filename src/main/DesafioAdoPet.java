package main;

import service.FileService;

public class DesafioAdoPet {
    private static final FileService fs = new FileService();

    public static void main(String[] args) {
        fs.createFormulario();
    }
}
