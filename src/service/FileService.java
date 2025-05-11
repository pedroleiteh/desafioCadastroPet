package service;

import java.io.*;

public class FileService {

    public void createFormulario() {
        File file = new File("C:\\Users\\Pedro Trabalho\\IdeaProjects\\desafio-cadastro\\data\\formulario.txt");
        if(!file.exists()){
            try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("1 - Qual o nome e sobrenome do pet?\n2 - Qual o tipo do pet (Cachorro/Gato)?\n3 - Qual o sexo do animal?\n4 - Qual endereço e bairro que ele foi encontrado?\n5 - Qual a idade aproximada do pet?\n6 - Qual o peso aproximado do pet?\n7 - Qual a raça do pet?");
                bw.flush();
            } catch (IOException e) {
                System.out.println("Ocorreu um problema na aplicação: " + e.getMessage());
            }
        }
    }
}
