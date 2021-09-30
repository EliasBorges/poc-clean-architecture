package br.com.alura.escola;


public class Email {
    //VALUE OBJECT

    private static final String regexEmail = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    private String endereco;

    public Email(String endereco) {
        if (endereco == null || !endereco.matches(regexEmail)) {
            throw new IllegalArgumentException("Email invalido");
        }

        this.endereco = endereco;

    }
}
